package Lab13;

public abstract class ShapeCalculate {
    public ShapeCalculate()
    {}
    public void getArea()
    {
        System.out.println("the abstract have run");
    }
}
class triangle extends ShapeCalculate
{
    double len,hen;
    public  triangle(Concrete H)
    {
        len = H.getLength();
        hen = H.getHeight();
    }
    public void getArea()
    {
        double height = hen;
        double length = len;
        double result = ((height*length)/2);
        System.out.println("Total area of triangle is : "+result);
    }
}
class rectangle extends ShapeCalculate
{
   double len,hen;
    public  rectangle(Concrete H)
    {
        len = H.getLength();
        hen = H.getHeight();
    }
     public void getArea()
    {
        double height = hen;
        double length = len;
        double result = (height*length);
        System.out.println("Total area of rectangle is : "+result);
    }
}
class square extends ShapeCalculate
{
   double len,hen;
    public  square(Concrete H)
    {
        len = H.getLength();
        hen = H.getHeight();
    }
     public void getArea()
    {
       double height = hen;
        double length = len;
        double result = (height*length);
        System.out.println( "Total area of square is : "+result);
    }
}
class arbitary extends ShapeCalculate
{
    public arbitary()
    {}
    public void getArea(Concrete H )
    {
        System.out.println("This is arbitary shape can't calculate");
    }
}