package collection.improvements;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by stefos on 08/04/2015.
 */
public class MapComputeIfAbsentPresent {

    @Test
    public void test(){

        Map<String,Object> names = new HashMap<>();
        names.put("Stephen","Foster");
        names.put("John","Pollard");
        names.put("Kate","Griffiths");

        names.computeIfAbsent("Antony", myName -> "Foster");

        names.computeIfAbsent("MyList", myName -> new LinkedList<String>()); //Wouldn't compile IF Maps generic <String,String>

        names.computeIfPresent("Antony", (dd, ss) -> dd + "+" + ss); //Like method says, only ran if present

        names.compute("Julie", (k,v) -> k+v); //Evaluates regardless and adds it to the Map

        System.out.println(names);
    }
}
