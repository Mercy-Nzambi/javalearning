public class Main {
    public static void main(String [] args){

        Rectangle rectangle = new Rectangle(3, 4);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(5, 6);

        rectangle.display();
        System.out.printf("The area of this rectangle is %.2f\n", rectangle.area());
        circle.display();
        System.out.printf("The area of this circle is %.2f\n", circle.area());
        triangle.display();
        System.out.printf("The area of this triangle is %.2f\n", triangle.area());

    }
}
