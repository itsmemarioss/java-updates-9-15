import java.net.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * JEP 286: Local-Variable Type Inference
 * https://openjdk.java.net/jeps/286
 */
public class LocalVariableTypeInference {

    private static final String FILE = "src/file.txt";

    public static void main (String... args) throws Exception {
        /*
        URL url = new URL("http://www.oracle.com/"); 
        URLConnection conn = url.openConnection(); 
        Reader reader = new BufferedReader( new InputStreamReader(conn.getInputStream()));
        */

        //cleaner code without boileplate 
        var url = new URL("http://www.oracle.com/"); 
        var conn = url.openConnection(); 
        var reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        var list = new ArrayList<String>();    // infers ArrayList<String>
        var stream = list.stream();            // infers Stream<String>
        var path = Paths.get(FILE);            // infers Path
        var bytes = Files.readAllBytes(path);  // infers bytes[]

        //Enhanced for-loop indexes
        List<String> myList = Arrays.asList("a", "b", "c");
        for (var element : myList) { }  // infers String

        //try with resources
        try (var input = new FileInputStream(FILE)) {}   // infers FileInputStream

    }
}
