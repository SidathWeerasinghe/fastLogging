package com.fastLogging.chronicle.writer;


import com.fastLogging.chronicle.writer.pacakge1.ChronicleLoggerPacakge1;
import com.fastLogging.entity.LogEntity;
import com.fastLogging.chronicle.writer.pacakge2.ChronicleLoggerPacakge2;

public class ChronicleLoggerMain {

    public static void main(String[] args) {

        ChronicleLoggerPacakge1 chronicleLoggerPacakge1 = new ChronicleLoggerPacakge1();
        ChronicleLoggerPacakge2 chronicleLoggerPacakge2 = new ChronicleLoggerPacakge2();

        for(int j =0; j<=10; j++){
            LogEntity logEntity = new LogEntity("NewLogger", "Log4j2");
            chronicleLoggerPacakge1.writeMessageChronicleLogger1(j, 100f,"String Message", logEntity);
            //chronicleLoggerPacakge2.writeMessageChronicleLogger1(j);

        }


    }


}
