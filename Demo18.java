// class - class ->Extends
// class - interface -> Implements
// interface - interfae -> Extends


interface A {
    int age = 44; // These are final and static variables 
    String name = "John";
    void Method();
    void config();
}

class B implements A {
    public void Method() {
        System.out.println("Method is implemented.");
    }

    public void config() {
        System.out.println("World");
    }

    public void show() {
        System.out.println("Hello");
    }
}

public class Demo18 {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        // obj.show(); // This will give an error, because show() is not part of interface A

        // To call show(), you can cast it to class B
        if (obj instanceof B) {
            B bObj = (B) obj;
            bObj.show(); // Now it works
        }

        // Accessing constants from interface A
        System.out.println(A.age); // Accessing static variable from interface
        System.out.println(A.name); // Accessing static variable from interface
    }
}
