package Lab13;

public class Main {
    public static void main(String []args)
    {
        Concrete Somepuddle_of_Con = new Concrete(9, 9);
        ShapeCalculate triangle = new triangle(Somepuddle_of_Con);
        triangle.getArea();
        ShapeCalculate rectangle = new rectangle(Somepuddle_of_Con);
        rectangle.getArea();
        ShapeCalculate square = new square(Somepuddle_of_Con);
        square.getArea();
        ShapeCalculate arbitary = new square(Somepuddle_of_Con);
        arbitary.getArea();
    }
}
