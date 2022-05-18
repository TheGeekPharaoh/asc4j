package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.IdfaDeclarationCreateRequest;
import net.odyssi.asc4j.model.IdfaDeclarationUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/idfaDeclarations")

public interface IdfaDeclarationsApi {

	/**
	 * Create an IDFA Declaration
	 *
	 * Declare the IDFA usage for an App Store version.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createIDFADeclaration(IdfaDeclarationCreateRequest idfaDeclarationCreateRequest);

	/**
	 * Delete an IDFA Declaration
	 *
	 * Delete the IDFA declaration that is associated with a version.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response deleteIDFADeclaration(@PathParam("id") String id);

	/**
	 * Modify an IDFA Declaration
	 *
	 * Update your declared IDFA usage.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyIDFADeclaration(@PathParam("id") String id,
			IdfaDeclarationUpdateRequest idfaDeclarationUpdateRequest);
}