package Week6;

public class ExampleInheritance {
    public static void main(String[]args)
    {
        Artist art = new Artist("Ball",20);
        
        art.genre ="Hip Hop";
        art.introduce();
        art.playMusic();

        Chaplain Ricardo = new Chaplain("Ricardo Milos", 40, "Deep dark-fantasy", "Alpha Male");
        Ricardo.introduce();
        Ricardo.playMusic();        


        Electrician Billy = new Electrician("Billy Herrington", 50, "on the corner of the street", "Alpha male");
        Billy.introduce();
        Billy.playMusic();

        Fisherman Danny_Lee = new Fisherman("Kiyoshi Kazuya", 45, "on the two!!", "Alpha male");
        Danny_Lee.introduce();
        Danny_Lee.playMusic();

        Clerk Nyanner = new Clerk("Nyanner the Felanid", 20,"J-Pop","Female");
        Nyanner.introduce();
        Nyanner.playMusic();


        Roboticist Plastac = new Roboticist("Plastac Mildred", 25, "New-genre Country", "Female");
        Plastac.introduce();
        Plastac.playMusic();

        Merchantguildmaster Seth = new Merchantguildmaster("Ssetht Zeentach", 1254, "Unpredictable but mostly egypt", "MALE");
        Seth.introduce();        
        Seth.playMusic();            


    }
}
