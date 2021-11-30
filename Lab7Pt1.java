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

public class Lab7Pt1 extends Application
{
   int length=155;
    GraphicsContext g;
AnimationTimer at;
  public class MyCanvas extends Canvas
{
   //Constructor that doesnt take anything in
   public MyCanvas()
   {
      //Sets the width of the canvas
      setWidth(800);
      //Sets the height of the canvas
      setHeight(200);
      //Graphics Context
     g= getGraphicsContext2D();
      
      //Animation Stuff
      
         at = new AnimationHandler();
         //at.update();
         
         at.start();
                  
     KeyListenerDown key= new KeyListenerDown();
          

      
     
   
   }
   //Sketch method
   public void sketch(GraphicsContext g)
   {
      g.clearRect(160,42,415,25);
      g.setFill(Color.WHITE);
      g.fillRect(150,40,423,30);
      g.setFill(Color.BLACK);
      g.fillRect(153,42,418,25);
      g.setFill(Color.GREEN);
      g.fillRect(155,42,length,25);
            
   }






      
}
   //Creates Canvas
   MyCanvas c;

   public class AnimationHandler extends AnimationTimer
   {
      public void handle(long currentTimeInNanoSeconds) 
      {  
         
         
         length+=1;
         c.sketch(g); 
                 
        
         //Infintely Loops unless a key is pressed to stop it
         if(length==412)
         {
            length=0;
         }

         
      }
   

   }
   
   //KeyListener
   public class KeyListenerDown implements EventHandler<KeyEvent>
   {
      public void handle(KeyEvent event)
      {
      //if a is pressed it will stop the bar
         if(event.getCode()== KeyCode.A)
         {
            at.stop();
         }
         //if s is pressed it will start the bar
         else if(event.getCode()== KeyCode.S)
         {
           
           at.start();
         }
      }
   }
  
   public void start( Stage stage )
   {
      //Code Starts here
      //Creates Canvas
        c= new MyCanvas();
        //GraphicsContext
        GraphicsContext g= c.getGraphicsContext2D();
        //Creates Flowpane
        FlowPane fp= new FlowPane();
        //SetsColor of Background
        fp.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        //c.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        //Calls Draw
        c.sketch(g);
        //Adds the Canvas to the flowpane
        fp.getChildren().add(c);
        
       c.setOnKeyPressed(new KeyListenerDown());
      
      
      //Scene stuff, this comes at the end of the code 
      Scene scene = new Scene(fp,800, 200);
      //Sets the scene
      stage.setScene(scene);
      //Stage title
      stage.setTitle("Lab 7 Pt 1");
      //Shows the stage
      stage.show();
      //Requests focus for the KeyListener
      c.requestFocus();

    }
            public static void main( String [] args)
            {
               launch( args);
            }
}
      