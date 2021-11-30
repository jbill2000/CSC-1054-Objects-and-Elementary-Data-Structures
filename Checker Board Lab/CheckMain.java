//Program created by Jeremy Bill as Part of Lab5.
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
public class CheckMain extends Application
{
   public void start(Stage stage)
   {
      //Flowpane creation
     FlowPane fp= new FlowPane();
     //Sets the size of the flowpane
     fp.setPrefSize(700,600);
      for(int i=0; i<21; i++)
      {
         //Adds green squares to the root
         fp.getChildren().add(new CheckerBoardSlot(Color.GREEN));
         //Adds yellow squares to the root
          fp.getChildren().add(new CheckerBoardSlot (Color.YELLOW));
      }      
      
      
      
      
      //Creates a new scene
      Scene scene = new Scene(fp, 700, 600);
      stage.setScene(scene);
      //Title of the scene
      stage.setTitle("Lab 5 Checkerboard");
      //Shows the scene
      stage.show();
   }
     public static void main(String [] args)
     { 
         //Launches the JavaFx application stuff
         launch(args);
     
     }
     
     
}