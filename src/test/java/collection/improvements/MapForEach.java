package collection.improvements;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stefos on 08/04/2015.
 */
public class MapForEach {

    @Test
    public void test(){

        Map<String,Object> names = new HashMap<>();
        names.put("Stephen","Foster");
        names.put("John","Pollard");
        names.put("Kate","Griffiths");

        names.forEach((k,v) -> System.out.println(k+v));

        System.out.println(names);
    }
}
