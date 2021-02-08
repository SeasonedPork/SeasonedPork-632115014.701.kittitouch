package Week9.q3;

public class Cube extends Retangle{
    double length = 2*(super.Width +super.Height) ;
     public String toString()
    {
        super.word = "Cube";
        return super.A+super.word+" a side of "+length;
    }

    public static void main(String []args)
    {
        Cube p = new Cube();
        System.out.println(p.toString());
    }
}
