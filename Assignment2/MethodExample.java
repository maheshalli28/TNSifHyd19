public class MethodExample {
    
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    
    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }
    
    public static void main(String[] args) {
        // Calling the static method
        staticMethod();
        
        // Creating an object of the class to call instance method
        MethodExample obj = new MethodExample();
        obj.instanceMethod();
    }
}
