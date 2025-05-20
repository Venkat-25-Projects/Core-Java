class A{
    public A()
    {
        System.out.println("Object Created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}


public class Demo6 
{
   public static void main(String[] args) {
    new A().show();
    new A().show();  //Anonymous object
    //obj.show();
   } 
    
}
