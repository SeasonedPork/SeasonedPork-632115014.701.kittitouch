package Week__7;
public class Application {

    public static void main(String[]args)
    {

        Normal_bicycle Bonde  = new Normal_bicycle("Ding ! Ding ! Dong !", 10, true);
         Bonde.Accelerate();
         Bonde.CheckSpeed();
         Bonde.DeAccelerate();
         Bonde.CheckSpeed();
         for (int i = 0 ; i <= 20 ; i++)
         {
             Bonde.Accelerate();
         }
         Bonde.CheckSpeed();
         for(int i = 0 ; i<= 20 ; i++)
         {
             Bonde.DeAccelerate();
         }
         Bonde.CheckSpeed();
        Mountain_Bicycle UCI_MCB_MARATHON_Series = new Mountain_Bicycle("Monster trak!", 10, true, 1);
        UCI_MCB_MARATHON_Series.Accelerate();
        UCI_MCB_MARATHON_Series.ChangeGear(2);
        UCI_MCB_MARATHON_Series.CheckSpeed();
        UCI_MCB_MARATHON_Series.DeAccelerate();
        UCI_MCB_MARATHON_Series.CheckSpeed();
        UCI_MCB_MARATHON_Series.Accelerate();
       


    }
    
}
