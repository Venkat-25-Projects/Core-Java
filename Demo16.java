class A {
    public void show() {
        System.out.println("Hello");
    }
}

public class Demo16 {
    public static void main(String[] args) {
        // Anonymous inner class that overrides the show() method
        A obj = new A() {
            public void show() {
                System.out.println("Hello World");
            }
        };

        obj.show(); // Calling the overridden show() method
    }
}
