/**
 *
 */
package net.odyssi.asc4j.util;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

/**
 * A utility class for generating JWTs for use with the App Store Connect API
 *
 */
public class TokenUtil {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(TokenUtil.class.getName());

	private static final String AUDIENCE = "appstoreconnect-v1";
	/**
	 * Decodes the PEM-encoded string
	 *
	 * @param pem The PEM-encoded string
	 * @return The decoded string
	 * @throws IOException
	 */
	protected static byte[] decodePEM(String pem) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("decodePEM(String) - start"); //$NON-NLS-1$
		}

		Pattern parse = Pattern.compile("(?m)(?s)^---*BEGIN.*---*$(.*)^---*END.*---*$.*");
		String encoded = parse.matcher(pem).replaceFirst("$1");

		byte[] decoded = Base64.getMimeDecoder().decode(encoded);

		if (logger.isDebugEnabled()) {
			logger.debug("decodePEM(String) - end"); //$NON-NLS-1$
		}
		return decoded;
	}

	/**
	 * Loads and returns the {@link PrivateKey} from the PKCS#8-encoded key data
	 *
	 * @param keyData The key data
	 * @return The private key
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeySpecException
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	protected static PrivateKey generatePrivateKey(byte[] keyData)
			throws NoSuchAlgorithmException, InvalidKeySpecException, UnsupportedEncodingException, IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - start"); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - Generating PrivateKey object from key data... - keyData.length={}"); //$NON-NLS-1$
		}

		byte[] decodedPEM = decodePEM(new String(keyData, "UTF-8"));
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodedPEM);
		KeyFactory kf = KeyFactory.getInstance("EC");

		PrivateKey privateKey = kf.generatePrivate(keySpec);

		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - PrivateKey object generated."); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - end"); //$NON-NLS-1$
		}
		return privateKey;
	}

	/**
	 * Generates an authorization token as a String
	 *
	 * @param issuerID       The issuer ID
	 * @param keyID          The key ID
	 * @param privateKeyData The private key data
	 * @return The token string
	 */
	public static final String generateToken(String issuerID, String keyID, byte[] privateKeyData) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, byte[]) - start"); //$NON-NLS-1$
		}

		PrivateKey privateKey = null;
		try {
			privateKey = generatePrivateKey(privateKeyData);
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			logger.error("generateToken(String, String, byte[])", e); //$NON-NLS-1$

			throw new IOException("Unable to generate PrivateKey object", e);
		}

		String token = generateToken(issuerID, keyID, privateKey);

		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, byte[]) - end"); //$NON-NLS-1$
		}
		return token;
	}

	/**
	 * Generates an authorization token as a String
	 *
	 * @param issuerID       The issuer ID
	 * @param keyID          The key ID
	 * @param privateKeyFile The private key file
	 * @return The token string
	 */
	public static final String generateToken(String issuerID, String keyID, File privateKeyFile) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, File) - start"); //$NON-NLS-1$
		}

		FileInputStream fInStream = new FileInputStream(privateKeyFile);
		byte[] buffer = new byte[(int) privateKeyFile.length()];

		fInStream.read(buffer);
		fInStream.close();

		String token = generateToken(issuerID, keyID, buffer);

		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, File) - end"); //$NON-NLS-1$
		}
		return token;
	}

	/**
	 * Generates an authorization token as a String
	 *
	 * @param issuerID The issuer ID
	 * @param keyID    The key ID
	 * @param inStream The input stream for the private key
	 * @return The token string
	 */
	public static final String generateToken(String issuerID, String keyID, InputStream inStream) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, InputStream) - start"); //$NON-NLS-1$
		}

		byte[] keyData = inStream.readAllBytes();

		String token = generateToken(issuerID, keyID, keyData);

		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, InputStream) - end"); //$NON-NLS-1$
		}
		return token;
	}

	/**
	 * Generates an authorization token as a String
	 *
	 * @param issuerID   The issuer ID
	 * @param keyID      The key ID
	 * @param privateKey The private key
	 * @return The token string
	 */
	public static final String generateToken(String issuerID, String keyID, PrivateKey privateKey) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, PrivateKey) - start"); //$NON-NLS-1$
		}

		ECPrivateKey ecKey = (ECPrivateKey) privateKey;
		Algorithm alg = Algorithm.ECDSA256(null, ecKey);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 20);

		Date expiration = cal.getTime();

		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, PrivateKey) - Attempting to sign JWT... - issuerID={}, keyID={}, expiration={}"); //$NON-NLS-1$
		}

		String token = JWT.create().withExpiresAt(expiration).withIssuer(issuerID).withAudience(AUDIENCE)
				.withKeyId(keyID).sign(alg);

		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, PrivateKey) - JWT signed successfully."); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, PrivateKey) - end"); //$NON-NLS-1$
		}
		return token;
	}

	/**
	 * Generates an authorization token as a String
	 *
	 * @param issuerID           The issuer ID
	 * @param keyID              The key ID
	 * @param privateKeyFilePath The path to the private key file
	 * @return The token string
	 */
	public static final String generateToken(String issuerID, String keyID, String privateKeyFilePath)
			throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, String) - start"); //$NON-NLS-1$
		}

		File keyFile = new File(privateKeyFilePath);
		String token = generateToken(issuerID, keyID, keyFile);

		if (logger.isDebugEnabled()) {
			logger.debug("generateToken(String, String, String) - end"); //$NON-NLS-1$
		}
		return token;
	}
}
