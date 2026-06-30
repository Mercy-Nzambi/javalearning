public class Main {
    public static void main(String [] args){

        //program for polymorphism

        //Objects from the different classes
        Hairstylist hairstylist = new Hairstylist();
        Actor actor = new Actor();
        Butcher butcher = new Butcher();

        //This shows the objects behaving as though they are of the same type
        Person [] person = {hairstylist, actor, butcher};

        System.out.println("This is from the array that is showing the polymorphism");
        for(Person p : person){
            p.cut();
        }

        //This shows that the object can still act in its own unique way
        System.out.println("\nThis is to show the uniqueness of the objects");
        hairstylist.plait();

    }
}
