package com.fastLogging.chronicle.writer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChronicleLoggerExample {

    public static void main(String[] args) {
        ChronicleLoggerExample testLog = new ChronicleLoggerExample();
        int i = 0;

        while(true)
        {
            testLog.writeMessageChronicleLogger1(i);
            //testLog.writeMessageChronicleLogger2(i);

            try {
              //  Thread.sleep(200);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void writeMessageChronicleLogger1(int parameter) {

        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle");
        final Logger chronicleLogger1 = LoggerFactory.getLogger("file");


        if(chronicleLogger.isDebugEnabled()){
            chronicleLogger.debug("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger debug log: " + parameter);
            chronicleLogger1.debug("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger debug log: " + parameter);

        }


            chronicleLogger.info("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger info log: " + parameter);
        chronicleLogger1.info("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger info log: " + parameter);


        if(chronicleLogger.isWarnEnabled()) {
            chronicleLogger.warn("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger warn log: " + parameter);
            chronicleLogger1.warn("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger warn log: " + parameter);

        }

        if(chronicleLogger.isErrorEnabled()) {
            chronicleLogger.error("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger error log: " + parameter);
            chronicleLogger1.error("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger error log: " + parameter);

        }

        if(chronicleLogger.isTraceEnabled()) {
            chronicleLogger.trace("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger trace log: " + parameter);
            chronicleLogger1.trace("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger trace log: " + parameter);

        }
    }


    private void writeMessageChronicleLogger2(int parameter) {

        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle2");

        if(chronicleLogger.isDebugEnabled()){
            chronicleLogger.debug("This is ChronicleLogger2 debug log: " + parameter);
        }

        if(chronicleLogger.isInfoEnabled()){
            chronicleLogger.info("This is  ChronicleLogger2 info log: " + parameter);
        }

        if(chronicleLogger.isWarnEnabled()) {
            chronicleLogger.warn("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger warn log: " + parameter);
        }

        if(chronicleLogger.isErrorEnabled()) {
            chronicleLogger.error("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger error log: " + parameter);
        }

        if(chronicleLogger.isTraceEnabled()) {
            chronicleLogger.trace("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger trace log: " + parameter);
        }
    }




}
