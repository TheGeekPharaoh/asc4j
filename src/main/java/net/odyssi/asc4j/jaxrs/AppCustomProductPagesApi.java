package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.AppCustomProductPageCreateRequest;
import net.odyssi.asc4j.model.AppCustomProductPageUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appCustomProductPages")

public interface AppCustomProductPagesApi {

	@GET
	@Path("/{id}/appCustomProductPageVersions")
	@Produces({ "application/json" })

	public Response appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated(@PathParam("id") String id,
			@QueryParam("filter[state]") List<String> filterState,
			@QueryParam("fields[appCustomProductPageLocalizations]") List<String> fieldsAppCustomProductPageLocalizations,
			@QueryParam("fields[appCustomProductPageVersions]") List<String> fieldsAppCustomProductPageVersions,
			@QueryParam("fields[appCustomProductPages]") List<String> fieldsAppCustomProductPages,
			@QueryParam("limit") Integer limit,
			@QueryParam("limit[appCustomProductPageLocalizations]") Integer limitAppCustomProductPageLocalizations,
			@QueryParam("include") List<String> include);

	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response appCustomProductPagesCreateInstance(
			AppCustomProductPageCreateRequest appCustomProductPageCreateRequest);

	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response appCustomProductPagesDeleteInstance(@PathParam("id") String id);

	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response appCustomProductPagesGetInstance(@PathParam("id") String id,
			@QueryParam("fields[appCustomProductPages]") List<String> fieldsAppCustomProductPages,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appCustomProductPageVersions]") List<String> fieldsAppCustomProductPageVersions,
			@QueryParam("limit[appCustomProductPageVersions]") Integer limitAppCustomProductPageVersions);

	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response appCustomProductPagesUpdateInstance(@PathParam("id") String id,
			AppCustomProductPageUpdateRequest appCustomProductPageUpdateRequest);
}