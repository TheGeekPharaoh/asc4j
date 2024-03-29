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
@Path("/v1/scmRepositories")

public interface ScmRepositoriesApi {

	@GET

	@Produces({ "application/json" })

	public Response scmRepositoriesGetCollection(@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[scmPullRequests]") List<String> fieldsScmPullRequests);

	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response scmRepositoriesGetInstance(@PathParam("id") String id,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[scmPullRequests]") List<String> fieldsScmPullRequests);

	@GET
	@Path("/{id}/gitReferences")
	@Produces({ "application/json" })

	public Response scmRepositoriesGitReferencesGetToManyRelated(@PathParam("id") String id,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);

	@GET
	@Path("/{id}/pullRequests")
	@Produces({ "application/json" })

	public Response scmRepositoriesPullRequestsGetToManyRelated(@PathParam("id") String id,
			@QueryParam("fields[scmPullRequests]") List<String> fieldsScmPullRequests,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);
}
