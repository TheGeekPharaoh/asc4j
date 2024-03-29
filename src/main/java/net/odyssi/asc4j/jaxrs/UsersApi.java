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

import net.odyssi.asc4j.model.UserUpdateRequest;
import net.odyssi.asc4j.model.UserVisibleAppsLinkagesRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/users")

public interface UsersApi {

	/**
	 * Add Visible Apps to a User
	 *
	 * Give a user on your team access to one or more apps.
	 *
	 */
	@POST
	@Path("/{id}/relationships/visibleApps")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response addUserVisibleApps(@PathParam("id") String id,
			UserVisibleAppsLinkagesRequest userVisibleAppsLinkagesRequest);

	/**
	 * List Users
	 *
	 * Get a list of the users on your team.
	 *
	 */
	@GET

	@Produces({ "application/json" })

	public Response listUsers(@QueryParam("filter[roles]") List<String> filterRoles,
			@QueryParam("filter[username]") List<String> filterUsername,
			@QueryParam("filter[visibleApps]") List<String> filterVisibleApps, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[users]") List<String> fieldsUsers, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Get All Visible App Resource IDs for a User
	 *
	 * Get a list of app resource IDs to which a user on your team has access.
	 *
	 */
	@GET
	@Path("/{id}/relationships/visibleApps")
	@Produces({ "application/json" })

	public Response listUserVisibleAppResourceIDs(@PathParam("id") String id, @QueryParam("limit") Integer limit);

	/**
	 * List All Apps Visible to a User
	 *
	 * Get a list of apps that a user on your team can view.
	 *
	 */
	@GET
	@Path("/{id}/visibleApps")
	@Produces({ "application/json" })

	public Response listUserVisibleApps(@PathParam("id") String id, @QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit") Integer limit);

	/**
	 * Modify a User Account
	 *
	 * Change a user&#39;s role, app visibility information, or other account
	 * details.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyUserAccount(@PathParam("id") String id, UserUpdateRequest userUpdateRequest);

	/**
	 * Read User Information
	 *
	 * Get information about a user on your team, such as name, roles, and app
	 * visibility.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readUserInformation(@PathParam("id") String id,
			@QueryParam("fields[users]") List<String> fieldsUsers, @QueryParam("include") List<String> include,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("limit[visibleApps]") Integer limitVisibleApps);

	/**
	 * Remove a User Account
	 *
	 * Remove a user from your team.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response removeUserAccount(@PathParam("id") String id);

	/**
	 * Remove Visible Apps from a User
	 *
	 * Remove a user on your team’s access to one or more apps.
	 *
	 */
	@DELETE
	@Path("/{id}/relationships/visibleApps")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response removeUserVisibleApps(@PathParam("id") String id,
			UserVisibleAppsLinkagesRequest userVisibleAppsLinkagesRequest);

	/**
	 * Replace the List of Visible Apps for a User
	 *
	 * Replace the list of apps a user on your team can see.
	 *
	 */
	@PATCH
	@Path("/{id}/relationships/visibleApps")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response replaceUserVisibleApps(@PathParam("id") String id,
			UserVisibleAppsLinkagesRequest userVisibleAppsLinkagesRequest);
}
