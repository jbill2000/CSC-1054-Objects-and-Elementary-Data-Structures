//Main created as part of Lab4. Deals with exceptions and the like.
import java.text.*;
import java.util.*;
import java.io.*;

public class Lab4pt1
{
     public static void main(String [] args)
     {   
            //Variables
            String firstnum="0";
            String secondnum="0";
            String operator="0";
            int newfirstnum=0;
            int newsecondnum=0;
            int result=0;
            //Scanner
            Scanner scan= new Scanner(System.in);
            do{
            System.out.println("Please enter two numbers and an operator ");
               //Reads in all the values
               firstnum=scan.next();
               secondnum=scan.next();
               operator=scan.next();
             //Trys to parse the first values into ints 
            try
            {
               newfirstnum=Integer.parseInt(firstnum);
               newsecondnum=Integer.parseInt(secondnum);
            }
            //Catches the exception if they cannot be parsed
            catch(NumberFormatException NFE)
            {
               System.out.println("Cannot convert characters or strings to ints");
            }
            //Checks if operator equals * and runs code
            if(operator.equals("*"))
            {
             result=newfirstnum*newsecondnum;
             System.out.println(result);
             break;
            }
            //Checks if operator = /
            else if(operator.equals("/"))
            {
               try
               {
                  result= newfirstnum/newsecondnum;
                  System.out.println(result);
                  break;
               }
               //Catches a divide by 0 exception
               catch(ArithmeticException ae)
               {
                  System.out.println("Cannot divide by 0");
               }
            }
            //Tells user operator was invalid
            else
            System.out.println("Operator was invalid");
            //While statement to run the while loop until a break is hit.
            }while(true);
     
     
     }
     
     
}