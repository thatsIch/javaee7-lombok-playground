package de.thatsich.jlp.boundary;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.thatsich.jlp.entity.City;
import lombok.val;


@Path( "cities" )
public class CityResource
{
	@GET
	public String getCity() {
		val ratingenByBuilder = City.builder().name( "Ratingen" ).build();
		val ratingenByConstructor = new City( "ratingen" );
		return ratingenByBuilder.toString() + "::" + ratingenByConstructor.toString();
	}
}
