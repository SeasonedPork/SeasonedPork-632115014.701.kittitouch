package Lab12;

public class StudentData {
   

   //test case code
   public static void main(String[]args)
   {
   Student std01 = new Student("Mark",18,4.00); 
   Student std02 = new Student("Jane",18,2.20);
   Student std03 = new Student("Peter",19,4.00);
   Student std04 = new Student("Mark",22,1.75);
   //name
       System.out.println(std01.Name.equals(std02.Name));//01.02
       System.out.println(std01.Name.equals(std03.Name));//01.03
       System.out.println(std02.Name.equals(std04.Name));//02.04
       System.out.println(std01.Name.equals(std04.Name));//01.04
       //age
       System.out.println(std01.Age.equals(std02.Age));//03.01
       System.out.println(std03.Age.equals(std04.Age));//03.02
       System.out.println(std01.Age.equals(std03.Age));//03.04
       //GPA
       System.out.println(std01.GPA.equals(std03.GPA));//04.01
       System.out.println(std02.GPA.equals(std04.GPA));//04.02
       System.out.println(std02.GPA.equals(std03.GPA));//04.03
   }
   
}
