public class Main {
    public static void main(String [] args){
        //intro  to objects and classes
        Car car1 = new Car("Porsche", "Cayenne", 2019);
        Car car2 = new Car("Toyota", "Fielder", 2005);
        Car car3 = new Car("Mazda", "Atenza", 2018);

        car1.start();
        System.out.println("The make is " + car1.make);
        System.out.println("The model is " + car1.model);
        System.out.println("Year of manufacture is " + car1.year);
        car1.stop();
        System.out.println();

        car2.start();
        System.out.println("The make is " + car2.make);
        System.out.println("The model is " + car2.model);
        System.out.println("Year of manufacture is " + car2.year);
        car2.stop();
        System.out.println();

        car3.start();
        System.out.println("The make is " + car3.make);
        System.out.println("The model is " + car3.model);
        System.out.println("Year of manufacture is " + car3.year);
        car3.stop();

    }
}
