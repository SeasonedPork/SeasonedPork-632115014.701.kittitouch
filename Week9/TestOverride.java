package Week9;

public class TestOverride {
    public static void main(String[]args)
    {
        Person person1;
        person1 = new Person("Mark",2001);
        person1.introduce();
        Person person2 = new Sheriff("Mateo",1988,"California");
        person2.introduce();
        Person person3 = new Teacher("Ball", 1977, "CMU(Chiangmai university)");
        person3.introduce();
        Person person4 = new PM("Tu", 1954, "Thailand");
        person4.introduce();
        Person person5 = new Soccer("Messi", 1987, "Barcelona football club");
        person5.introduce();
        Person person6 = new Byond_char("Plastac Mildred", 2006, "Space station13 (Byond)");
        person6.introduce();
    }
    
}
