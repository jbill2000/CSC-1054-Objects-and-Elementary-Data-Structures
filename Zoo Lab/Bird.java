public abstract class Bird
{  
   //Methods
   public abstract void fly();
   public abstract void chirp();
   public abstract void swim();
   public abstract void eat();
   //Penguin Variables
   protected String callsign;
   protected boolean canSwim;
   protected int mealsEaten;
   //HummingBird Variables
    protected String hummBcallsign;
   protected int hummBmealsEaten;
   protected String hummName;
   
   //Penguin Constructor
   public Bird(String callsign, int mealsEaten)
   {
         this.callsign=callsign;
         this.mealsEaten=mealsEaten;
   
   }
   //HummingBird Constructor
   
   public Bird(String hummName, String hummBcallsign, int hummBmealsEaten)
   {
      this.hummName=hummName;
      this.hummBcallsign=hummBcallsign;
      this.hummBmealsEaten=hummBmealsEaten;
   }




}