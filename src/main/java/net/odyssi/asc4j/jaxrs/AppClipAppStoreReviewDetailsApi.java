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

import net.odyssi.asc4j.model.AppClipAppStoreReviewDetailCreateRequest;
import net.odyssi.asc4j.model.AppClipAppStoreReviewDetailUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appClipAppStoreReviewDetails")

public interface AppClipAppStoreReviewDetailsApi {

	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response appClipAppStoreReviewDetailsCreateInstance(
			AppClipAppStoreReviewDetailCreateRequest appClipAppStoreReviewDetailCreateRequest);

	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response appClipAppStoreReviewDetailsGetInstance(@PathParam("id") String id,
			@QueryParam("fields[appClipAppStoreReviewDetails]") List<String> fieldsAppClipAppStoreReviewDetails,
			@QueryParam("include") List<String> include);

	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response appClipAppStoreReviewDetailsUpdateInstance(@PathParam("id") String id,
			AppClipAppStoreReviewDetailUpdateRequest appClipAppStoreReviewDetailUpdateRequest);
}