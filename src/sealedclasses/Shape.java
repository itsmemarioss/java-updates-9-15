/**
 * Previewed in Java 15
 * https://openjdk.java.net/jeps/360
 */
public sealed class Shape permits Rectangle, Circle {

}

/**
 * if the subclass is declared in the same source 
 * the sealed class can omit the permits clause
 * and the compile will infer the permites subclasses
 */
sealed class Rectangle extends Shape {}

non-sealed class Circle extends Shape {}

final class Square extends Rectangle {}