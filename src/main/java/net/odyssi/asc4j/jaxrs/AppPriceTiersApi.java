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
@Path("/v1/appPriceTiers")

public interface AppPriceTiersApi {

	@GET
	@Path("/{id}/pricePoints")
	@Produces({ "application/json" })

	public Response appPriceTiersPricePointsGetToManyRelated(@PathParam("id") String id,
			@QueryParam("filter[territory]") List<String> filterTerritory,
			@QueryParam("fields[appPriceTiers]") List<String> fieldsAppPriceTiers,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints,
			@QueryParam("fields[territories]") List<String> fieldsTerritories, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include);

	/**
	 * List App Price Tiers
	 *
	 * List all app price tiers available in App Store Connect.
	 *
	 */
	@GET

	@Produces({ "application/json" })

	public Response listAppPriceTiers(@QueryParam("filter[id]") List<String> filterId,
			@QueryParam("fields[appPriceTiers]") List<String> fieldsAppPriceTiers, @QueryParam("limit") Integer limit,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints,
			@QueryParam("limit[pricePoints]") Integer limitPricePoints);

	/**
	 * Read App Price Tier Information
	 *
	 * Read available app price tiers.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({ "application/json" })

	public Response readAppPriceTier(@PathParam("id") String id,
			@QueryParam("fields[appPriceTiers]") List<String> fieldsAppPriceTiers,
			@QueryParam("include") List<String> include,
			@QueryParam("fields[appPricePoints]") List<String> fieldsAppPricePoints,
			@QueryParam("limit[pricePoints]") Integer limitPricePoints);
}
