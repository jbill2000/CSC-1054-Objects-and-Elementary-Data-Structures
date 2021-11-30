//you must comment this code so I know you understand it :)

//Created by Jeremy Bill with some parts given by Dr.Mood as part of Lab 9.
//Replaced Current with Present to just make it different and head with Enginecar since i had a train theme going on. 
public class LinkedList
{
   //Variables
   private LinkedListNode engineCar;
   private int numberOfItems;
   private boolean check=true;
   
  
   ///Constructor
   public LinkedList()
   {
      engineCar = null;
      numberOfItems=0;
   }
   //Retrieves number of items
   public int getNumberOfItems()
   {
      return numberOfItems;
   }
   //Method to insert data into the node
   public void insert(int theData)
   {
      LinkedListNode lln = new LinkedListNode(theData);
      lln.setNext(engineCar);
      engineCar = lln;
      System.out.println("Inserting "+theData);
      numberOfItems++;
   }
   //method to input a value at a particular index
   public void indexerIn(int indexer, int value)
   {
       //Newnode called caboose  that is set = to head
      LinkedListNode caboose;
      caboose=engineCar;
      System.out.println("Inserting "+value+" at index "+indexer);
      //If the index is less than or = to 0
      if(indexer<=0)
      {
         //Creates a new node and sets it equal to what used to be the head and then increment number of items after it is redefined as head
         LinkedListNode node = new LinkedListNode(value);
         node.setNext(engineCar);
         engineCar= node;
         numberOfItems++;
      
      }
      //if its greater than number of items
      else if(indexer>=numberOfItems)
      {
         //Loop through till the last node 
         for(int i=0; i<numberOfItems-1; i++)
         {
         
          caboose = caboose.getNext();
         
         }
         //This injects it as the last node
        LinkedListNode create= new LinkedListNode(value);
         caboose.setNext(create);
         numberOfItems++;
      
      }
       
      else
      {
            //move through the list till the node before the index
           for(int j=0; j<indexer-1; j++)
           {
               caboose=caboose.getNext();
           }
           //Creates a new node and then sets it to point to the index after. 
         LinkedListNode create= new LinkedListNode(value);
         create.setNext(caboose.getNext());
         caboose.setNext(create);
         
         numberOfItems++;
         
      }  
   
   }
   
   //Method to delete at a particular index
   public boolean deleteIn(int indexer)
   {
      //Redefined Caboose
     LinkedListNode caboose;
     
     //if head is null then it will return false
      if(engineCar == null)
      {
          return false;
      }
    //if indexer =0 it sets Enginecar to the second one, so thats where it always starts. 
      else if(indexer==0)
      {
         System.out.println("Deleting the value at index "+indexer);
         engineCar=engineCar.getNext();
         numberOfItems--;
         return true;
      }
      //If index is out of bounds it wont do anything
      else if(indexer < 0 || indexer > numberOfItems-1)
      {
         System.out.println("Deleting the value at index "+indexer);
         return false;
      }
      //Sets caboose to head 
      else
      {
            System.out.println("Deleting the value at index "+indexer);
            caboose=engineCar;
            //loops through
         for(int k=0; k<indexer-1; k++)
         {
            caboose=caboose.getNext();
            
         }
         //replaces the node
         caboose.setNext(caboose.getNext().getNext());
         numberOfItems--;
         return true;
      }

   
   
   
   }
   //Delete method Dr.Mood gave us I slightly modified some variable names but other than that I didnt do anything.
   public boolean delete(int value)
   {
      System.out.println("Deleting "+value);
      //if head = null nothing will happen
      if(engineCar == null)
      {  
       return false;
      }
      //if the value at engine car is equal to value it will get the next node and decrease number of items
      if(engineCar.getData() == value)
      {
         engineCar = engineCar.getNext();
         numberOfItems--;
         return true;
      }
      //Set present to the next node before head
      LinkedListNode present = engineCar.getNext();
      //sets prev to the old head
      LinkedListNode prev = engineCar;
      //Rotates through until it has the same as the value entered 
      while(present != null && present.getData()!= value)
      {
         prev = prev.getNext();
         present = present.getNext();
      }
        //If it finds a value that is not null it sets the next node to the one after the first one it finds
      if(present!= null)
      {
         prev.setNext(present.getNext());
         numberOfItems--;
         return true;
      }
      return false;  
   }
   //To string to print the list
   public String toString()
   {
      String toReturn = "Printing the list";   
      LinkedListNode present = engineCar;
      while(present!= null)
      {           
         toReturn = toReturn+" " +present.getData();
         present = present.getNext();
      }
      return toReturn;
   }
   
   
   
