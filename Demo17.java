abstract class A {
    public abstract void show();  // Abstract method
}

public class Demo17 {
    public static void main(String[] args) {
        // Anonymous inner class implementation of abstract class A
        A obj = new A() {
            public void show() {
                System.out.println("Hello World");
            }
        };

        obj.show(); // Calling the show() method
    }
}
