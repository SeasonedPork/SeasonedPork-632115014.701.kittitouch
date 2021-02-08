package Week9;

public class Person {
    String name;
    int bornYear;

    public Person(String name, int bornYear)
    {
        this.name = name;
        this.bornYear = bornYear;
    }
    public void introduce()
    {
        System.out.print("My name is : "+name);
        System.out.println("i was born in " + bornYear);
    }
}
