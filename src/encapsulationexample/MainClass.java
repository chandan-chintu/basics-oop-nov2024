package encapsulationexample;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student();
		// adding dummy line
        //student1.id=123;
        student1.setId(123);
        student1.setName("Divya");
        student1.setEmail("divya@gmail.com");
        student1.setGender("female");
        student1.setAge(14);
        System.out.println("student1 is : "+student1);
		// adding dummy line
		// adding dummy line

        System.out.println("student1 name is : "+student1.getName());
        System.out.println("student1 age is : "+student1.getAge());
        System.out.println("student1 email is : "+student1.getEmail());
        System.out.println("student1 genader is : "+student1.getGender());
		// adding dummy line
    }
}
