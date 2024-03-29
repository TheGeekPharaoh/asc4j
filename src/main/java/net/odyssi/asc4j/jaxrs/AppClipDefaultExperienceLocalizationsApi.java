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

import net.odyssi.asc4j.model.AppClipDefaultExperienceLocalizationCreateRequest;
import net.odyssi.asc4j.model.AppClipDefaultExperienceLocalizationUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appClipDefaultExperienceLocalizations")

public interface AppClipDefaultExperienceLocalizationsApi {

	/**
	 * Create the Localized Metadata for a Default App Clip Experience
	 *
	 * Provide localized metadata that appears on the App Clip card of a default App
	 * Clip experience.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createDefaultAppClipExperienceLocalizedMetadata(
			AppClipDefaultExperienceLocalizationCreateRequest appClipDefaultExperienceLocalizationCreateRequest);

	/**
	 * Delete a Default App Clip Experience Localization
	 *
	 * Delete localized metadata that appears on the App Clip card of a default App
	 * Clip experience.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response deleteDefaultAppClipExperienceLocalization(@PathParam("id") String id);

	/**
	 * Modify the Localization for a Default App Clip Experience
	 *
	 * Update localized metadata for a specific default App Clip experience.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyDefaultAppClipExperienceLocalization(@PathParam("id") String id,
			AppClipDefaultExperienceLocalizationUpdateRequest appClipDefaultExperienceLocalizationUpdateRequest);

	/**
	 * Read Localization Information of a Default App Clip Experience
	 *
	 * Get localized metadata that appears on the App Clip card of a specific
	 * default App Clip experience.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readDefaultAppClipExperienceLocalization(@PathParam("id") String id,
			@QueryParam("fields[appClipDefaultExperienceLocalizations]") List<String> fieldsAppClipDefaultExperienceLocalizations,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appClipHeaderImages]") List<String> fieldsAppClipHeaderImages);

	/**
	 * Read App Clip Card Image Information for a Localized Default App Clip
	 * Experience
	 *
	 * Get the image that appears on the App Clip card, specific to a locale, for a
	 * default App Clip experience.
	 *
	 */
	@GET
	@Path("/{id}/appClipHeaderImage")
	@Produces({ "application/json" })

	public Response readLocalizedDefaultAppClipExperienceAppClipCardImage(@PathParam("id") String id,
			@QueryParam("fields[appClipHeaderImages]") List<String> fieldsAppClipHeaderImages,
			@QueryParam("fields[appClipDefaultExperienceLocalizations]") List<String> fieldsAppClipDefaultExperienceLocalizations,
			@QueryParam("include") List<String> include);
}
