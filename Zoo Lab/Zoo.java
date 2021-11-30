import java.text.*;
import java.util.*;
public class Zoo
{
     public static void main(String[] args)
     {//Code Begins Here
      ArrayList<Bird>birds = new ArrayList<Bird> ();
      //Scanner
      Scanner scan= new Scanner(System.in);
      String choice;
      String hummName;
      String callsign;
      int mealsEaten;
      int hummBmealsEaten;
      String hummBcallsign;
      //Begin
      
      System.out.println("What would you like to do? ");
      
      //Menu
      System.out.println("0 - eat");
      System.out.println("1 - chirp");
      System.out.println("2 - tap dance penguins");
      System.out.println("3 - add new bird");
      System.out.println("4 - fly");
      System.out.println("5 - swim");
      System.out.println("6 - remove based on callsign");
      System.out.println("7 - print");
      System.out.println("8 - quit");
      String decider= scan.next();
      
      do
      {
         switch(decider)
         {  
            //Eat
            case "0": 
            
            for(int i=0; i<birds.size();i++)
            {
               if(birds.get(i) instanceof Penguin)
               {
                  Penguin z= (Penguin) birds.get(i); 
                  z.eat();
               }
               if(birds.get(i) instanceof HummingBird)
               {
                  HummingBird z= (HummingBird) birds.get(i);
                  z.eat();
               }
            }
            
            
            
            
            System.out.println("What would you like to do? ");
            System.out.println("0 - eat");
            System.out.println("1 - chirp");
            System.out.println("2 - tap dance penguins");
            System.out.println("3 - add new bird");
            System.out.println("4 - fly");
            System.out.println("5 - swim");
            System.out.println("6 - remove based on callsign");
            System.out.println("7 - print");
            System.out.println("8 - quit");
            decider=scan.next();

            break;

            //Chirp
            case "1": 
            
            for(int j=0; j<birds.size(); j++)
            {
               if(birds.get(j) instanceof Penguin)
               {
                  Penguin z= (Penguin) birds.get(j); 
                  z.chirp();
               }
               if(birds.get(j) instanceof HummingBird)
               {
                  HummingBird z= (HummingBird) birds.get(j);
                  z.chirp();
               }
            }

           
           
           
           
           
           
           
           
            System.out.println("What would you like to do? ");
            System.out.println("0 - eat");
            System.out.println("1 - chirp");
            System.out.println("2 - tap dance penguins");
            System.out.println("3 - add new bird");
            System.out.println("4 - fly");
            System.out.println("5 - swim");
            System.out.println("6 - remove based on callsign");
            System.out.println("7 - print");
            System.out.println("8 - quit");
            decider=scan.next();

            break;
            //Tap Dance Penguins
            case "2": 
             for(int l=0; l<birds.size();l++)
            {
               if(birds.get(l) instanceof Penguin)
               {
                  Penguin z= (Penguin) birds.get(l); 
                  z.tapDance();
               }
            }
            System.out.println("What would you like to do? ");
            System.out.println("0 - eat");
            System.out.println("1 - chirp");
            System.out.println("2 - tap dance penguins");
            System.out.println("3 - add new bird");
            System.out.println("4 - fly");
            System.out.println("5 - swim");
            System.out.println("6 - remove based on callsign");
            System.out.println("7 - print");
            System.out.println("8 - quit");
            decider=scan.next();

            
            break;
            //Add new bird
            case "3": 
            System.out.println("Which would you like to add? Penguin (P) or HummingBird (H)?");
            choice=scan.next();
            if(choice.equals("H"))
            {
              System.out.println("Please Enter in a name, callsign, and the number of meals previously eaten.");
              hummName=scan.next();
              hummBcallsign=scan.next();
              hummBmealsEaten= scan.nextInt();
              birds.add(new HummingBird(hummName,hummBcallsign,hummBmealsEaten));
            }
            else if(choice.equals("P"))
            {
              System.out.println("Please Enter in a callsign, and the number of meals previously eaten.");
              callsign=scan.next();
              mealsEaten= scan.nextInt();
              birds.add(new Penguin(callsign,mealsEaten));
            }
            else
            System.out.println("Incorrect Choice, please choose another menu option");
            
              System.out.println("0 - eat");
              System.out.println("1 - chirp");
              System.out.println("2 - tap dance penguins");
              System.out.println("3 - add new bird");
              System.out.println("4 - fly");
              System.out.println("5 - swim");
              System.out.println("6 - remove based on callsign");
              System.out.println("7 - print");
              System.out.println("8 - quit");
              
              decider=scan.next();           
            break;
            //Fly
            case "4": 
            for(int p=0; p<birds.size();p++)
            {
               if(birds.get(p) instanceof Penguin)
               {
                  Penguin z= (Penguin) birds.get(p); 
                  z.fly();
               }
               if(birds.get(p) instanceof HummingBird)
               {
                  HummingBird z= (HummingBird) birds.get(p);
                  z.fly();
               }
            }
            System.out.println("What would you like to do? ");
            System.out.println("0 - eat");
            System.out.println("1 - chirp");
            System.out.println("2 - tap dance penguins");
            System.out.println("3 - add new bird");
            System.out.println("4 - fly");
            System.out.println("5 - swim");
            System.out.println("6 - remove based on callsign");
            System.out.println("7 - print");
            System.out.println("8 - quit");
            decider=scan.next();

            break;
            //Swim
            case "5": 
            
            for(int r=0; r<birds.size(); r++)
            {
               if(birds.get(r) instanceof Penguin)
               {
                  Penguin z= (Penguin) birds.get(r); 
                  z.swim();
               }
               if(birds.get(r) instanceof HummingBird)
               {
                  HummingBird z= (HummingBird) birds.get(r);
                  z.swim();
               }
            }

            
            
            
            
            
            System.out.println("What would you like to do? ");
            System.out.println("0 - eat");
            System.out.println("1 - chirp");
            System.out.println("2 - tap dance penguins");
            System.out.println("3 - add new bird");
            System.out.println("4 - fly");
            System.out.println("5 - swim");
            System.out.println("6 - remove based on callsign");
            System.out.println("7 - print");
            System.out.println("8 - quit");
            decider=scan.next();

            break;
            //Remove based on callsign
            case "6": 
            
            System.out.println("Which callsign would you like to remove?: ");
           String callsignremove= scan.next();
            
            
            for(int a=0; a<birds.size(); a++)
            {
               if(birds.get(a) instanceof Penguin)
               {
                  Penguin z= (Penguin) birds.get(a);
                  String q= z.getSign();
                  if(q.equals(callsignremove))
                  {
                     birds.remove(a);
                  } 
                 
               }
               if(birds.get(a) instanceof HummingBird)
               {
                  HummingBird z= (HummingBird) birds.get(a);
                  String q= z.getSign();
                  if(q.equals(callsignremove))
                  {
                     birds.remove(a);
                  } 

               }
            }

            
            
            
            
            
            
            System.out.println("What would you like to do? ");
            System.out.println("0 - eat");
            System.out.println("1 - chirp");
            System.out.println("2 - tap dance penguins");
            System.out.println("3 - add new bird");
            System.out.println("4 - fly");
            System.out.println("5 - swim");
            System.out.println("6 - remove based on callsign");
            System.out.println("7 - print");
            System.out.println("8 - quit");
            decider=scan.next();

            break;
            //print
            case "7": 
            
            for(int b=0; b<birds.size(); b++)
            {
               if(birds.get(b) instanceof Penguin)
               {
                  Penguin z= (Penguin) birds.get(b); 
                  System.out.println(z);
               }
               if(birds.get(b) instanceof HummingBird)
               {
                  HummingBird z= (HummingBird) birds.get(b);
                  System.out.println(z);
               }
            }

            
            
            
            
            
            
            System.out.println("What would you like to do? ");
            System.out.println("0 - eat");
            System.out.println("1 - chirp");
            System.out.println("2 - tap dance penguins");
            System.out.println("3 - add new bird");
            System.out.println("4 - fly");
            System.out.println("5 - swim");
            System.out.println("6 - remove based on callsign");
            System.out.println("7 - print");
            System.out.println("8 - quit");
            decider=scan.next();

            break;

            default: 
              System.out.println("Incorrect Menu Option, please select one of our other options.");
              System.out.println("Here is the menu again, for your convenience.");
              System.out.println("0 - eat");
              System.out.println("1 - chirp");
              System.out.println("2 - tap dance penguins");
              System.out.println("3 - add new bird");
              System.out.println("4 - fly");
              System.out.println("5 - swim");
              System.out.println("6 - remove based on callsign");
              System.out.println("7 - print");
              System.out.println("8 - quit");
                decider=scan.next();
         }
        }while(!decider.equals("8"));      
         
         
         
          
     }
     
}