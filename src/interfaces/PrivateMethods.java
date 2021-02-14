/**
 * Private interface methods are supported. 
 * This support allows nonabstract methods of an interface to share code between them.
 */
public interface PrivateMethods {

    default void defaultMethod() {
        privateHelperMethod();
    }

    /**
     * In order to help default methods implementation,
     * now you can create private methods
     * private methods can also be static
     */
    private void privateHelperMethod(){
        //TODO
    }
}