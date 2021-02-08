package Week9;

public class Student {
    private String Firstname = "Hello";
    private String Lastname = "World";
    public String toString()
    {
        return "Myfirst name "+Firstname+" Last name "+Lastname;
    }
    public void SetName(String Fname, String Lname)
    {
        this.Firstname = Fname;
        this.Lastname = Lname;
    }
    public static void main(String[]args)
    {
        Student p = new Student();
        System.out.println(p.toString());
    }
}
