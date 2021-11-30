//Downlaoded off canvas but I did not touch
import java.util.LinkedList;
import java.util.Queue;
public class Queue
{
   LinkedListNode head=null;
   LinkedListNode tail=null;
   
   public Queue()
   {
   
   }


   public void enqueue(int theItem)
   {
      if(head == null)
      {
         LinkedListNode lln = new LinkedListNode(theItem);
         head = tail = lln;  
      }
      else
      {
         LinkedListNode lln = new LinkedListNode(theItem);
         tail.setNext(lln);
         tail = lln;
      }
   }
   
   public void dequeue()
   {
      if(head != null)
         head = head.getNext();
   }
   
   public int peek()
   {
      if(head == null)
      {
         return (int)Double.POSITIVE_INFINITY; //-1 is empty  :)
      }
      return head.getData();
   }

   public static void main(String[] args)
   {
      Queue test;
      test.enqueue(1000);
      System.out.println(test.peek());
      test.dequeue();
   }
}