public class Car {
    String make = "Porsche";
    String model = "Cayenne";
    int year = 2019;
    double price = 2000.90;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void start(){
        System.out.println(this.make +" " + this.model + " has started");
    }

    void stop(){
        System.out.println("You have stopped the car");
    }

}
