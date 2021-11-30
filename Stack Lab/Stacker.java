
//Class for Linked List stack of cards also includes my main and test cases
public class Stacker
{
   //variables
   LinkedListNode head;
   private int count;
   
   //constructor
   public Stacker()
   {
   
    head=null;
   
   
   
   }
   
   //push method to add the data to the list
   public void push(int data)
   {
   
       
     LinkedListNode current= new LinkedListNode(data);
      
      
      
      current.setNext(head);
      
      head=current;
      count++;
     
     
   
   }
   
   //removes a data value
   public void pop()
   {
         
      
      
      
         if(head!=null)
         {
            head=head.getNext();
            count--;
         }
         else
         head=null;
     
   
   
   }
   //retrieves a data value
   public int peek()
   {
      if(head!=null)
      {
      
          return head.getData();
      }
      return -1;
   }
   
  
   
   //to string to prinmt
   public String toString()
   {
      String toReturn= "";
      LinkedListNode current=head;
      System.out.println("Stack: ");
      System.out.println("<top>");
      
      
      for(int i=0; i<count; i++)
      {
        Card card= new Card(current.getData());

         System.out.println(card);
         current= current.getNext();
      
      }
      
      System.out.println("<bottom>");
   
      return toReturn;
   }
   //is empty method to test if list is empty or not
    public boolean isEmpty()
   {
      return head == null;
   }
   




 public static void main(String[] args)
{  

         //Constructor call
         Stacker stack= new Stacker();
         //adding variables to stack
         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.push(4);
         stack.push(5);
         stack.push(6);
         stack.push(7);
         stack.push(8);
         stack.push(9);
         stack.push(10);
    

         //print out
         System.out.println(stack);
         
         //popping
         stack.pop();
         stack.pop();
         stack.pop();
         stack.pop();
         stack.pop();
         //print
         System.out.println(stack);
         
      
         //New stuff (test cases)
         //constructor call
          Stacker stack1= new Stacker();
          //print
           System.out.println(stack1);
           //peek
          stack1.peek();
          //pop
          stack1.pop();
          //adds to stack
           stack1.push(3);
            stack1.push(6);
             stack1.push(9);
              stack1.push(12);
               stack1.push(15);
                stack1.push(18);
                 stack1.push(21);
                  stack1.push(24);
                   stack1.push(27);
                    stack1.push(30);
    //print         
   System.out.println(stack1);
         //pop 3 times
         stack1.pop();
         stack1.pop();
         stack1.pop();
         //print
         System.out.println(stack1);
         //pop 6 times
          stack1.pop();
         stack1.pop();
         stack1.pop();
          stack1.pop();
         stack1.pop();
         stack1.pop();
         //print
          System.out.println(stack1);








}


}