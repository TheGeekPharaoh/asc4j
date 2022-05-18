package net.odyssi.asc4j.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import net.odyssi.asc4j.model.AppStoreVersionPhasedReleaseCreateRequest;
import net.odyssi.asc4j.model.AppStoreVersionPhasedReleaseUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appStoreVersionPhasedReleases")

public interface AppStoreVersionPhasedReleasesApi {

	/**
	 * Create an App Store Version Phased Release
	 *
	 * Enable phased release for an App Store version.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createAppStoreVersionPhasedRelease(
			AppStoreVersionPhasedReleaseCreateRequest appStoreVersionPhasedReleaseCreateRequest);

	/**
	 * Delete an App Store Version Phased Release
	 *
	 * Cancel a planned phased release that has not been started.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response deleteAppStoreVersionPhasedRelease(@PathParam("id") String id);

	/**
	 * Modify an App Store Version Phased Release
	 *
	 * Pause or resume a phased release, or immediately release an app.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyAppStoreVersionPhasedRelease(@PathParam("id") String id,
			AppStoreVersionPhasedReleaseUpdateRequest appStoreVersionPhasedReleaseUpdateRequest);
}
