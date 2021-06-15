package com.fastLogging.log4j2.packageOne;

import com.fastLogging.entity.LogEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MemoryMapFileAppender {

    final Logger logger = LogManager.getLogger(MemoryMapFileAppender.class);

    public static void main(String args[]) {
        MemoryMapFileAppender appender = new MemoryMapFileAppender();
        for(int j =0; j<=10; j++) {
            LogEntity logEntity = new LogEntity("NewLogger", "Log4j2");
            appender.writeMessageMemoryLogger1(j, 100f,"String Message", logEntity);
        }
    }

    public void writeMessageMemoryLogger1(int parameter, float parameterTwo, String parameterThree, LogEntity logEntity) {

        logger.debug("Axiata Digital Lab will make world best software. The future is today. " +
                "This is ChronicleLogger debug log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        logger.info("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger info log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        logger.warn("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger warn log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        logger.error("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger error log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        logger.trace("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger trace log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);

    }
}
