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

import net.odyssi.asc4j.model.AppPreviewSetAppPreviewsLinkagesRequest;
import net.odyssi.asc4j.model.AppPreviewSetCreateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appPreviewSets")

public interface AppPreviewSetsApi {

	/**
	 * Create an App Preview Set
	 *
	 * Add a new app preview set to an App Store version localization for a specific
	 * app preview type and display size.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createAppPreviewSet(AppPreviewSetCreateRequest appPreviewSetCreateRequest);

	/**
	 * Delete an App Preview Set
	 *
	 * Delete an app preview set and all of its previews.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response deleteAppPreviewSet(@PathParam("id") String id);

	/**
	 * Get All App Preview IDs for an App Preview Set
	 *
	 * Get the ordered app preview IDs in a preview set.
	 *
	 */
	@GET
	@Path("/{id}/relationships/appPreviews")
	@Produces({ "application/json" })

	public Response getAppPreviewSetAppPreviewIDs(@PathParam("id") String id, @QueryParam("limit") Integer limit);

	/**
	 * List All App Previews for an App Preview Set
	 *
	 * List all ordered app previews in a preview set.
	 *
	 */
	@GET
	@Path("/{id}/appPreviews")
	@Produces({ "application/json" })

	public Response listAppPreviewSetAppPreviews(@PathParam("id") String id,
			@QueryParam("fields[appPreviews]") List<String> fieldsAppPreviews,
			@QueryParam("fields[appPreviewSets]") List<String> fieldsAppPreviewSets, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * Read App Preview Set Information
	 *
	 * Get an app preview set that includes its display target, language, and the
	 * previews it contains.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readAppPreviewSetInformation(@PathParam("id") String id,
			@QueryParam("fields[appPreviewSets]") List<String> fieldsAppPreviewSets,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appPreviews]") List<String> fieldsAppPreviews,
			@QueryParam("limit[appPreviews]") Integer limitAppPreviews);

	/**
	 * Replace All App Previews for an App Preview Set
	 *
	 * Change the order of the app previews in a preview set.
	 *
	 */
	@PATCH
	@Path("/{id}/relationships/appPreviews")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response updateAppPreviewSetAppPreviews(@PathParam("id") String id,
			AppPreviewSetAppPreviewsLinkagesRequest appPreviewSetAppPreviewsLinkagesRequest);
}