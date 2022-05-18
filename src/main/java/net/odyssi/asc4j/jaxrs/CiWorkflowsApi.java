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

import net.odyssi.asc4j.model.CiWorkflowCreateRequest;
import net.odyssi.asc4j.model.CiWorkflowUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/ciWorkflows")

public interface CiWorkflowsApi {

	@GET
	@Path("/{id}/buildRuns")
	@Produces({ "application/json" })

	public Response ciWorkflowsBuildRunsGetToManyRelated(@PathParam("id") String id,
			@QueryParam("filter[builds]") List<String> filterBuilds,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[ciBuildRuns]") List<String> fieldsCiBuildRuns,
			@QueryParam("fields[ciWorkflows]") List<String> fieldsCiWorkflows,
			@QueryParam("fields[scmPullRequests]") List<String> fieldsScmPullRequests,
			@QueryParam("fields[ciProducts]") List<String> fieldsCiProducts,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("limit") Integer limit,
			@QueryParam("limit[builds]") Integer limitBuilds, @QueryParam("include") List<String> include);

	@POST

	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response ciWorkflowsCreateInstance(CiWorkflowCreateRequest ciWorkflowCreateRequest);

	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response ciWorkflowsDeleteInstance(@PathParam("id") String id);

	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response ciWorkflowsGetInstance(@PathParam("id") String id,
			@QueryParam("fields[ciWorkflows]") List<String> fieldsCiWorkflows,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[ciBuildRuns]") List<String> fieldsCiBuildRuns,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories);

	@GET
	@Path("/{id}/repository")
	@Produces({ "application/json" })

	public Response ciWorkflowsRepositoryGetToOneRelated(@PathParam("id") String id,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[scmProviders]") List<String> fieldsScmProviders,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("include") List<String> include);

	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response ciWorkflowsUpdateInstance(@PathParam("id") String id,
			CiWorkflowUpdateRequest ciWorkflowUpdateRequest);
}
