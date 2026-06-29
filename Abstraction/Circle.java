public class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
