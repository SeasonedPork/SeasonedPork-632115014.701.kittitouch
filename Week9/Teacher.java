package Week9;

public class Teacher extends Person {
    String University;
    public Teacher(String name ,int year , String Uni_name)
    {
        super(name,year);
        this.University = Uni_name;
    }
    public void introduce()
    {
        super.introduce();
        System.out.println("I'm a teacher and teach the students in : "+this.University);
    }
}
