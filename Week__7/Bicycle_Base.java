package Week__7;

public class Bicycle_Base {
   String NameOfBicycle ;
   boolean Tire = true;
   int speed,Fixedgear = 1;

   //bicycle base stuff (variable method constructor)
   public Bicycle_Base()
   {}
   public Bicycle_Base(String name,int speed,boolean tire)
   {
       this.speed = speed * this.Fixedgear;
       this.NameOfBicycle = name;
       this.Tire = tire;
       this.Fixedgear = 1;
   }

    public Bicycle_Base(String name,int speed,boolean tire,int gear)
   {
       this.speed = speed * this.Fixedgear;
       this.NameOfBicycle = name;
       this.Tire = tire;
       this.Fixedgear = gear;
   }
   public void ChangeName(String i)
   {
       this.NameOfBicycle = i;
   }
   public void ChangeTire(boolean i)
   {
       this.Tire = i;
   }

   public void CheckSpeed()
   {
        if(this.Tire == false)
       {
           System.out.println("Tire is flat!!");
       }
       System.out.println("Current speed is : "+this.speed);
   }

   //as it name check first if not not change value
   public void Accelerate()
   {int speed = 5;
       if(this.Tire == false)
       {
           System.out.println("Tire is flat!!");
       }
       int speedCheck =  (speed*Fixedgear) + this.speed;
       if(speedCheck > 100)
       {
           System.out.println("Whoa too much speed");   
       }
       else{
           this.speed = speedCheck;

       }
        
   }

   public void DeAccelerate()
   {
       int sped = 5;
        if(this.Tire == false)
       {
           System.out.println("Tire is flat!!");
       }
       int speedcheck = this.speed - sped;
       if(speedcheck <= 0)
       {
           System.out.println("the Bicycle is already stop");
       }
       else
       {
           this.speed = speedcheck;
       }
   }


}
