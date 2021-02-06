import java.util.*;
/**
 * Previewed in Java 14
 * https://openjdk.java.net/jeps/384
 */
public class InstanceofPattern {
    public static void main (String... args) {
        Object obj = "string object";
        
        //Old way
        if(obj instanceof String){
            //You have to explicitly cast the object
            String s = (String) obj;
            System.out.println(s.length());
        }
        
        //New way without conversion step
        if(obj instanceof String s){
            System.out.println(s.length());
        }

        //you can use the binding variable in the expression
        //pay attention to the AND operator, you cannot do it with OR (||)
        //since the code could reach the s.startsWith if the instance of was false
        if(obj instanceof String s && s.startsWith("string")){
            System.out.println(s);
        }
    }
}