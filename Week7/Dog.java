package Week7;

public class Dog extends Pets{

    public Dog (String name,String species,String colour,int age)
    {
        this.Name= name;
        this.Species = species;
        this.Colour=colour;
        this.Age=age;
    }

    public boolean Doc_Action1_Hair(String Hair)
    {
        if(Hair.toLowerCase().equals("short"))
        {return true;}
        else
        {return false;}
    }

    public void Dog_Action2_act(String act)
    {String detail = "My dog  "+this.Name+" is "+act+" in the forest";
    System.out.println(detail);
    }

    public void Dog_Action3_BarkandSize(String size,String bark)
    {
        String detail = size + " and " +bark+" "+bark;
        System.out.println(detail);
    }
}
