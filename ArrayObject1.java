public class ArrayObject1 {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Anjali";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Vikram";
        s3.marks = 92;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Priya";
        s4.marks = 88;

        // Creating an array large enough to hold all student objects
        Student students[] = new Student[4]; // Array size is 4, since we have 4 students
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        // Loop through the array and print student details
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ": " + students[i].marks);
        }
    }
}

class Student {
    int rollno;
    String name;
    int marks;
}
