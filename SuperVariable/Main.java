public class Main {
    public static void main(String [] args){
        Person person = new Person("Tom", "Marvolo");
        Student student = new Student("Ron", "Weasley", 2.50);

        person.showName();
        student.showName();

    }
}
