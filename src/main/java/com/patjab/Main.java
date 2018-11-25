package com.patjab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("I am a trace");
        logger.debug("I am a debug");
        logger.info("I am an info");
        logger.warn("I am a warn");
        logger.error("I am an error");
    }
}
