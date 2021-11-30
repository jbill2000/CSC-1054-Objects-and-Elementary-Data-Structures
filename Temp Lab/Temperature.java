/*Written by Jeremy Bill- the program converts a temperature given in Fahrenheit to Celsius*/
public class Temperature
{
      public static void main (String[] args)
      {
      //declare variables using appropriate types and identifiers
      double Fahrenheit, Celsius, num1, num2;
      
      //Get and remember the Fahrenheit Temperature
      Fahrenheit=70;
      
      //Subtract 32 from Fahrenheit and remeber the result
      num1= Fahrenheit-32;
      
      //Multiply previous result by 5 and remember the new result. 
      num2=num1*5;
      //Divide the Previous result by 9 and remember the new result (Celsius)
      Celsius=num2/9;
      //Print the final result
      System.out.println("The Degrees in Celsius is " +Celsius);
     
      }
}