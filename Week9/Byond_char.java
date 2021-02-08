package Week9;

public class Byond_char extends Person{
    String game_name ;
    public Byond_char(String name,int year,String game)
    {
        super(name,year);
        this.game_name = game;
    }
    public void introduce()
    {

        super.introduce();
        System.out.println("i'm a game character in game : "+game_name);
    }
}
