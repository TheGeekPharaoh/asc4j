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
@Path("/v1/ciIssues/{id}")

public interface CiIssuesApi {

	@GET

	@Produces({ "application/json" })

	public Response ciIssuesGetInstance(@PathParam("id") String id,
			@QueryParam("fields[ciIssues]") List<String> fieldsCiIssues);
}
