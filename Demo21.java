enum Status {
    Running, Failed, Pending, Success; // All these are objects
}

public class Demo21 {
    public static void main(String[] args) {
        // Example status
        Status s = Status.Running;

        // Using if-else
        System.out.println("Using if-else:");
        if (s == Status.Running) {
            System.out.println("All good");
        } else if (s == Status.Failed) {
            System.out.println("Failed");
        } else if (s == Status.Pending) {
            System.out.println("Please wait");
        } else if (s == Status.Success) {
            System.out.println("Success");
        }

        // Using switch-case
        System.out.println("\nUsing switch-case:");
        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success:
                System.out.println("Success");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }

        // Additional code to display the ordinal values of each enum constant
        Status[] ss = Status.values();
        System.out.println("\nOrdinal values of each status:");
        for (Status status : ss) {
            System.out.println(status + " : " + status.ordinal());
        }
    }
}
