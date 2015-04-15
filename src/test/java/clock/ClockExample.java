package clock;

import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * Created by St on 13/04/2015.
 */
public class ClockExample {

    @Test
    public void test(){


        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);   // legacy java.util.Date

    }
}
