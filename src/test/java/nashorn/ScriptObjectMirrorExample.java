package nashorn;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.Arrays;

/**
 * Created by stefos on 14/04/2015.
 */
public class ScriptObjectMirrorExample {

    public static void fun3(ScriptObjectMirror mirror) {
        System.out.println(mirror.getClassName() + ": " +
                Arrays.toString(mirror.getOwnKeys(true)));
    }
}
