package Week7;

public class Bird extends Pets{
    public Bird(String name,String species,String colour,int age)
    {
        this.Name= name;
        this.Species = species;
        this.Colour=colour;
        this.Age=age;
    }

    public void Bird_Action1_Country(String country)
    {
        System.out.println("this bird is from "+country);
    }

    public void Bird_Action2(String fly)
    {
        if(fly.toLowerCase().equals("fly"))
        {
            System.out.println("this bird can fly");
        }
        else
        {
            System.out.println("This bird can't fly");
        }
    }

    public void Bird_Action3_Talk(String talk)
    {
        System.out.println("this bird have talk : "+talk+" as it repeat");
    }
    
}
