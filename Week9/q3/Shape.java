package Week9.q3;

public class Shape {
    String word = "shape";
    String A = "this is a : ";
    
    public String toString()
    {
        return A+word;
    }
     public static void main(String[]args)
    {
        Shape p = new Shape();
        System.out.println(p.toString());
    }
}
