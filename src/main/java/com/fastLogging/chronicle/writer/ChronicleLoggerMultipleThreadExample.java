package com.fastLogging.chronicle.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChronicleLoggerMultipleThreadExample {

    public static void main(String args[]) {
        ChronicleLoggerMultipleThreadExample chronicleLoggerMultipleThreadExample = new ChronicleLoggerMultipleThreadExample();
        while (true)
        chronicleLoggerMultipleThreadExample.ThreadsNRunnable();
    }

    public void ThreadsNRunnable() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            final Logger chronicleLogger = LoggerFactory.getLogger("chronicle3");
            if(chronicleLogger.isDebugEnabled()){
                chronicleLogger.debug("This is ChronicleLogger3 debug log threadName: " + threadName);
            }
            if(chronicleLogger.isInfoEnabled()){
                chronicleLogger.info("This is  ChronicleLogger3 info log threadName: " + threadName);
            }
            chronicleLogger.warn("This is ChronicleLogger3 warn log threadName: " + threadName);
            chronicleLogger.error("This is ChronicleLogger3 error log threadName: " + threadName);
            chronicleLogger.trace("This is ChronicleLogger3 trace log threadName: " + threadName);
        };
        task.run();
        Thread thread = new Thread(task);
        thread.start();
    }

    public void executorServices() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle3");
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            if(chronicleLogger.isDebugEnabled()){
                chronicleLogger.debug("This is ChronicleLogger3 debug log threadName: " + threadName);
            }
            if(chronicleLogger.isInfoEnabled()){
                chronicleLogger.info("This is  ChronicleLogger3 info log threadName: " + threadName);
            }
            chronicleLogger.warn("This is ChronicleLogger3 warn log threadName: " + threadName);
            chronicleLogger.error("This is ChronicleLogger3 error log threadName: " + threadName);
            chronicleLogger.trace("This is ChronicleLogger3 trace log threadName: " + threadName);
        });
    }




}
