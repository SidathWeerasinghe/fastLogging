package com.fastLogging.chronicle.reader;

import net.openhft.chronicle.wire.WireType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class TestLogReader {

    public static void main (String arg[]) throws IOException {

        ChronicleLogReader reader = new ChronicleLogReader("/home/chishan/projects/fastLogging/log1", WireType.COMPRESSED_BINARY);

        reader.processLogs(ChronicleLogReader::printf, true, readIndex());

    }

    private static long readIndex(){
        long index = 0l;
        try {
            File indexFile = new File("/home/chishan/projects/fastLogging/index/indexFile.txt");
            Scanner indexReader = new Scanner(indexFile);
            while (indexReader.hasNextLine()) {
                index = Long.parseLong(indexReader.nextLine().trim());
                System.out.println(index);
            }
            indexReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            return ++index;
        }
    }


}
