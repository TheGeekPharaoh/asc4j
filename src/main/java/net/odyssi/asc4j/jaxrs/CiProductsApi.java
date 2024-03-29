package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.DELETE;
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
@Path("/v1/ciProducts")

public interface CiProductsApi {

	@GET
	@Path("/{id}/additionalRepositories")
	@Produces({ "application/json" })

	public Response ciProductsAdditionalRepositoriesGetToManyRelated(@PathParam("id") String id,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[scmProviders]") List<String> fieldsScmProviders,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);

	@GET
	@Path("/{id}/app")
	@Produces({ "application/json" })

	public Response ciProductsAppGetToOneRelated(@PathParam("id") String id,
			@QueryParam("fields[betaLicenseAgreements]") List<String> fieldsBetaLicenseAgreements,
			@QueryParam("fields[betaAppReviewDetails]") List<String> fieldsBetaAppReviewDetails,
			@QueryParam("fields[appClips]") List<String> fieldsAppClips,
			@QueryParam("fields[betaAppLocalizations]") List<String> fieldsBetaAppLocalizations,
			@QueryParam("fields[appInfos]") List<String> fieldsAppInfos,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("fields[inAppPurchases]") List<String> fieldsInAppPurchases,
			@QueryParam("fields[ciProducts]") List<String> fieldsCiProducts,
			@QueryParam("fields[reviewSubmissions]") List<String> fieldsReviewSubmissions,
			@QueryParam("fields[betaGroups]") List<String> fieldsBetaGroups,
			@QueryParam("fields[appPreOrders]") List<String> fieldsAppPreOrders,
			@QueryParam("fields[appPrices]") List<String> fieldsAppPrices,
			@QueryParam("fields[gameCenterEnabledVersions]") List<String> fieldsGameCenterEnabledVersions,
			@QueryParam("fields[endUserLicenseAgreements]") List<String> fieldsEndUserLicenseAgreements,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[appCustomProductPages]") List<String> fieldsAppCustomProductPages,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[appEvents]") List<String> fieldsAppEvents,
			@QueryParam("fields[territories]") List<String> fieldsTerritories,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("limit[betaGroups]") Integer limitBetaGroups,
			@QueryParam("limit[appStoreVersions]") Integer limitAppStoreVersions,
			@QueryParam("limit[preReleaseVersions]") Integer limitPreReleaseVersions,
			@QueryParam("limit[betaAppLocalizations]") Integer limitBetaAppLocalizations,
			@QueryParam("limit[builds]") Integer limitBuilds, @QueryParam("limit[appInfos]") Integer limitAppInfos,
			@QueryParam("limit[appClips]") Integer limitAppClips, @QueryParam("limit[prices]") Integer limitPrices,
			@QueryParam("limit[availableTerritories]") Integer limitAvailableTerritories,
			@QueryParam("limit[inAppPurchases]") Integer limitInAppPurchases,
			@QueryParam("limit[gameCenterEnabledVersions]") Integer limitGameCenterEnabledVersions,
			@QueryParam("limit[appCustomProductPages]") Integer limitAppCustomProductPages,
			@QueryParam("limit[appEvents]") Integer limitAppEvents,
			@QueryParam("limit[reviewSubmissions]") Integer limitReviewSubmissions,
			@QueryParam("include") List<String> include);

	@GET
	@Path("/{id}/buildRuns")
	@Produces({ "application/json" })

	public Response ciProductsBuildRunsGetToManyRelated(@PathParam("id") String id,
			@QueryParam("filter[builds]") List<String> filterBuilds,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[ciBuildRuns]") List<String> fieldsCiBuildRuns,
			@QueryParam("fields[ciWorkflows]") List<String> fieldsCiWorkflows,
			@QueryParam("fields[scmPullRequests]") List<String> fieldsScmPullRequests,
			@QueryParam("fields[ciProducts]") List<String> fieldsCiProducts,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("limit") Integer limit,
			@QueryParam("limit[builds]") Integer limitBuilds, @QueryParam("include") List<String> include);

	@DELETE
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response ciProductsDeleteInstance(@PathParam("id") String id);

	@GET

	@Produces({ "application/json" })

	public Response ciProductsGetCollection(@QueryParam("filter[productType]") List<String> filterProductType,
			@QueryParam("filter[app]") List<String> filterApp,
			@QueryParam("fields[ciProducts]") List<String> fieldsCiProducts, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[ciBuildRuns]") List<String> fieldsCiBuildRuns,
			@QueryParam("fields[ciWorkflows]") List<String> fieldsCiWorkflows,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit[primaryRepositories]") Integer limitPrimaryRepositories);

	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response ciProductsGetInstance(@PathParam("id") String id,
			@QueryParam("fields[ciProducts]") List<String> fieldsCiProducts,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[ciBuildRuns]") List<String> fieldsCiBuildRuns,
			@QueryParam("fields[ciWorkflows]") List<String> fieldsCiWorkflows,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit[primaryRepositories]") Integer limitPrimaryRepositories);

	@GET
	@Path("/{id}/primaryRepositories")
	@Produces({ "application/json" })

	public Response ciProductsPrimaryRepositoriesGetToManyRelated(@PathParam("id") String id,
			@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[scmGitReferences]") List<String> fieldsScmGitReferences,
			@QueryParam("fields[scmProviders]") List<String> fieldsScmProviders,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);

	@GET
	@Path("/{id}/workflows")
	@Produces({ "application/json" })

	public Response ciProductsWorkflowsGetToManyRelated(@PathParam("id") String id,
			@QueryParam("fields[ciXcodeVersions]") List<String> fieldsCiXcodeVersions,
			@QueryParam("fields[ciWorkflows]") List<String> fieldsCiWorkflows,
			@QueryParam("fields[ciMacOsVersions]") List<String> fieldsCiMacOsVersions,
			@QueryParam("fields[ciProducts]") List<String> fieldsCiProducts,
			@QueryParam("fields[scmRepositories]") List<String> fieldsScmRepositories,
			@QueryParam("limit") Integer limit, @QueryParam("include") List<String> include);
}
