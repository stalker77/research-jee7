/*
* Copyright (c) 2017 Tander, All Rights Reserved.
*/

package ru.dobrokvashinevgeny.jee.research.jaxrs.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Класс SimpleResource
 */

@Path("/simple-resource")
public class SimpleResource {
	private static final String HELLO_WORLD_FOR_STR = "Hello world for ";

	@Path("{yourName}")
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";" + MediaType.CHARSET_PARAMETER + "=utf-8")
	public String getHelloWorldFor(@PathParam("yourName") String yourName) {
		return HELLO_WORLD_FOR_STR + yourName;
	}
}