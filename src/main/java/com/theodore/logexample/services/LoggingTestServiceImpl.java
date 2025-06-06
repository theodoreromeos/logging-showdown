package com.theodore.logexample.services;

import org.springframework.stereotype.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class LoggingTestServiceImpl implements LoggingTestService {

    private static final Logger logger = LogManager.getLogger(LoggingTestServiceImpl.class);

    @Override
    public String loggingTest() {
        logger.fatal("---------------------------");
        logger.fatal("        Version 1.0.0      ");
        logger.fatal("---------------------------");

        logger.trace("+++  TRACE  +++");
        logger.debug("###  DEBUG  ###");
        logger.info("***  INFO  ***");
        logger.warn("!!!  WARNING  !!!");
        logger.error("===  ERROR  ===");
        logger.fatal("---  FATAL  ---");

        return "Everything ok.";
    }

}
