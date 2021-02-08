package Week9;

public class Soccer extends Person {
    String FB_club;
    public Soccer(String name,int year,String fbclub)
    {
        super(name,year);
        this.FB_club = fbclub;
    }
    public void introduce()
    {
        super.introduce();
        System.out.println("I'm a football and work in : "+FB_club);
    }
    
}
