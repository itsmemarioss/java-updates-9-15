/**
 * https://openjdk.java.net/jeps/355
 */
public class TextBlock{
    public static void main (String... args){

        //Using "one-dimensional" string literals
        String html = "<html>\n" +
                    "    <body id=\"id\">\n" +
                    "        <p>Hello, world</p>\n" +
                    "    </body>\n" +
                    "</html>\n";
        
        //Using a "two-dimensional" block of text
        html = """
                    <html>
                        <body id="id">
                            <p>Hello, world</p>
                        </body>
                    </html>
                    """;
        
        
        /*
        String a = """""";   // no line terminator after opening delimiter
        */

        /*
        String b = """ """;  // no line terminator after opening delimiter
        */
        
        /*
        String c = """
           ";        // no closing delimiter (text block continues to EOF)
        */
        
        /*
        String d = """
           abc \ def
           """;      // unescaped backslash (see below for escape processing)
        */
    }
}