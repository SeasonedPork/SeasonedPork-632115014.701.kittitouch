package Week7;

public class Fish extends Pets{
    public Fish(String name,String species,String colour,int age)
    {
        this.Name= name;
        this.Species = species;
        this.Colour=colour;
        this.Age=age;
    }
    
    public void Fish_Action1_Size(String input)
    {
        System.out.println("this fish is "+input+" Size");

    }

    public void Fish_Action2_act(String input)
    {
        System.out.println("this fish "+input);
    }

    public String Fish_Action3_CheckSalt(String input)
    {
        if(input.toLowerCase().equals("true"))
        {return "is a Salt water fish";}
        else
        {return "is a Fresh water fish";}
    }
}
