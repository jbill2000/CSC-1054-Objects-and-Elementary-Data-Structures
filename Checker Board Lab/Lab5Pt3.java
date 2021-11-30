//Program created by Jeremy Bill as part of Lab5
import java.util.*;
import java.text.*;
import java.io.*;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
public class Lab5Pt3 extends Application
{
   public class MyCanvas extends Canvas
{
   //Constructor that doesnt take anything in
   public MyCanvas()
   {
      //Sets the width of the canvas
      setWidth(700);
      //Sets the height of the canvas
      setHeight(600);
      //Graphics Context
      GraphicsContext g = getGraphicsContext2D();
      
     
   
   }
   //Sketch method
   public void sketch(GraphicsContext g)
   {
      //If shapeform equals square
      if(shapeform.equals("square"))
      {
         //Creates the customcolor
         Color customcolor= new Color(Lab5Pt3.getNum4(),Lab5Pt3.getNum5(),Lab5Pt3.getNum6(),1);
         //Sets the fill of the custom color
         g.setFill(customcolor);
         //Fill the rectangle 
         g.fillRect((double)Lab5Pt3.getNum1(),(double)Lab5Pt3.getNum2(),(double)Lab5Pt3.getNum3(),(double)Lab5Pt3.getNum3());   
   
      }
      //If it equals circle
      if(shapeform.equals("circle"))
      {
         //Custom Color Creation
         Color customcolor= new Color(Lab5Pt3.getNum4(),Lab5Pt3.getNum5(),Lab5Pt3.getNum6(),1);
         //Set fill with the custom color
         g.setFill(customcolor);
         //Fills the shape
         g.fillOval((double)Lab5Pt3.getNum1(),(double)Lab5Pt3.getNum2(),(double)Lab5Pt3.getNum3(),(double)Lab5Pt3.getNum3());
      }
      
   }






      
}
//Variables and stuff
private MyCanvas obj;
private boolean isdone;
private static String shapeform;
private static int num1= 0;
private static int num2= 0;
private static int num3= 0;
private static float num4;
private static float num5;
private static float num6;
//Start method
 public void start(Stage stage)
   {
      //Flowpane creation
      FlowPane fp= new FlowPane();
      //Set size of the flowpane
      fp.setPrefSize(700,600);
       //Do while to test it meets the right conditions and runs without an error
         do
          {
            //Scanner
             Scanner scan= new Scanner(System.in);
              System.out.println("What is the name of the file you would like to enter? ");
              //Enter filename
               String filename= scan.next();
        try
         {
               //File scanner
                Scanner filescan= new Scanner(new File(filename));
               obj= new MyCanvas();
               //Graphics context object
               GraphicsContext g= obj.getGraphicsContext2D();
            //Do while to check for while filescan has next
            do
            {
                
             //Data thats read in from the file
             shapeform= filescan.next();
               num1= filescan.nextInt();
               num2= filescan.nextInt();
               num3= filescan.nextInt();
               num4= filescan.nextFloat();
               num5= filescan.nextFloat();
               num6= filescan.nextFloat();
                obj.sketch(g);
 
                  
            }while(filescan.hasNext());
            //Boolean variable to end while loop if its good
           isdone= true;
          
            
         }
         //Catches to catch different possible errors and reloop through if it crashes
         catch(FileNotFoundException fnfe)
         {
            System.out.println("File was not found");
         }
         catch(NoSuchElementException nsee)
         {
            System.out.println("Your shape was incorrect please try again");
            isdone=false;
         }
         catch(IllegalArgumentException iae)
         {
            System.out.println("Your color was wrong. Please try again");
            isdone=false;
         }
         }while(isdone!=true);
      //Adds obj to the flowpane
      fp.getChildren().add(obj);
      //Size of the scene
      Scene scene = new Scene(fp,700, 600);
      //Sets the scene
      stage.setScene(scene);
      //Stage title
      stage.setTitle("Lab 5");
      //Shows the stage
      stage.show();
    }
     public static void main(String[] args)
     {
         //Method to launch the java fx program
         launch(args);
        
        
         
         
         
 
     }
     
     //Methods to retrieve things to use in color creation
     public static String getShape()
     {
         return shapeform;
     }
     
     public static int getNum1()
     {
         return num1;
     }
     public static int getNum2()
     {
         return num2;
     }

     public static int getNum3()
     {
         return num3;
     }
      public static float getNum4()
     {
         return num4;
     }
      public static float getNum5()
     {
         return num5;
     }
      public static float getNum6()
     {
         return num6;
     }

   
}