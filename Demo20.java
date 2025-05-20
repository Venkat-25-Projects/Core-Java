enum Status
{
    Running, Failed, Pending, Success;//All these are objects
}
public class Demo20 
{
    public static void main(String[] args) 
    {
        int i = 5;
        Status[] ss = Status.values();
        //System.out.println(s.ordinal());
        for(Status s : ss)
        {
            System.out.println(s + " : " + s.ordinal());
        }
    }  
}
