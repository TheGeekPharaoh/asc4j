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

import net.odyssi.asc4j.model.RoutingAppCoverageCreateRequest;
import net.odyssi.asc4j.model.RoutingAppCoverageUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/routingAppCoverages")

public interface RoutingAppCoveragesApi {

	/**
	 * Create a Routing App Coverage
	 *
	 * Attach a routing app coverage file to an App Store version.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createRoutingAppCoverage(RoutingAppCoverageCreateRequest routingAppCoverageCreateRequest);

	/**
	 * Delete a Routing App Coverage
	 *
	 * Delete the routing app coverage file that is associated with a version.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response deleteRoutingAppCoverage(@PathParam("id") String id);

	/**
	 * Modify a Routing App Coverage
	 *
	 * Commit a routing app coverage file after uploading it.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyRoutingAppCoverage(@PathParam("id") String id,
			RoutingAppCoverageUpdateRequest routingAppCoverageUpdateRequest);

	/**
	 * Read Routing App Coverage Information
	 *
	 * Get information about the routing app coverage file and its upload and
	 * processing status.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readRoutingAppCoverageInformation(@PathParam("id") String id,
			@QueryParam("fields[routingAppCoverages]") List<String> fieldsRoutingAppCoverages,
			@QueryParam("include") List<String> include);
}