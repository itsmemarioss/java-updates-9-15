/**
 * https://openjdk.java.net/jeps/325
 * https://openjdk.java.net/jeps/361
 */
public class SwitchExpression {

    static enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main (String... args) {
        var day = Days.THURSDAY;
        //switch can be used as an expression and return a value
        var numOfLetters = switch (day) {
                case MONDAY, FRIDAY, SUNDAY -> 6;
                case TUESDAY                -> 7;
                case THURSDAY, SATURDAY     -> 8;
                case WEDNESDAY              -> {
                    System.out.println(9);
                    //Specify the value that the case label produces with the yield statement
                    yield 9;
                }
                default -> throw new IllegalStateException("Invalid day: " + day);
        };

        System.out.println(numOfLetters);
        
    }
}