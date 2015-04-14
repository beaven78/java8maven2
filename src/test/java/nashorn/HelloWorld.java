package nashorn;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by stefos on 14/04/2015.
 */
public class HelloWorld {

    @Test
    public void test() throws ScriptException, FileNotFoundException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('Hello World!');");

        engine.eval(new FileReader("script.js"));


    }
}
