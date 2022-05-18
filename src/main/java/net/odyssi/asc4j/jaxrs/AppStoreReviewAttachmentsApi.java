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

import net.odyssi.asc4j.model.AppStoreReviewAttachmentCreateRequest;
import net.odyssi.asc4j.model.AppStoreReviewAttachmentUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appStoreReviewAttachments")

public interface AppStoreReviewAttachmentsApi {

	/**
	 * Commit an App Store Review Attachment
	 *
	 * Commit an app screenshot after uploading it to the App Store.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response commitAppStoreReviewAttachment(@PathParam("id") String id,
			AppStoreReviewAttachmentUpdateRequest appStoreReviewAttachmentUpdateRequest);

	/**
	 * Create an App Store Review Attachment
	 *
	 * Attach a document for App Review to an App Store version.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createAppStoreReviewAttachment(
			AppStoreReviewAttachmentCreateRequest appStoreReviewAttachmentCreateRequest);

	/**
	 * Delete an App Store Review Attachment
	 *
	 * Remove an attachment before you send your app to App Review.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response deleteAppStoreReviewAttachment(@PathParam("id") String id);

	/**
	 * Read App Store Review Attachment Information
	 *
	 * Get information about an App Store review attachment and its upload and
	 * processing status.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readAppStoreReviewAttachmentInformation(@PathParam("id") String id,
			@QueryParam("fields[appStoreReviewAttachments]") List<String> fieldsAppStoreReviewAttachments,
			@QueryParam("include") List<String> include);
}