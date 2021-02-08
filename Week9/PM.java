package Week9;

public class PM extends Person{
    String Country;
    public PM(String name,int year,String  region)
    {
        super(name,year);
        this.Country = region;
    }
    public void introduce()
    {
        super.introduce();
        System.out.println("i'm a prime minister and work in "+this.Country);
    }
    
}
