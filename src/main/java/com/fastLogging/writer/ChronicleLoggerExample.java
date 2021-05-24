package com.fastLogging.writer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChronicleLoggerExample {

    public static void main(String[] args) {
        ChronicleLoggerExample testLog = new ChronicleLoggerExample();
        int i = 0;

        while (true)
        {
            testLog.writeMessageChronicleLogger1("file Location 1#");
            testLog.writeMessageChronicleLogger2("file Location 2#");
            try {
                Thread.sleep(10);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void writeMessageChronicleLogger1(String parameter) {
        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle");
        if(chronicleLogger.isDebugEnabled()){
            chronicleLogger.debug("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger debug log: " + parameter);
        }

        if(chronicleLogger.isInfoEnabled()){
            chronicleLogger.info("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger info log: " + parameter);
        }

        chronicleLogger.warn("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger warn log: " + parameter);
        chronicleLogger.error("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger error log: " + parameter);
        chronicleLogger.trace("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger trace log: " + parameter);

    }


    private void writeMessageChronicleLogger2(String parameter) {
        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle2");
        if(chronicleLogger.isDebugEnabled()){
            chronicleLogger.debug("This is ChronicleLogger2 debug log: " + parameter);
        }

        if(chronicleLogger.isInfoEnabled()){
            chronicleLogger.info("This is  ChronicleLogger2 info log: " + parameter);
        }

        chronicleLogger.warn("This is ChronicleLogger2 warn log: " + parameter);
        chronicleLogger.error("This is ChronicleLogger2 error log: " + parameter);
        chronicleLogger.trace("This is ChronicleLogger2 trace log: " + parameter);

    }




}
