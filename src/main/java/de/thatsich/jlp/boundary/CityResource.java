package de.thatsich.jlp.boundary;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.thatsich.jlp.entity.City;


@Path( "cities" )
public class CityResource
{
	@GET
	public String getCity() {
		final City ratingen = City.builder().name( "Ratingen" ).build();

		return ratingen.toString();
	}
}