   //New Stuff
   //Exterminate method (delete all)
   public void exterminate(int value)
   {
      System.out.println("Deleting all "+value+ "s");
      if(engineCar==null)
      {
         //Nothing happens because its null
      
      }
      //checks the head and if it finds it it removes it
       while(engineCar!= null && engineCar.getData()==value)
       {
            engineCar=engineCar.getNext();
            numberOfItems--;
        }
        //sets present to the head
        LinkedListNode present=engineCar;
        //while present does not equal null
        while(present.getNext()!=null)
        {
            //if the next nodes data = value it sets the node to the one after it and decreases number of items
            if(present.getNext().getData()==value)
            {
               present.setNext(present.getNext().getNext());
               numberOfItems--;
               
            }
            //continues on through the list. 
            else
            {
               present=present.getNext();
            
            
            }
         
        
        
        
        }    
         

   }
   //Retrun last index (or -1)
   public int boomerang(int value)
   {
            //Variables
          int count=1;
        int memberberries=-1;
       LinkedListNode present=engineCar;
     //while head does not equal null it will keep going and increase memberberries which is a holder variable of sorts. 
      while(present!= null && present.getData()==value)
      {  
         present=present.getNext();
         memberberries++;
      }
      
     
        
        //While present does not equal null
      
        while(present.getNext()!=null)
        {
              
            //if the next nodes data = value it gets the next node and sets holder variable to count
            if(present.getNext().getData()==value)
            {
               
               
               present=present.getNext();
              
               memberberries=count;
                
               
             
               
            }
           
            //it continues through
            else
            {
               present=present.getNext();
              
               
               
            
            }
            //increments count
            count++;
          
         
        
        
        
        }    
            
         
         
      //print statement 
     System.out.println("Finding the last index of "+value+":"+memberberries);
        
      //returns memory variable
      return memberberries;
   
   }
   
   
   
   
   
   
//Main
   public static void main(String[] args)
   {
      LinkedList slinkyList= new LinkedList();
     /*System.out.println(slinkyList);
      slinkyList.insert(5);
      System.out.println(slinkyList);
      slinkyList.insert(4);
      System.out.println(slinkyList);
      slinkyList.insert(3);
      System.out.println(slinkyList);
      slinkyList.insert(2);
      System.out.println(slinkyList);
      slinkyList.insert(1);
      System.out.println(slinkyList);
      slinkyList.insert(5);
      System.out.println(slinkyList);
      slinkyList.insert(4);
      System.out.println(slinkyList);
      slinkyList.insert(3);
      System.out.println(slinkyList);
      slinkyList.insert(2);
      System.out.println(slinkyList);
      slinkyList.insert(1);
      System.out.println(slinkyList);
      
      //Deleting 
      slinkyList.delete(1);
      System.out.println(slinkyList);
      slinkyList.delete(1);
      System.out.println(slinkyList);
      slinkyList.delete(1);
      System.out.println(slinkyList);
      
      //Inserting
      
      slinkyList.indexerIn(3,10);
      System.out.println(slinkyList);
      slinkyList.indexerIn(-1,10);
      System.out.println(slinkyList);
      
      
      //Deleting at Index
      slinkyList.deleteIn(3);
      System.out.println(slinkyList);
      slinkyList.deleteIn(0);
      System.out.println(slinkyList);
      slinkyList.deleteIn(7);
      System.out.println(slinkyList);
      
      //Inserting at indexer
      
      slinkyList.indexerIn(0,10);
      System.out.println(slinkyList);
      slinkyList.indexerIn(10,10);
      System.out.println(slinkyList);
      
      slinkyList.deleteIn(8);
      System.out.println(slinkyList);
      slinkyList.deleteIn(8);
      System.out.println(slinkyList);
      System.out.println("Length:"+slinkyList.getNumberOfItems());
      
      
      
      //New Stuff
      
      slinkyList.insert(2);
      System.out.println(slinkyList);
      slinkyList.exterminate(2);
      System.out.println(slinkyList);
      slinkyList.boomerang(4);
      System.out.println(slinkyList);
      slinkyList.exterminate(4);
      System.out.println(slinkyList);
       slinkyList.insert(5);
       System.out.println(slinkyList);
        slinkyList.exterminate(5);
        System.out.println(slinkyList);
      slinkyList.boomerang(3);
      System.out.println(slinkyList);
      slinkyList.boomerang(1);
      System.out.println(slinkyList);
     slinkyList.insert(6);
      System.out.println(slinkyList);
      slinkyList.boomerang(6);
      System.out.println(slinkyList);*/
      
      //TA code They told me to test 
      slinkyList.deleteIn(0);
      System.out.println(slinkyList);
      slinkyList.indexerIn(-1,-1);
       System.out.println(slinkyList);
      slinkyList.insert(2);
       System.out.println(slinkyList);
      slinkyList.insert(2);
       System.out.println(slinkyList);
      slinkyList.boomerang(2);
       System.out.println(slinkyList);
       slinkyList.exterminate(2);
        System.out.println(slinkyList);
      
      
     
           
      
      
   }
}