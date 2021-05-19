import net.openhft.chronicle.core.OS;
import net.openhft.chronicle.core.util.Time;
import net.openhft.chronicle.wire.WireType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {

    public static void main(String[] args) {

        final Logger chronicleLogger = LoggerFactory.getLogger("chronicle");
        final Logger fileLogger = LoggerFactory.getLogger("file");

        while(true) {
            chronicleLogger.info("Test {} {} {}", 1, 2, 3);
            fileLogger.info("Test {} {} {}", 1, 2, 3);
        }

    }




}
