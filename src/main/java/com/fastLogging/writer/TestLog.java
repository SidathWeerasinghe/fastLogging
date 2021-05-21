package com.fastLogging.writer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {

    public static void main(String[] args) {

        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle");
        final Logger fileLogger = LoggerFactory.getLogger("file");

        int i = 0;
        //for(int i =0; i<=10; i++)
        while (true)
        {
            chronicleLogger.info("Test {}", i);

            try {
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //  fileLogger.info("Test {} {} {}", 1, 2, 3);
        }



    }




}
