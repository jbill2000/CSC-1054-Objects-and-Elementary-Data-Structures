
//Class i downloaded off canvas

public class IntStack
{
   LinkedListNode head;

   public IntStack()
   {
      head = null;
   }
   
   public void push(int number)
   {
      LinkedListNode lln = new LinkedListNode(number);
      
      lln.setNext(head);
      head = lln;
   }
   
   public void pop()
   {
      head = head.getNext();
   }
   
   public boolean isEmpty()
   {
      return head == null;
   }
   
   public int top()
   {
      return head.getData();
   }

}