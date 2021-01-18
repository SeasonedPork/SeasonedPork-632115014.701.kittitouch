package Week7;

public class ShowPets {
    public static void main(String [] args)
    {
        Bird Jessy =  new Bird("Jessy","Ostrict","black and white",10);
        Jessy.showSTDinfopets();
        Jessy.Bird_Action1_Country("Australia");
        Jessy.Bird_Action2("fly");
        Jessy.Bird_Action3_Talk("Crunchy smoothy soup");

        Dog Dang = new Dog("Dang","thai ridgeback dog","Velvet",8);
      
        Dang.showSTDinfopets();
         System.out.println("is the dog got short hair :"+Dang.Doc_Action1_Hair("Short"));
        Dang.Dog_Action2_act("Running");
        Dang.Dog_Action3_BarkandSize("medium ", "Grr! Bark! Bark!");

        Fish Jerz = new Fish("Jerz", "Sun fish", "Gray", 6);
        Jerz.showSTDinfopets();
        Jerz.Fish_Action1_Size("Big");
        Jerz.Fish_Action2_act("Swim very slowly");
        Jerz.Fish_Action3_CheckSalt("true");
    }
    
}
