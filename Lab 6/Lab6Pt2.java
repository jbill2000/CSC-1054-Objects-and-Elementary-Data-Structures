//Created by Jeremy Bill as part of lab 6.
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
public class Lab6Pt2 extends Application
{
      //Creates a new canvas object
      Canvas c= new Canvas(500,500);
      //Creates gc for use later if i need it
      GraphicsContext gc;
     //Defines x and y
     int y=4;
     int x=4;
      //2D array creation
       Button [][] ButtonGame=new Button [y] [x];
      //Boolean check variable creation
    boolean check=true;
    
  //Creates new label
  Label l = new Label("Welcome to the Game!");
  
   public void start(Stage stage)
   {
      //variables
        int y=4;
      int x=4;
      //FlowPane
     FlowPane fp= new FlowPane();
     //BorderPane
     BorderPane bp= new BorderPane();
     //Hbox
      HBox top = new HBox();
      //HboxSize
      top.setPrefSize(500,10);
      //Alignment of the text
      top.setAlignment(Pos.TOP_LEFT);
      //Color of the Hbox
      top.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
      //Hbox label color
      l.setTextFill(Color.BLACK);
      //Set Size of FP
      fp.setPrefSize(500,500);
      //Adds the Label to the hbox
      top.getChildren().add(l);
      //Adds the Hbox to the flowpane
      bp.setTop(top);
      //Creates a spacer label in case i need it 
      Label l2= new Label(" ");
      //sets spacer to center
      bp.setCenter(l2);
 

 
       //ForLoop to create 16 buttons and add them to the flowpane          
      for(int i=0; i<y; i++)
      {
         for(int j=0; j<x; j++)
         {
            //Fills an array with new buttons
            ButtonGame[i][j]=new Button();
            //Sets the preferred size of the buttons
            ButtonGame[i][j].setPrefSize(110,110);
            //Creates button listener
            ButtonListener butt1 = new ButtonListener();
            //Sets array on action to butt1
            ButtonGame[i][j].setOnAction(butt1);
    
            
            //Adds the array of buttons to the flowpane
            fp.getChildren().add(ButtonGame[i][j]);
            
         }
      }
      //Centers the buttons in the bottom of the borderpane
      
      bp.setBottom(fp);
      fp.setAlignment(Pos.CENTER);
      
      //Adds flowpane to the center
      fp.getChildren().add(c);
      
      //Creates a new scene
      Scene scene = new Scene(bp, 500, 500);
      stage.setScene(scene);
      //Title of the scene
      stage.setTitle("ButtonGame");
      //Shows the scene
      stage.show(); 
      
  }    
      
       public class ButtonListener implements EventHandler<ActionEvent>   
  {   
      public void handle(ActionEvent e)
      {
         //Try Catch         
         try
         {
            //Do while to do while boolean check is not true
           do
           {
           //For loop to perform the actions with setting them visible or invisble
            for(int f=0; f<y; f++)
            {
               for(int a=0; a<x; a++)
               {
                  //If the button in the array = the source it will do this
                  if(ButtonGame[f][a]==(Button)e.getSource())
                  {
                    //Switches it to the opposite of what it is already
                     ButtonGame[f][a].setVisible(!ButtonGame[f][a].isVisible());
                     //Boundary check then makes one button the opposite of what it is now
                     if(f<y-1)
                        {
                           ButtonGame[f+1][a].setVisible(!ButtonGame[f+1][a].isVisible());
                        }
                        //Boundary Check then makes one button the opposite of what it is now
                     if(f>0)
                       {
                         ButtonGame[f-1][a].setVisible(!ButtonGame[f-1][a].isVisible());
                       }
                       //Boundary Check then makes one button the opposite of what it is now
                     if(a<x-1)
                     {
                        ButtonGame[f][a+1].setVisible(!ButtonGame[f][a+1].isVisible());
                     }
                     //Boundary Check then makes one button the opposite of what it is now
                     if(a>0)
                     {
                        ButtonGame[f][a-1].setVisible(!ButtonGame[f][a-1].isVisible());
                     }
                     //Sets count =0
                     int count=0;
                     //Loops through array, and checks if all are invisible and counts each one that is invisible each time a button is pressed.
                     for(int b=0; b<y; b++)
                     {
                        for(int c=0; c<x; c++)
                        {
                           
                           if(ButtonGame[b][c].isVisible()==false)
                           {
                            count++;
                           }
                        }
                     }
                     // if all 16 are invisible then it will end the do while and print you win
                     if(count==16)
                     {
                        l.setText("You Win!");
                        check=true;
                        
                     }
                     
                  }
                     
                  

                     
               }
            }
            }while(!check==true);
            
            
                     
         
            
         }//Catchs an Class Cast Exception.
         catch(Exception E)
         {
            
         }
         
       
      
      
         
      }
           
           
           
                        
      }
                
      
  
  
  
  
  
  
   
   
       
 

     public static void main(String [] args)
     { 
         //Launches the JavaFx application stuff
         launch(args);
     
     }
     
     
}