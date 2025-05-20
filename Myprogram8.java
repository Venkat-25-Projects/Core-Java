// class A extends Object
// {
//     public A()
//     {
//         super();  // Calls the default constructor of the superclass (Object class)
//         System.out.println("in A");
//     }

//     // Constructor with an int parameter
//     public A(int n)
//     {
//         super();  // Calls the default constructor of the superclass (Object class)
//         System.out.println("in A int");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         super();  // Calls the default constructor of class A
//         System.out.println("in B");
//     }

//     // Constructor with an int parameter
//     public B(int n)
//     {
//         super(n);  // Correctly calls the A(int n) constructor
//         System.out.println("in B int");
//     }
// }

// public class Myprogram8 
// {
//     public static void main(String[] args){
//         B obj = new B(10);  // This will call the constructor B(int n)
//     }
// }
class A extends Object
{
    public A()
    {
        super();  // Calls the default constructor of the superclass (Object class)
        System.out.println("in A");
    }

    // Constructor with an int parameter
    public A(int n)
    {
        super();  // Calls the default constructor of the superclass (Object class)
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        super();  // Calls the default constructor of class A
        System.out.println("in B");
    }

    // Constructor with an int parameter
    public B(int n)
    {
        super(n);  // Correctly calls the A(int n) constructor
        System.out.println("in B int");
    }
}

public class Myprogram8 
{
    public static void main(String[] args){
        B obj = new B(10);  // This will call the constructor B(int n)
    }
}

