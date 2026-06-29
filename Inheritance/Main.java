public class Main {
    public static void main(String [] args){
        //where we create and call objects

        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();
        Plant plant = new Plant();
        System.out.println(dog.isAlive);
        dog.eat();
        dog.talk();
        cat.eat();
        cat.talk();
        System.out.println(animal.isAlive);
        System.out.println(plant.isAlive);
    }
}
