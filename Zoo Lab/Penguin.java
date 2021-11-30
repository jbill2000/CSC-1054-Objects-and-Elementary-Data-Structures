public class Penguin extends Bird
{

   //protected String callsign;
   //protected int mealseaten;  
   public Penguin(String callsign, int mealsEaten)
   {
      super(callsign,mealsEaten);
   }
   
   
   public void eat()
   {
   
     mealsEaten= mealsEaten+3;
   }
   
   public int getMealsEaten()
   {
      return mealsEaten;
   }
   
   public void swim()
   {  
      System.out.println("Swimming Penguin!!!");
   }
   
   public boolean getSwim()
   {
      return true;
   }
   
   public void chirp()
   {
      System.out.println("Penguin is chirping!");
   }

   public void fly()
   {
   
      System.out.println("Penguins cannot fly");
   
   }
   
   public void tapDance()
   {
      System.out.println("Tap Dancing Penguins!!!!");
   }
   
   public String getSign()
   {
      return callsign;
   }
   
   
   
   
   
   public String toString()
   {  
      String penguindata= "Penguin: \n";
      penguindata+= "Meals Eaten: "+getMealsEaten()+"\n";
      penguindata+= "Can Swim: "+getSwim()+"\n";
      penguindata+="Callsign: "+callsign+"\n";
      
      return penguindata;
   }
   

      
}
