package Lab13;

public class Concrete {
    private double Length;
    private double Height;
   public Concrete(double Height,double Length)
   {
       this.Height = Height;
       this.Length = Length;
   }
   public double getLength()
   {
       return this.Length;
   }
   public double getHeight()
   {
    return this.Height;
   }
   public void setLength(double len)
   {
       this.Length = len;
   }
   public void setHeight(double hen)
   {
       this.Height = hen;
   }
}
