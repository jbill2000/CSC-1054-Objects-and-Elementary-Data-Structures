//Code from lab 9 but required to run lab 10 i guess so im submitting it anyway
public class LinkedListNode
{
   //Variables
   private int data;
   private LinkedListNode next;
   //Constructor no value
   public LinkedListNode()
   {
      setData(0);
      next = null;
   }
   //constructor with value 
   public LinkedListNode(int data)
   {
      setData(data);
      next = null; //always set node variables to null. It will make your life easier in C++.
   }
   //Returns data at that node
   public int getData()
   {
      return data;
   }
   //gets the next node
   public LinkedListNode getNext()
   {
      return next;
   }
   //sets the data at a particular node
   public void setData(int data)
   {
      this.data = data;
   }
   //sets the next node
   public void setNext(LinkedListNode next)
   {
      this.next = next;
   }
}