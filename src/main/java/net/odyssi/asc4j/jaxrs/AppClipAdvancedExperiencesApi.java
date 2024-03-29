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

import net.odyssi.asc4j.model.AppClipAdvancedExperienceCreateRequest;
import net.odyssi.asc4j.model.AppClipAdvancedExperienceUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appClipAdvancedExperiences")

public interface AppClipAdvancedExperiencesApi {

	/**
	 * Create an Advanced App Clip Experience
	 *
	 * Configure a new advanced App Clip experience.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createAdvancedAppClipExperience(
			AppClipAdvancedExperienceCreateRequest appClipAdvancedExperienceCreateRequest);

	/**
	 * Modify and Delete an Advanced App Clip Experience
	 *
	 * Update and delete an existing advanced App Clip experience.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyAdvancedAppClipExperience(@PathParam("id") String id,
			AppClipAdvancedExperienceUpdateRequest appClipAdvancedExperienceUpdateRequest);

	/**
	 * Read Advanced App Clip Experience Information
	 *
	 * Get information about a specific advanced App Clip experience.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readAdvancedAppClipExperienceInformation(@PathParam("id") String id,
			@QueryParam("fields[appClipAdvancedExperiences]") List<String> fieldsAppClipAdvancedExperiences,
			@QueryParam("include") List<String> include,
			@QueryParam("limit[localizations]") Integer limitLocalizations);
}
