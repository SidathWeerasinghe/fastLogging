package com.fastLogging.chronicle.writer.pacakge1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChronicleLoggerPacakge1 {

    public void writeMessageChronicleLogger1(int parameter) {

        final Logger chronicleLogger = LoggerFactory.getLogger(ChronicleLoggerPacakge1.class);



        if(chronicleLogger.isDebugEnabled()){
            chronicleLogger.debug("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger debug log: " + parameter);

        }


        chronicleLogger.info("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger info log: " + parameter);


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
