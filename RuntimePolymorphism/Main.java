public class Main {
    public static void main(String [] args){
        //creating objects via the extended class

        //instantiation since we can't create objects from an abstract class
        Animal animal1;
        Animal animal2;

        animal1 = new Dog();
        animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();

    }
}
