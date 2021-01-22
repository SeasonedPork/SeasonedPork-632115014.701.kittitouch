package Week__7;

public class Mountain_Bicycle extends Bicycle_Base{

    public Mountain_Bicycle(String name,int speed,boolean tire,int gear)
    {
        this.NameOfBicycle = name;
        this.Tire = tire;
        this.speed = speed;
        this.Fixedgear = gear;
    }

    
    
      //for change the gear if speed is > 100 not change value
   public void ChangeGear(int gear)
   {
        
       
        if(gear < 1 || this.Fixedgear > 8)
        {
            System.out.println("there's no gear that exist!!");
        }
         if(gear >= 1 && gear <= 8)
        {
            this.Fixedgear = gear;
            System.out.println("Current gear : " + this.Fixedgear);
        }

   }

}
