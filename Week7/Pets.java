package Week7;

public class Pets {
    String Name;
    String Species;
    String Colour;
    int Age;

    public Pets()
    {}
    
    public Pets(String name,String species, String colour,int age)
    {
        this.Name = name;
        this.Species = species;
        this.Colour = colour;
        this.Age = age;
    }

    public void showSTDinfopets()
    {
        System.out.print(this.Name+"\t"+this.Species+"\t"+this.Age+"\t"+this.Colour+"\n");
    }
}