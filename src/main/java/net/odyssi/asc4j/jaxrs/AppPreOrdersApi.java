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

import net.odyssi.asc4j.model.AppPreOrderCreateRequest;
import net.odyssi.asc4j.model.AppPreOrderUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/appPreOrders")

public interface AppPreOrdersApi {

	/**
	 * Create an App Pre-Order
	 *
	 * Turn on pre-order and set the expected app release date.
	 *
	 */
	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response createAppPreOrder(AppPreOrderCreateRequest appPreOrderCreateRequest);

	/**
	 * Delete an App Pre-Order
	 *
	 * Cancel a planned app pre-order that has not begun.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response deleteAppPreOrder(@PathParam("id") String id);

	/**
	 * Modify an App Pre-Order
	 *
	 * Update the release date for your app pre-order.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyAppPreOrder(@PathParam("id") String id, AppPreOrderUpdateRequest appPreOrderUpdateRequest);

	/**
	 * Read App Pre-Order Information
	 *
	 * Get information about your app&#39;s pre-order configuration.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readAppPreOrderInformation(@PathParam("id") String id,
			@QueryParam("fields[appPreOrders]") List<String> fieldsAppPreOrders,
			@QueryParam("include") List<String> include);
}
