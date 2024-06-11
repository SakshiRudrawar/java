package sakshi.demo;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Attempting to access a private method directly
        try {
            obj.privateMethod(); // This line will throw IllegalAccessException
        } catch (IllegalAccessException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
