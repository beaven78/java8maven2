package nashorn;

import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.junit.Test;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by stefos on 14/04/2015.
 */
public class InvokingJavascriptFromJava {

    @Test
    public void test() throws FileNotFoundException, ScriptException, NoSuchMethodException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader("scriptMethods.js"));

        Invocable invocable = (Invocable) engine;

        Object result = invocable.invokeFunction("fun1", "Peter Parker");
        System.out.println(result);
        System.out.println(result.getClass());

        invocable.invokeFunction("fun2", new Date());
        // [object java.util.Date]

        invocable.invokeFunction("fun2", LocalDateTime.now());
        // [object java.time.LocalDateTime]

        invocable.invokeFunction("fun2", new Person());
        // [object com.winterbe.java8.Person]
    }

    //Static java method
    //N.b. must be made public as scriptMethod.js exists in another folder, just like normal java class rules,
    //same applies to javascript
    public static String fun1(String name) {
        System.out.format("Hi there from Java, %s", name);
        return "greetings from java";
    }

    public static void fun2(Object object) {
        System.out.println(object.getClass());
    }

    public static void fun3(ScriptObjectMirror mirror) {
        System.out.println(mirror.getClassName() + ": " +
                Arrays.toString(mirror.getOwnKeys(true)));
    }

    //Invoking a method from a Javascript object
    public static void fun4(ScriptObjectMirror person) {
        System.out.println("Full Name is: " + person.callMember("getFullName"));
    }

    @Test
    public void test2() throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader("scriptMethods.js"));
    }
}