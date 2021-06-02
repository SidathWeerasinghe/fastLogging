package com.fastLogging.log4j2.packageTwo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AsyncAppenderClassTwo {
    final Logger logger = LogManager.getLogger(AsyncAppenderClassTwo.class);
    public void methodTwo(String parameter) {

        if(logger.isDebugEnabled()){
            logger.debug("This is log4j2 debug log: " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is  log4j2 info log: " + parameter);
        }

        if(logger.isWarnEnabled()){
            logger.warn("This is log4j2 warn log: " + parameter);
        }

        if(logger.isErrorEnabled()){
            logger.error("This is log4j2 error log: " + parameter);
        }

        if(logger.isTraceEnabled()){
            logger.trace("This is log4j2 trace log: " + parameter);
        }

        if(logger.isFatalEnabled()){
            logger.fatal("This is log4j2 fatal log: " + parameter);
        }


    }
}
