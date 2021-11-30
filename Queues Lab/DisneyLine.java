//Imports to get the queue statement to work
import java.util.LinkedList;
import java.util.Queue;
public class DisneyLine
{
   //variables
   LinkedListNode head=null;
   LinkedListNode tail=null;
   private int countdeq=0;
   private int countPeek=0;
   //constructor
   public DisneyLine()
   {
   
   }

   //enqueue normal line
   public void enqueueNorm(Person2 person)
   {
      Norm.add(person);
      
      
   }
   //enqueue fast line
   public void enqueueFast(Person2 person)
   {
      Fast.add(person);
      
   
   }
   //dequeue
   public void dequeue()
   {
      
      //Even
      if(countdeq%2==0)
      {
         //If normal peek is not equal to null it removes and increments a counter
         if(Norm.peek()!=null)
         {
            Norm.remove();
            countdeq++;
         }
         //else if fast peek is not equal to null it removes and increments a counter
         else if(Fast.peek()!=null)
         {
            Fast.remove();
            countdeq++;
         
         }
         //prints no one is in line
         else
          System.out.println("No one is in line!");
       }
       
      //Odd
       else
       {
         //if fast peek != null it removes from fast and increments a counter
         if(Fast.peek()!=null)
         {
            Fast.remove();
            countdeq++;
         
         
         }
       
         //if normal peek != null it removes from normal and increments a counter
         else if(Norm.peek()!=null)
         {
               Norm.remove();
               countdeq++;
         
         }
         else
         //prints
          System.out.println("No one is in line!");
         
       }
       
   
        
      
      
      
      
      
   }
   //peek method
   public void peek()
   {
    
         
         // if both are null the line is empty
         if(Fast.peek()==null && Norm.peek()==null)
         {
         
            System.out.println("Both Lines are Empty");
            
            
         }
         //if they both arent null
         else if(Fast.peek()!=null && Norm.peek()!=null)
         {
         
                     //if counter%2==0 it prints out normal
                  if(countPeek%2==0)
                  {
                    System.out.println(Norm.peek());
                    countPeek++;
                  
                  }
                  //prints out fast if odd
                  else if(countPeek%2!=0)
                  {
                  
                     System.out.println(Fast.peek());
                     countPeek++;
                  }
                  
                  
                  
                  
                
                  
         
         
         }
            //If fast is null and normal is not it will only print normal
         else if(Fast.peek()==null && Norm.peek()!=null)
        {
                     System.out.println(Norm.peek());
                    countPeek++;
        }
         //if fast is not null and normal is it will only print fast
         else if(Fast.peek()!=null && Norm.peek()==null)
         {
         
               System.out.println(Fast.peek());
            countPeek++;
         
         }
   }
   
   //is empty
  public boolean isEmpty()
  {
      //if both are null return true
     if(Fast.peek()==null && Norm.peek()==null)
         {
         
            return true;
            
         }
         //else return false
     else
     {
      return false;
     } 
  }
  //tostring
  public String toString()
  {
      System.out.println("Normal:"+Norm);
      System.out.println("Fast:"+Fast);
      String toReturn="";
      return toReturn;
  
  
  
  }
  
