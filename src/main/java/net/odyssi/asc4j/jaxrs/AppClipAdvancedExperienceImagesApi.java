package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.AppClipAdvancedExperienceImageCreateRequest;
import net.odyssi.asc4j.model.AppClipAdvancedExperienceImageUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appClipAdvancedExperienceImages")

public interface AppClipAdvancedExperienceImagesApi {

	/**
	 * Create an App Clip Card Image for an Advanced App Clip Experience
	 *
	 * Reserve an image asset that appears on the App Clip card of an advanced App
	 * Clip experience.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createAdvancedAppClipExperienceAppClipCardImage(
			AppClipAdvancedExperienceImageCreateRequest appClipAdvancedExperienceImageCreateRequest);

	/**
	 * Modify the Image for an Advanced App Clip Experience
	 *
	 * Update image information or commit the image asset of an advanced App Clip
	 * experience.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyAdvancedAppClipExperienceImage(@PathParam("id") String id,
			AppClipAdvancedExperienceImageUpdateRequest appClipAdvancedExperienceImageUpdateRequest);

	/**
	 * Read Image Information for an Advanced App Clip Experience
	 *
	 * Get information about the image that appears on the App Clip card of an
	 * advanced App Clip experience.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readAdvancedAppClipExperienceImage(@PathParam("id") String id,
			@QueryParam("fields[appClipAdvancedExperienceImages]") List<String> fieldsAppClipAdvancedExperienceImages);
}
