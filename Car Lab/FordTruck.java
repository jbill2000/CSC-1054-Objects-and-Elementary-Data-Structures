public class FordTruck extends Car
{

       private int HaulingCapacity=100;

      public FordTruck(String name, float speed, int HaulingCapacity)
      {
         super(name,speed);
         this.HaulingCapacity=HaulingCapacity;
      }
      
      public float drive()
      {
         speed++;
         return speed;
      }
      
      public String toString()
      {
         String dataprint= "Name: "+name+"\n";
         dataprint += "Speed: "+speed+"\n";
         dataprint += "Hauling Capacity: "+HaulingCapacity+"\n";
         return dataprint;
      }

}