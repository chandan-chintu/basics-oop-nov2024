package inheritanceexample;

public class Bird extends Animal{

    public void fly(){
        System.out.println("bird can fly");
    }

    @Override
    public void see() {
        System.out.println("Bird can see");
    }

    @Override
    public void breathe(){
        System.out.println("Bird can breathe");
    }

    @Override
    public void eat(){
        System.out.println("Bird can eat");
    }
}
