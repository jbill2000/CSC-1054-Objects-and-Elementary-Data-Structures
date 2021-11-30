
//Class i downloaded off Canvas but did not touch
public class StackClient
{
   public static void main(String[] args)
   {
      IntStack theStack = new IntStack();
      theStack.push(5);
      theStack.push(4);
      theStack.push(3);
      theStack.push(2);
      theStack.push(1);
      
      while(!theStack.isEmpty())
      {
         System.out.println(theStack.top());
         theStack.pop();
      }
   }
}