package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/scmProviders")

public interface ScmProvidersApi {

	@GET

	@Produces({ "application/json" })

	public Response scmProvidersGetCollection(@QueryParam("fields[scmProviders]") List<String> fieldsScmProviders,
			@QueryParam("limit") Integer limit,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories);

	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response scmProvidersGetInstance(@PathParam("id") String id,
			@QueryParam("fields[scmProviders]") List<String> fieldsScmProviders,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories);

	@GET
	@Path("/{id}/repositories")
	@Produces({ "application/json" })

	public Response scmProvidersRepositoriesGetToManyRelated(@PathParam("id") String id,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[scmProviders]") List<String> fieldsScmProviders,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);
}
