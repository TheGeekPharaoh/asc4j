package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.BetaLicenseAgreementUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/betaLicenseAgreements")

public interface BetaLicenseAgreementsApi {

	/**
	 * List Beta License Agreements
	 *
	 * Find and list beta license agreements for all apps.
	 *
	 */
	@GET

	@Produces({ "application/json" })

	public Response listBetaLicenseAgreement(@QueryParam("filter[app]") List<String> filterApp,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Modify a Beta License Agreement
	 *
	 * Update the text for your beta license agreement.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyBetaLicenseAgreement(@PathParam("id") String id,
			BetaLicenseAgreementUpdateRequest betaLicenseAgreementUpdateRequest);

	/**
	 * Read Beta License Agreement Information
	 *
	 * Get a specific beta license agreement.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readBetaLicenseAgreement(@PathParam("id") String id,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Read the App Information of a Beta License Agreement
	 *
	 * Get the app information for a specific beta license agreement.
	 *
	 */
	@GET
	@Path("/{id}/app")
	@Produces({ "application/json" })

	public Response readBetaLicenseAgreementAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);
}