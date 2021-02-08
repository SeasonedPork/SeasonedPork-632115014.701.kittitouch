package Week9.q3;

public class Retangle extends Shape{
    int Width , Height;
    public void setLansW(int W , int L)
    {
        this.Width = W;
        this.Height = L;
    }
    public String toString()
    {
        super.word = "Retangle";
        return super.A+super.word + "with width as :"+Width +"with Height as : "+Height;
    }
    public static void main(String[]args)
    {
        Retangle p = new Retangle();
        System.out.println(p.toString());
    }

}
