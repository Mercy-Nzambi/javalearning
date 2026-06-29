public class Main {
    public static void main(String [] args){
        //create objects for the Car class
        Car car1 = new Car("Porsche", "Macan");
        Car car2 = new Car("Toyota", "Avensis");
        Car car3 = new Car("Honda", "Fit");

        Car[] cars = {car1, car2, car3};

        for(Car car: cars){
            car.drive();
        }

    }
}
