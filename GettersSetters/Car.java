public class Car {
    private String model;
    private String make;
    private int price;

    Car(String model, String make, int price){
        //this.model = model;
        this.make = make;
        this.price = price;
    }

    void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getPrice(){
        return price;
    }
}
