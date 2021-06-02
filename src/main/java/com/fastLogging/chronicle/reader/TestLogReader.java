package com.fastLogging.chronicle.reader;

import net.openhft.chronicle.wire.WireType;

import java.io.IOException;


public class TestLogReader {

    public static void main (String arg[]) throws IOException {


        ChronicleLogReader reader = new ChronicleLogReader("/home/sidath/Desktop/dust/dev-setup/20210521-1833.cq4", WireType.COMPRESSED_BINARY);

        reader.processLogs(ChronicleLogReader::printf, true);

    }


}
