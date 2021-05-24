package com.fastLogging.writer;

import java.io.File;
import java.io.IOException;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueue;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChronicleQueueExample {

    private static final Logger logger = LogManager.getLogger(ChronicleQueueExample.class);
    private final ExcerptAppender appender;
    private final SingleChronicleQueue chronicle;

    public ChronicleQueueExample() throws IOException {
        chronicle = SingleChronicleQueueBuilder.single(new File("my-queueA").getAbsolutePath()).build();
        appender = chronicle.acquireAppender();
    }
    public void writeToChronicle(String msg) throws IOException {
        appender.writeText(msg);
    }
    public static void main(String[] args) throws IOException {
        ChronicleQueueExample clog = new ChronicleQueueExample();
        int n = 1000_000_000;
        long t1 = -System.nanoTime();
        for( int idx = 0; idx<n; idx++){
            clog.writeToChronicle("Axiata Digital Lab will make world best software. The future is today");
        }
    }
}

