package firstmain;

public class Student {
    int id;
    String name;
    String email;
    int age;
    String gender;

    static int abc=100;

    public void demo(){
        System.out.println("demo non-static method");
    }

    public static void demo2(){
        System.out.println("demo2 static method");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Student(int inputId, String inputname, String inputemail, int inputage, String inputgender) {
        this.id = inputId;
        this.name = inputname;
        this.email = inputemail;
        this.age = inputage;
        this.gender = inputgender;
    }

    public Student(){

    }
}
