package inheritanceexample;

public class Human extends Animal{

    public void talk(){
        System.out.println("Human can talk");
    }

    public void think(){
        System.out.println("Human can think");
    }

    @Override
    public void see() {
        System.out.println("Human can see");
    }

    @Override
    public void breathe(){
        System.out.println("Human can breathe");
    }

    @Override
    public void eat(){
        System.out.println("Human can eat");
    }
}
