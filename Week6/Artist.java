package Week6;
public class Artist extends Person
{
    String genre;
    public Artist(String name, int age)
    {
        this.age = age ;
        this.name = name;
        this.gender = "Male";
    }
    public void playMusic()
    {
        System.out.println(name + "is playing " +genre+ " music.");
         System.out.println("\n----------------------------------------------------------");   
    }
}