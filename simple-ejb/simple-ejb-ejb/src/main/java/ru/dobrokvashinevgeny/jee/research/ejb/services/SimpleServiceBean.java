/*
* Copyright (c) 2017 Tander, All Rights Reserved.
*/

package ru.dobrokvashinevgeny.jee.research.ejb.services;

import javax.ejb.Stateless;

/**
 * Класс SimpleServiceBean
 */
@Stateless
public class SimpleServiceBean {
	private static final String HELLO_WORLD_STR = "Hello World ";

	public String helloWorldTo(String yourName) {
		return HELLO_WORLD_STR + yourName;
	}
}