//Class created by Jeremy Bill as part of the Train Lab.
import java.util.*;
import java.text.*;



public class TrainSystem
{
     
     //Variables
     private Train x;
     private Train y;
     
     //Constructor
    public TrainSystem(Train x_in, Train y_in)
    {
        x=x_in;
        y=y_in;
    }
    //Move method to decide if it goes left or right takes in a train and an int. The int is either 1 or -1. 
    public void TrainSystemMove(Train t, int s)
   {
      //If int is 1 it will move right
      if(s==1)
      { 
        int newPos= t.getPosition()+1;
         t.Trainpos(newPos);
   
      }
      //If int is -1 it will move left.
      else if(s==-1)
      { 
          int newPos= t.getPosition()-1;
          t.Trainpos(newPos);
          
      }
      
   }
   //Print method
   public String toString()
   {
     //Top of the train system.  
     String printSystem = "===============\n";
      
     //For loop to print the middle of the system and replace X's and Y's where it is needed.
      for(int i=0; i<15; i++)
     {   if(x.getPosition()==i)
         {
           printSystem+=("X");
         }
         else if(y.getPosition()==i)
         {
           printSystem+=("Y");
         }
         else
         printSystem+=("-");
      
     }
     //Prints bottom of the system
      printSystem += "\n===============\n";
      //Returns the whole system.
   return printSystem;

   
   
   }
   
   
     
      

     
}