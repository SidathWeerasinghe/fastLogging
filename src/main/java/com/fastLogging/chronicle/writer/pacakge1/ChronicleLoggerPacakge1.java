package com.fastLogging.chronicle.writer.pacakge1;


import com.fastLogging.entity.LogEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChronicleLoggerPacakge1 {

    public void writeMessageChronicleLogger1(int parameter, float parameterTwo, String parameterThree, LogEntity logEntity) {

        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle");

        chronicleLogger.debug("Axiata Digital Lab will make world best software. The future is today. " +
                "This is ChronicleLogger debug log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        chronicleLogger.info("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger info log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        chronicleLogger.warn("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger warn log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        chronicleLogger.error("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger error log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);
        chronicleLogger.trace("Axiata Digital Lab will make world best software. The future is today." +
                " This is ChronicleLogger trace log: {} {} {} {}", parameter, parameterTwo, parameterThree, logEntity);

    }
}


// parameter use int, float, String, user define object