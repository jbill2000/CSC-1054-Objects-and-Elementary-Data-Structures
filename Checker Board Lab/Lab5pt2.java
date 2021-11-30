//Program created by Jeremy Bill as part of Lab5.
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

public class Lab5pt2 extends Application
{
     public void start(Stage stage)
   {
      //Creates the BorderPane
      BorderPane bp = new BorderPane();
      //Sets the borderpane size
      bp.setPrefSize(800,800);
      bp.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
      //Flowpane for the top
      FlowPane fp= new FlowPane();
      fp.setPrefSize(800,10);
      
      //HBox inside the top
      HBox top = new HBox();
      top.setPrefSize(400,10);
      top.setAlignment(Pos.TOP_LEFT);
      top.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
      Label l = new Label("Cyan");
      l.setTextFill(Color.BLACK);
      //Adds the Label to the hbox
      top.getChildren().add(l);
      //Adds the Hbox to the flowpane
      fp.getChildren().add(top);
      //YellowHbox inside the top
      HBox tl = new HBox();
      tl.setPrefSize(400,10);
      //Sets the alignment of the label
      tl.setAlignment(Pos.TOP_LEFT);
      tl.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY))); 
      //Creates Label
      Label l1= new Label("Yellow");
      l1.setTextFill(Color.BLACK);
      //Adds label to the HBOX
      tl.getChildren().add(l1);
      //Adds HBOX to the flowpane  
      fp.getChildren().add(tl);
      
      //Flowpane code
      FlowPane mid = new FlowPane();
      mid.setPrefSize(600,500);
     
      
      for(int i=0; i<3; i++)
      {
         
         //Grey VBOX
          VBox grey= new VBox();
          //Grey Label
          Label l2= new Label("Grey");
            l2.setTextFill(Color.BLACK);
          grey.setPrefSize(750,60);
          //Grey Text alignment
          grey.setAlignment(Pos.BOTTOM_RIGHT);
          grey.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
          //Adds label to the Vbox
         grey.getChildren().add(l2);
         //Adds vbox to a FP.
         mid.getChildren().add(grey);
         //New Yellow HBOX
      VBox yel2 = new VBox();
      //Sets the size of the text
      yel2.setPrefSize(750,20);
      //Aligns the text of the Vbox
      yel2.setAlignment(Pos.TOP_LEFT);
      yel2.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY))); 
      //Yellow Label
      Label l3= new Label("Yellow");
         l3.setTextFill(Color.BLACK);
         //Adds label to the Vbox
         yel2.getChildren().add(l3);
         //Adds vbox to a FP.
         mid.getChildren().add(yel2);
      }
      //Sets my flowpane called mid to the center of the borderpane
      bp.setCenter(mid);
      
      //White VBOX for loop from 0-8
      FlowPane right = new FlowPane();
      VBox white=new VBox();
      for(int k=0; k<8; k++)
      {
        
      //Sets the size of the flowpane
      right.setPrefSize(100,400);
         // white.setPrefSize(50,800);
           Label whitel= new Label("White");
            whitel.setTextFill(Color.BLACK);
            //Set Alignment of the text
            whitel.setAlignment(Pos.TOP_LEFT);
             whitel.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
             //Size of the text
             whitel.setPrefSize(50,77);
             //Adds label to the Vbox
             white.getChildren().add(whitel);
             
             
             
      }
      //Adds white to the flowpane i designate to be called right
      right.getChildren().add(white);
      //Sets the vbox white to be the right
      bp.setRight(white);
   
      //Sets the original flowpane to the top
      bp.setTop(fp);
      //bp.setTop(tl);
      Scene scene = new Scene(bp, 800, 800);
      stage.setScene(scene);
      stage.setTitle("Lab 5");
      stage.show();
    }

     public static void main(String [] args)
     {   
     
      launch(args);
     
     
     
     
     }
}