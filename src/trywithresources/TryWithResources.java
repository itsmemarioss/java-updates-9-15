import java.io.*;
import java.nio.*;

public class TryWithResources {
    public static void main (String... args) throws Exception {
        var inputStream = new FileInputStream("src/file.txt");
        
        //No need to redeclare the resource
        //try (FileInputStream input = inputStream) { //old version
        try ( inputStream ) {

        }
    }
}