package inheritanceexample;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("--------------Animal parent class----------------------");
        Animal animal = new Animal();
        animal.see();
        animal.eat();
        animal.breathe();

        System.out.println("--------------Dog child class----------------------");
        Dog dog = new Dog();
        dog.bark();


        dog.see();
        dog.breathe();
        dog.eat();

        System.out.println("--------------Human child class----------------------");
        Human human = new Human();
        human.talk();
        human.think();


        human.see();
        human.breathe();
        human.eat();

        System.out.println("--------------Fish child class----------------------");
        Fish fish = new Fish();
        fish.swim();

        fish.see();
        fish.breathe();
        fish.eat();

        System.out.println("--------------Bird child class----------------------");
        Bird bird = new Bird();

        bird.fly();

        bird.see();
        bird.breathe();
        bird.eat();
    }
}