  //Linkedlist definition using the queue java class
   Queue<Person2> Norm= new LinkedList<>();
   Queue<Person2> Fast= new LinkedList<>();
   public static void main(String[] args)
   {
      //Line creation
      DisneyLine line= new DisneyLine();
      //Normal Persons
       Person2 person1= new Person2("normal1",1);
       Person2 person2= new Person2("normal2",2);
       //Fast person
       Person2 fastperson1= new Person2("fast1",1);
      //adds people
      line.enqueueNorm(person1);
      line.enqueueNorm(person2);
      //peeks
      line.peek();
      //dequeues
      line.dequeue();
      //enqueues fast
      line.enqueueFast(fastperson1);
      //peek
      line.peek();;
      //dequeue
      line.dequeue();
      //peek
      line.peek();
      //Normal persons 3-22 creates and adds them
      Person2 person3= new Person2("normal3",3);
       line.enqueueNorm(person3);
       Person2 person4= new Person2("normal4",4);
       line.enqueueNorm(person4);
       Person2 person5= new Person2("normal5",5);
       line.enqueueNorm(person5);
       Person2 person6= new Person2("normal6",6);
       line.enqueueNorm(person6);
       Person2 person7= new Person2("normal7",7);
       line.enqueueNorm(person7);
       Person2 person8= new Person2("normal8",8);
       line.enqueueNorm(person8);
       Person2 person9= new Person2("normal9",9);
       line.enqueueNorm(person9);
       Person2 person10= new Person2("normal10",10);
       line.enqueueNorm(person10);
       Person2 person11= new Person2("normal11",11);
       line.enqueueNorm(person11);
       Person2 person12= new Person2("normal12",12);
       line.enqueueNorm(person12);
       Person2 person13= new Person2("normal13",13);
       line.enqueueNorm(person13);
       Person2 person14= new Person2("normal14",14);
       line.enqueueNorm(person14);
       Person2 person15= new Person2("normal15",15);
       line.enqueueNorm(person15);
       Person2 person16= new Person2("normal16",16);
       line.enqueueNorm(person16);
       Person2 person17= new Person2("normal17",17);
       line.enqueueNorm(person17);
       Person2 person18= new Person2("normal8",18);
       line.enqueueNorm(person18);
       Person2 person19= new Person2("normal19",19);
       line.enqueueNorm(person19);
       Person2 person20= new Person2("normal20",20);
       line.enqueueNorm(person20);
       Person2 person21= new Person2("normal21",21);
       line.enqueueNorm(person21);
       Person2 person22= new Person2("normal22",22);
       line.enqueueNorm(person22);
       
       //Fast Persons creates and adds them
       Person2 fastperson2= new Person2("fast2",2);
       line.enqueueFast(fastperson2);
       Person2 fastperson3= new Person2("fast3",3);
       line.enqueueFast(fastperson3);
       Person2 fastperson4= new Person2("fast4",4);
       line.enqueueFast(fastperson4);
       Person2 fastperson5= new Person2("fast5",5);
       line.enqueueFast(fastperson5);
       Person2 fastperson6= new Person2("fast6",6);
       line.enqueueFast(fastperson6);
       
       
       
       //While the line is not empty
      while(line.isEmpty()!=true)
       {
            //peeks
            line.peek();
            //dequeues
            line.dequeue();
            

       
       }
       //dequeues again
       line.dequeue();
       System.out.println(" ");
       
       //New Stuff(Test Cases)
       
       
      //List defs
       
    Queue<Person2> Norm2= new LinkedList<>();
   Queue<Person2> Fast2= new LinkedList<>();
      //new line
      DisneyLine line2= new DisneyLine();
      
      //dequeus
      line2.dequeue();
      //peeks
      line2.peek();
      //adds 3 new fast people (Ik i had to call them fast 7 even though they were first as it was interfering with previous main, same goes for normal)
      Person2 fastperson7= new Person2("fast1",1);
       line2.enqueueFast(fastperson7);
       Person2 fastperson8= new Person2("fast2",2);
       line2.enqueueFast(fastperson8);
       Person2 fastperson9= new Person2("fast3",3);
       line2.enqueueFast(fastperson9);
       
       
       

      //adds 5 normal people
       Person2 person23= new Person2("normal1",1);
       line2.enqueueNorm(person23);
       Person2 person24= new Person2("normal2",2);
       line2.enqueueNorm(person24);
       Person2 person25= new Person2("normal3",3);
       line2.enqueueNorm(person25);
       Person2 person26= new Person2("normal4",4);
       line2.enqueueNorm(person26);
       Person2 person27= new Person2("normal5",5);
       line2.enqueueNorm(person27);
       
       
       //adds fast people
        Person2 fastperson10= new Person2("fast4",4);
       line2.enqueueFast(fastperson10);
       Person2 fastperson11= new Person2("fast5",5);
       line2.enqueueFast(fastperson11);
      
      //same loop as up top
       while(line2.isEmpty()!=true)
       {
            //peeks
            line2.peek();
            //dequeue
            line2.dequeue();
            

       
       }
       //dequeue one last time.
       line2.dequeue();
      
      
      
      
   }
}