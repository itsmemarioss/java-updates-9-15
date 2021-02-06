/**
 * module declaration is located in the base directory.
 */
module com.itsmemario.hello {
    //requires another module
    requires java.desktop;
    //exports this package to allow other modules to use it
    exports com.itsmemario.hello;
}