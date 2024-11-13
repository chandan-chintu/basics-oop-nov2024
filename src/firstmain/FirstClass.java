package firstmain;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello everyone welcome to Spring1");

        Student student1 = new Student();// default constructors
        System.out.println("student1 before assigning values is : "+student1);


        student1.id=234;
        student1.name="Ajay";
        student1.age=14;
        student1.email="ajay123@gmail.com";
        student1.gender="male";

        System.out.println("student1 after assigning values is : "+student1);

        Student student2 = new Student(123, "Vijay", "vijay@gmail.com",13,"male");// parameterized construcotrs
        System.out.println("student2 with parameterized constructors is :" +student2);

        int abc = 1000;
        System.out.println("abc is : "+abc);
        abc=2500;
        System.out.println("abc is : "+abc);

        final int pqr=100;
        System.out.println("pqr is : "+pqr);
        // pqr=400; - we cannnot change final values


        Student stu1 = new Student();
        stu1.demo();

        Student.demo2();
        System.out.println("abc value is : "+Student.abc);
    }
}
