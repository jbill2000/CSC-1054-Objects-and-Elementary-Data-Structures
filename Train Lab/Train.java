//Class created by Jeremy Bill for the train Lab
import java.util.*;
import java.text.*;



public class Train
{     
     //Variables
     private int position=0;
     private static int count=0;
     private Train x;
     private Train y;
     
     //Constructor
   public Train(int p)
    {
       position=p;
       
    }
    
    //Mutator
    public void Trainpos(int p)
   {  //Sets position to 14 if less than 0 so it doesn't go off the track
      if(p<0)
      { 
         position=14;
         count++;
      }
      //Sets position to 0 if greater than 14 so it doesn't go off the track.
      else if(p>14)
      { 
         position=0;
         count++;
      }
      //Else sets position equal to p
      else
         position=p;
         count++;
   }
      //Static method to return amount of times train moves
      public static int trainCount()
     {
         
         return count;
     }
     //Retrieves position of the train as an int.
     public int getPosition()
     {
            return position;
     }



     
     
     
}