package com.howtodoinjava.log4j2.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2HelloWorldExample {
	private static final Logger LOG = LogManager.getLogger(Log4j2HelloWorldExample.class);

	public static void main(String[] args) {

		LOG.debug("This Will Be Printed On Debug");
		LOG.info("This Will Be Printed On Info");
		LOG.warn("This Will Be Printed On Warn");
		LOG.error("This Will Be Printed On Error");
		LOG.fatal("This Will Be Printed On Fatal");
		LOG.info("Appending string: {}.", "Hello, World2");
		
	}
}