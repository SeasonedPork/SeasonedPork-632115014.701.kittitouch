package Week6;

public class Person
{
    String genre;
    String name;
    int age;
    String gender;
    public Person()
    {}

    public Person(String name, int age,String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce()
    {
        System.out.println("My name is "+name + "\n Age : " +age + " and my gender is "+ gender);
    }

public void playMusic()
    {
        System.out.println(name + "is playing " +genre+ " music.");
        System.out.println("\n----------------------------------------------------------");    
    }
}

