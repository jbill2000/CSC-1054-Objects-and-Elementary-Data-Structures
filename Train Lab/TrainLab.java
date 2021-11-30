//Program created by Jeremy Bill to utilize my train and train methods to create a train system type game kinda.
import java.util.*;
import java.text.*;



public class TrainLab
{
     public static void main(String[] args)
     {
         //Various variables and intialization
         Scanner scan= new Scanner(System.in);
         Train x= new Train(2);
         Train y= new Train(7);
         TrainSystem system= new TrainSystem(x,y);
         System.out.println(system);
         String entry="0";
         //Do while loop with while condition set to "true" Ie. it will run until the trains crash and hits a break;
         do
         {  //Moves the X train
            System.out.println("Move the X train left (enter L) or right (enter R)?: ");
            entry=scan.next();
            //Trash collector/checker for incorrect input
              while(!entry.equals("R") && !entry.equals("L"))
               {
               System.out.println("Please enter an R or L");
               entry=scan.next();
               }
              
              //Code assuming input is good that moves right or left
              if(entry.equals("R"))
              {
                  system.TrainSystemMove(x,1);
              }
              else if(entry.equals("L"))
              {
                  system.TrainSystemMove(x,-1);
              }
              
              
                
              //Crash Count
              if(x.getPosition()==y.getPosition())
              { 
               System.out.println("CRASH");
               System.out.println("Moves before Crash: "+Train.trainCount());
               break;
              }
              //Prints out the system after the crash
              System.out.println(system);
              
              //Moves the Y train
              System.out.println("Move the Y train left (enter L) or right (enter R)?: ");
               entry=scan.next();
               
               //Trash collector/checker for incorrect input
                while(!entry.equals("R") && !entry.equals("L"))
               {
               System.out.println("Please enter an R or L");
               entry=scan.next();
               }
               
              //Code assuming input is good that moves right or left
              if(entry.equals("R"))
              {
                  system.TrainSystemMove(y,1);
              }
              else if(entry.equals("L"))
              {
                  system.TrainSystemMove(y,-1);
              }
              
               //Prints out the system after the crash
              if(x.getPosition()==y.getPosition())
              {
                  System.out.println("CRASH");
                  System.out.println("Moves before Crash: "+Train.trainCount());
                  break;
              }
              //Prints out the system after the crash
              System.out.println(system);

              
         }while(true);
            
         
     }
     
}