package clock;

import org.junit.Test;

import java.time.ZoneId;

/**
 * Created by St on 13/04/2015.
 */
public class TimezoneExample {

    @Test
    public void test(){

        System.out.println(ZoneId.getAvailableZoneIds());
        // prints all available timezone ids

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        ZoneId zone3 = ZoneId.of("Europe/London");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());
        System.out.println(zone3.getRules());

        // ZoneRules[currentStandardOffset=+01:00]
        // ZoneRules[currentStandardOffset=-03:00]
    }
}
