package net.odyssi.asc4j.jaxrs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
@Path("/v1/financeReports")

public interface FinanceReportsApi {

	/**
	 * Download Finance Reports
	 *
	 * Download finance reports filtered by your specified criteria.
	 *
	 */
	@GET

	@Produces({ "application/a-gzip", "application/json" })

	public Response downloadFinanceReports(@QueryParam("filter[regionCode]") List<String> filterRegionCode,
			@QueryParam("filter[reportDate]") List<String> filterReportDate,
			@QueryParam("filter[reportType]") List<String> filterReportType,
			@QueryParam("filter[vendorNumber]") List<String> filterVendorNumber);
}