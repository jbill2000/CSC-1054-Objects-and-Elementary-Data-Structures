public class HummingBird extends Bird
{
     
     
   //protected String hummName;
  //protected String hummBcallsign;
   //protected int hummBmealseaten;  
   public HummingBird(String hummName, String hummBcallsign, int hummBmealsEaten)
   {
      super(hummName,hummBcallsign,hummBmealsEaten);
   }
   
   
   public void eat()
   {
     
     hummBmealsEaten++;
   }
   
   public int getHumMealsEaten()
   {
      return hummBmealsEaten;
   }
   
   public void swim()
   {  
      System.out.println("Humming Birds cannot swim! ");
   }
   public boolean getSwim()
   {
      return false;
   }
   
   public void chirp()
   {
      System.out.println(hummName+ " is chirping!");
   }

   public void fly()
   {
   
      System.out.println(hummName+" is flying high!!!!");
   
   }
   
   public String getSign()
   {
      return hummBcallsign;
   }



 public String toString()
   {  
      String hummbirddata= "Name: "+hummName+"\n";
      hummbirddata+= "Meals Eaten: "+getHumMealsEaten()+"\n";
      hummbirddata+= "Can Swim: "+getSwim()+"\n";
     hummbirddata+="Callsign: "+hummBcallsign+"\n";
      
      return hummbirddata;
   }
   


}


