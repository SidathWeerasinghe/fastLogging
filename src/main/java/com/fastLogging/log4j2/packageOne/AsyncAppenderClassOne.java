package com.fastLogging.log4j2.packageOne;

import com.fastLogging.log4j2.packageTwo.AsyncAppenderClassTwo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AsyncAppenderClassOne {

    final Logger logger = LogManager.getLogger(AsyncAppenderClassOne.class);

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        AsyncAppenderClassOne testLog = new AsyncAppenderClassOne();
        AsyncAppenderClassTwo classTwo = new AsyncAppenderClassTwo();
            testLog.methodOne("file method 1#");
            classTwo.methodTwo("file method 2#");

    }

    private void methodOne(String parameter) {

        if(logger.isDebugEnabled()) {
            logger.debug("Axiata Digital Lab will make world best software. The future is today. This is log4j2 debug log: " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("Axiata Digital Lab will make world best software. The future is today. This is log4j2 info log: " + parameter);
        }

        if(logger.isWarnEnabled()) {
            logger.warn("Axiata Digital Lab will make world best software. The future is today. This is log4j2 warn log: " + parameter);
        }
        if(logger.isErrorEnabled()) {
            logger.error("Axiata Digital Lab will make world best software. The future is today. This is log4j2 error log: " + parameter);
        }
        if(logger.isTraceEnabled()) {
            logger.trace("Axiata Digital Lab will make world best software. The future is today. This is log4j2 trace log: " + parameter);
        }
        if(logger.isFatalEnabled()) {
            logger.fatal("Axiata Digital Lab will make world best software. The future is today. This is log4j2 fatal log: " + parameter);
        }

    }




}
