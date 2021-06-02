package com.fastLogging.chronicle.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChronicleLoggerMultipleThreadExample {

    public static void main(String args[]) {
        ChronicleLoggerMultipleThreadExample chronicleLoggerMultipleThreadExample = new ChronicleLoggerMultipleThreadExample();
        for(int j=0; j<=4; j++) {
            chronicleLoggerMultipleThreadExample.executorServices();
        }
    }

    public void ThreadsNRunnable() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            final Logger chronicleLogger = LoggerFactory.getLogger("chronicle3");

                if (chronicleLogger.isDebugEnabled()) {
                    chronicleLogger.debug("This is ChronicleLogger3 debug log threadName: " + threadName);
                }
            if (chronicleLogger.isInfoEnabled()) {
                chronicleLogger.info("This is  ChronicleLogger3 info log threadName: " + threadName);
            }
            if (chronicleLogger.isWarnEnabled()) {
                chronicleLogger.warn("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger warn log: " + threadName);
            }

            if (chronicleLogger.isErrorEnabled()) {
                chronicleLogger.error("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger error log: " + threadName);
            }

            if (chronicleLogger.isTraceEnabled()) {
                chronicleLogger.trace("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger trace log: " + threadName);
            }
        };
        task.run();
        Thread thread = new Thread(task);
        thread.start();
    }

    public void executorServices() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle");
        executor.submit(() -> {

            int i=0;

            while (true) {

                String threadName = Thread.currentThread().getName();
                if (chronicleLogger.isDebugEnabled()) {
                    chronicleLogger.debug("This is ChronicleLogger3 debug log threadName: " + threadName +" "+ i);
                }


                chronicleLogger.info("This is  ChronicleLogger3 info log threadName: " + threadName +" "+ i);


                if (chronicleLogger.isWarnEnabled()) {
                    chronicleLogger.warn("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger warn log: " + threadName +" "+ i);
                }

                if (chronicleLogger.isErrorEnabled()) {
                    chronicleLogger.error("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger error log: " + threadName +" "+ i);
                }

                if (chronicleLogger.isTraceEnabled()) {
                    chronicleLogger.trace("Axiata Digital Lab will make world best software. The future is today. This is ChronicleLogger trace log: " + threadName +" "+ i);
                }

                i++;
            }
        });
    }




}
