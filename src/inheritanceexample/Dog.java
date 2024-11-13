package inheritanceexample;

import javax.sound.midi.Soundbank;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog can bark");
    }

    @Override
    public void see() {
        System.out.println("Dog can see");
    }

    @Override
    public void breathe(){
        System.out.println("Dog can breathe");
    }

    @Override
    public void eat(){
        System.out.println("Dog can eat");
    }
}
