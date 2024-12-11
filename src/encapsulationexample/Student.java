package encapsulationexample;

public class Student {

// adding dummy line
    private int id;
    private String name;
    private String email;
    private int age;
    private String gender;

    // getter - get the data
    public int getId() {
        return id;
    }
	// adding dummy line

    // setter - set the data or values
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	// adding dummy line

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
	// adding dummy line

    public void setGender(String gender) {
        this.gender = gender;
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
}
