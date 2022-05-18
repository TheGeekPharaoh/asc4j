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

import net.odyssi.asc4j.model.BuildAppEncryptionDeclarationLinkageRequest;
import net.odyssi.asc4j.model.BuildBetaGroupsLinkagesRequest;
import net.odyssi.asc4j.model.BuildIndividualTestersLinkagesRequest;
import net.odyssi.asc4j.model.BuildUpdateRequest;

/**
 * App Store Connect API (Enhanced)
 *
 * <p>
 * No description provided (generated by Openapi Generator
 * https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/v1/builds")

public interface BuildsApi {

	/**
	 * Add Access for Beta Groups to a Build
	 *
	 * Add or create a beta group to a build to enable testing.
	 *
	 */
	@POST
	@Path("/{id}/relationships/betaGroups")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response addBuildBetaGroupsAccess(@PathParam("id") String id,
			BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest);

	/**
	 * Assign the App Encryption Declaration for a Build
	 *
	 * Assign an app encryption declaration to a build.
	 *
	 */
	@PATCH
	@Path("/{id}/relationships/appEncryptionDeclaration")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response assignBuildAppEncryptionDeclaration(@PathParam("id") String id,
			BuildAppEncryptionDeclarationLinkageRequest buildAppEncryptionDeclarationLinkageRequest);

	/**
	 * Assign Individual Testers to a Build
	 *
	 * Enable a beta tester who is not a part of a beta group to test a build.
	 *
	 */
	@POST
	@Path("/{id}/relationships/individualTesters")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response assignBuildIndividualTesters(@PathParam("id") String id,
			BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest);

	/**
	 * Get the App Encryption Declaration ID for a Build
	 *
	 * Get the beta app encryption declaration resource ID associated with a build.
	 *
	 */
	@GET
	@Path("/{id}/relationships/appEncryptionDeclaration")
	@Produces({ "application/json" })

	public Response getBuildAppEncryptionDeclarationID(@PathParam("id") String id);

	/**
	 * Get All Resource IDs of Individual Testers for a Build
	 *
	 * Get a list of resource IDs of individual testers associated with a build.
	 *
	 */
	@GET
	@Path("/{id}/relationships/individualTesters")
	@Produces({ "application/json" })

	public Response getBuildIndividualTesterIDs(@PathParam("id") String id, @QueryParam("limit") Integer limit);

	/**
	 * Get Power and Performance Metrics for a Build
	 *
	 * Get the performance and power metrics data for a specific build.
	 *
	 */
	@GET
	@Path("/{id}/perfPowerMetrics")
	@Produces({ "application/vnd.apple.xcode-metrics+json", "application/json" })

	public Response getBuildPowerAndPerformanceMetrics(@PathParam("id") String id,
			@QueryParam("filter[deviceType]") List<String> filterDeviceType,
			@QueryParam("filter[metricType]") List<String> filterMetricType,
			@QueryParam("filter[platform]") List<String> filterPlatform);

	/**
	 * List All Beta Build Localizations of a Build
	 *
	 * Get a list of localized beta test information for a specific build.
	 *
	 */
	@GET
	@Path("/{id}/betaBuildLocalizations")
	@Produces({ "application/json" })

	public Response listBuildBetaBuildLocalizations(@PathParam("id") String id,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("limit") Integer limit);

	/**
	 * List All Diagnostic Signatures for a Build
	 *
	 * List the aggregate backtrace signatures captured for a specific build.
	 *
	 */
	@GET
	@Path("/{id}/diagnosticSignatures")
	@Produces({ "application/json" })

	public Response listBuildDiagnosticSignatures(@PathParam("id") String id,
			@QueryParam("filter[diagnosticType]") List<String> filterDiagnosticType,
			@QueryParam("fields[diagnosticSignatures]") List<String> fieldsDiagnosticSignatures,
			@QueryParam("limit") Integer limit);

	/**
	 * List All Icons for a Build
	 *
	 * List all the icons for various platforms delivered with a build.
	 *
	 */
	@GET
	@Path("/{id}/icons")
	@Produces({ "application/json" })

	public Response listBuildIcons(@PathParam("id") String id,
			@QueryParam("fields[buildIcons]") List<String> fieldsBuildIcons, @QueryParam("limit") Integer limit);

	/**
	 * List All Individual Testers for a Build
	 *
	 * Get a list of beta testers individually assigned to a build.
	 *
	 */
	@GET
	@Path("/{id}/individualTesters")
	@Produces({ "application/json" })

	public Response listBuildIndividualTesters(@PathParam("id") String id,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters, @QueryParam("limit") Integer limit);

	/**
	 * List Builds
	 *
	 * Find and list builds for all apps in App Store Connect.
	 *
	 */
	@GET

	@Produces({ "application/json" })

	public Response listBuilds(
			@QueryParam("filter[betaAppReviewSubmission.betaReviewState]") List<String> filterBetaAppReviewSubmissionBetaReviewState,
			@QueryParam("filter[buildAudienceType]") List<String> filterBuildAudienceType,
			@QueryParam("filter[expired]") List<String> filterExpired,
			@QueryParam("filter[preReleaseVersion.platform]") List<String> filterPreReleaseVersionPlatform,
			@QueryParam("filter[preReleaseVersion.version]") List<String> filterPreReleaseVersionVersion,
			@QueryParam("filter[processingState]") List<String> filterProcessingState,
			@QueryParam("filter[usesNonExemptEncryption]") List<String> filterUsesNonExemptEncryption,
			@QueryParam("filter[version]") List<String> filterVersion,
			@QueryParam("filter[app]") List<String> filterApp,
			@QueryParam("filter[appStoreVersion]") List<String> filterAppStoreVersion,
			@QueryParam("filter[betaGroups]") List<String> filterBetaGroups,
			@QueryParam("filter[preReleaseVersion]") List<String> filterPreReleaseVersion,
			@QueryParam("filter[id]") List<String> filterId, @QueryParam("sort") List<String> sort,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[diagnosticSignatures]") List<String> fieldsDiagnosticSignatures,
			@QueryParam("fields[buildIcons]") List<String> fieldsBuildIcons,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[perfPowerMetrics]") List<String> fieldsPerfPowerMetrics,
			@QueryParam("limit[betaBuildLocalizations]") Integer limitBetaBuildLocalizations,
			@QueryParam("limit[betaGroups]") Integer limitBetaGroups,
			@QueryParam("limit[buildBundles]") Integer limitBuildBundles,
			@QueryParam("limit[icons]") Integer limitIcons,
			@QueryParam("limit[individualTesters]") Integer limitIndividualTesters);

	/**
	 * Modify a Build
	 *
	 * Expire a build or change its encryption exemption setting.
	 *
	 */
	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response modifyBuild(@PathParam("id") String id, BuildUpdateRequest buildUpdateRequest);

	/**
	 * Read the App Encryption Declaration of a Build
	 *
	 * Read an app encryption declaration associated with a specific build.
	 *
	 */
	@GET
	@Path("/{id}/appEncryptionDeclaration")
	@Produces({ "application/json" })

	public Response readBuildAppEncryptionDeclaration(@PathParam("id") String id,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations);

	/**
	 * Read the App Information of a Build
	 *
	 * Get the app information for a specific build.
	 *
	 */
	@GET
	@Path("/{id}/app")
	@Produces({ "application/json" })

	public Response readBuildAppInformation(@PathParam("id") String id,
			@QueryParam("fields[apps]") List<String> fieldsApps);

	/**
	 * Read the App Store Version Information of a Build
	 *
	 * Get the App Store version of a specific build.
	 *
	 */
	@GET
	@Path("/{id}/appStoreVersion")
	@Produces({ "application/json" })

	public Response readBuildAppStoreVersionInformation(@PathParam("id") String id,
			@QueryParam("fields[appStoreVersionExperiments]") List<String> fieldsAppStoreVersionExperiments,
			@QueryParam("fields[ageRatingDeclarations]") List<String> fieldsAgeRatingDeclarations,
			@QueryParam("fields[appStoreVersionSubmissions]") List<String> fieldsAppStoreVersionSubmissions,
			@QueryParam("fields[appStoreReviewDetails]") List<String> fieldsAppStoreReviewDetails,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[idfaDeclarations]") List<String> fieldsIdfaDeclarations,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[routingAppCoverages]") List<String> fieldsRoutingAppCoverages,
			@QueryParam("fields[appClipDefaultExperiences]") List<String> fieldsAppClipDefaultExperiences,
			@QueryParam("fields[appStoreVersionPhasedReleases]") List<String> fieldsAppStoreVersionPhasedReleases,
			@QueryParam("fields[builds]") List<String> fieldsBuilds,
			@QueryParam("fields[appStoreVersionLocalizations]") List<String> fieldsAppStoreVersionLocalizations,
			@QueryParam("limit[appStoreVersionLocalizations]") Integer limitAppStoreVersionLocalizations,
			@QueryParam("limit[appStoreVersionExperiments]") Integer limitAppStoreVersionExperiments,
			@QueryParam("include") List<String> include);

	/**
	 * Read the Beta App Review Submission of a Build
	 *
	 * Get the beta app review submission status for a specific build.
	 *
	 */
	@GET
	@Path("/{id}/betaAppReviewSubmission")
	@Produces({ "application/json" })

	public Response readBuildBetaAppReviewSubmission(@PathParam("id") String id,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions);

	/**
	 * Read the Build Beta Details Information of a Build
	 *
	 * Get the beta test details for a specific build.
	 *
	 */
	@GET
	@Path("/{id}/buildBetaDetail")
	@Produces({ "application/json" })

	public Response readBuildBetaDetails(@PathParam("id") String id,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails);

	/**
	 * Read Build Information
	 *
	 * Get information about a specific build.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readBuildInformation(@PathParam("id") String id,
			@QueryParam("fields[builds]") List<String> fieldsBuilds, @QueryParam("include") List<String> include,
			@QueryParam("fields[diagnosticSignatures]") List<String> fieldsDiagnosticSignatures,
			@QueryParam("fields[buildIcons]") List<String> fieldsBuildIcons,
			@QueryParam("fields[buildBetaDetails]") List<String> fieldsBuildBetaDetails,
			@QueryParam("fields[betaAppReviewSubmissions]") List<String> fieldsBetaAppReviewSubmissions,
			@QueryParam("fields[betaTesters]") List<String> fieldsBetaTesters,
			@QueryParam("fields[appStoreVersions]") List<String> fieldsAppStoreVersions,
			@QueryParam("fields[betaBuildLocalizations]") List<String> fieldsBetaBuildLocalizations,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions,
			@QueryParam("fields[appEncryptionDeclarations]") List<String> fieldsAppEncryptionDeclarations,
			@QueryParam("fields[apps]") List<String> fieldsApps,
			@QueryParam("fields[perfPowerMetrics]") List<String> fieldsPerfPowerMetrics,
			@QueryParam("limit[betaBuildLocalizations]") Integer limitBetaBuildLocalizations,
			@QueryParam("limit[betaGroups]") Integer limitBetaGroups,
			@QueryParam("limit[buildBundles]") Integer limitBuildBundles,
			@QueryParam("limit[icons]") Integer limitIcons,
			@QueryParam("limit[individualTesters]") Integer limitIndividualTesters);

	/**
	 * Read the Prerelease Version of a Build
	 *
	 * Get the prerelease version for a specific build.
	 *
	 */
	@GET
	@Path("/{id}/preReleaseVersion")
	@Produces({ "application/json" })

	public Response readBuildPrereleaseVersion(@PathParam("id") String id,
			@QueryParam("fields[preReleaseVersions]") List<String> fieldsPreReleaseVersions);

	/**
	 * Remove Access for Beta Groups to a Build
	 *
	 * Remove access to a specific build for all beta testers in one or more beta
	 * groups.
	 *
	 */
	@DELETE
	@Path("/{id}/relationships/betaGroups")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response removeBuildBetaGroupsAccess(@PathParam("id") String id,
			BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest);

	/**
	 * Remove Individual Testers from a Build
	 *
	 * Remove access to test a specific build from one or more individually assigned
	 * testers.
	 *
	 */
	@DELETE
	@Path("/{id}/relationships/individualTesters")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })

	public Response removeBuildIndividualTesters(@PathParam("id") String id,
			BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest);
}
