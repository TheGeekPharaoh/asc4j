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
@Path("/v1/ciTestResults/{id}")

public interface CiTestResultsApi {

	@GET

	@Produces({ "application/json" })

	public Response ciTestResultsGetInstance(@PathParam("id") String id,
			@QueryParam("fields[ciTestResults]") List<String> fieldsCiTestResults);
}