package com.fastLogging.reader;

import net.openhft.chronicle.core.OS;
import net.openhft.chronicle.core.util.Time;
import net.openhft.chronicle.wire.WireType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.openhft.chronicle.core.io.IOTools;

import java.io.IOException;


public class TestLogReader {

    public static void main (String arg[]) throws IOException {


        ChronicleLogReader reader = new ChronicleLogReader("/home/sidath/Desktop/dust/dev-setup/20210521-1833.cq4", WireType.COMPRESSED_BINARY);

        reader.processLogs(ChronicleLogReader::printf, true);

    }


}
