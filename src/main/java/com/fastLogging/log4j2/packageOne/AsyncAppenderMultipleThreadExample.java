package com.fastLogging.log4j2.packageOne;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncAppenderMultipleThreadExample {

    final org.apache.logging.log4j.Logger logger = LogManager.getLogger(AsyncAppenderMultipleThreadExample.class);
    public static void main(String args[]) {
        AsyncAppenderMultipleThreadExample asyncAppenderMultipleThreadExample = new AsyncAppenderMultipleThreadExample();
        for(int j=0; j<=4; j++) {
            asyncAppenderMultipleThreadExample.executorServices();
        }
    }

    public void ThreadsNRunnable() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();

            if (logger.isDebugEnabled()) {
                logger.debug("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async debug log: " + threadName);
            }
            if (logger.isInfoEnabled()) {
                logger.info("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async info log: " + threadName);
            }
            if (logger.isWarnEnabled()) {
                logger.warn("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async warn log: " + threadName);
            }

            if (logger.isErrorEnabled()) {
                logger.error("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async error log: " + threadName);
            }

            if (logger.isTraceEnabled()) {
                logger.trace("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async trace log: " + threadName);
            }
        };
        task.run();
        Thread thread = new Thread(task);
        thread.start();
    }

    public void executorServices() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {

            int i=0;

            while (true) {

                String threadName = Thread.currentThread().getName();
                if (logger.isDebugEnabled()) {
                    logger.debug("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async debug log: " + threadName+" "+ i);
                }
                if (logger.isInfoEnabled()) {
                    logger.info("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async info log: " + threadName+" "+ i);
                }
                if (logger.isWarnEnabled()) {
                    logger.warn("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async warn log: " + threadName +" "+ i);
                }

                if (logger.isErrorEnabled()) {
                    logger.error("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async error log: " + threadName +" "+ i);
                }

                if (logger.isTraceEnabled()) {
                    logger.trace("Axiata Digital Lab will make world best software. The future is today. This is log4j2 async trace log: " + threadName +" "+ i);
                }

                i++;
            }
        });
    }

}
