//Program created by Jeremy Bill as Part of Lab6
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

public class Lab6Pt1 extends Application
{
     //Creates ComboBox
    ComboBox cb= new ComboBox();
    //CheckBox Creation
    CheckBox thicc= new CheckBox("Thick");
    //RadioButtons Creation
    RadioButton nospace= new RadioButton("No Spaces");
    RadioButton space= new RadioButton("1 Space");
    //Spacer Variable that I use in RadioBUtton
    int spacer=0;
    //Creates Canvas
    Canvas c= new Canvas(400,300);
    //Creates gc as a graphics context variable to use
      GraphicsContext gc;
      //Creates some variables to be used later
      int value;
      int thick=0;
      boolean check;
      String box="0";
      
      //Creates new TextField
      TextField zeBox= new TextField("Enter an A or I");
      
      //CheckBox Listener
   public class CheckBoxListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e2)
      {
         //If thicc is selected set thick =1 and draw
         if(thicc.isSelected())
         {
             thick=1;
             
             draw(gc);
         }
         //Else thick is not selected set thick = 0 and draw
         else
         thick=0;
         
         draw(gc);
       }
   }
   
   //RadioButtonStuff
   public class RadioButtonListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e3)
      {
         //Creates a toggle 
         ToggleGroup group= new ToggleGroup();
         //Sets toggle for no space
         nospace.setToggleGroup(group);
         //Sets toggle for space
         space.setToggleGroup(group);
         //If no space is selected set no space=0 and draw.
         if(nospace.isSelected())
         {
            spacer=0;
            draw(gc);
         }
         //Else if space is selected spacer = 1 and draw
         else if(space.isSelected())
         {
            spacer=1;
            draw(gc);
         }
      }
   
   
   
   
   
   
   }
   
   
   
   
   
   
   
   
   
   //End Radio Button Stuff
   
   
   //TextBoxStuff
   public class TextFieldListener implements EventHandler<ActionEvent>
   {
   
      public void handle(ActionEvent e4)
      {
           //Variable to retrieve the text.
           box= zeBox.getText();
           //If box equals A
           if(box.equals("A"))
           {
               //Set combo to 100
               cb.setValue(100);
               //Set thicc to checked
               thicc.setSelected(true);
               //Thick =1
               thick=1;
               //Set Space to true
               space.setSelected(true);
               //Set Spacer =1
               spacer=1;
               //Draw
               draw(gc);
           }
           //If Box equals I
           else if(box.equals("I"))
           {
               //Set value of the combo box for 10
               cb.setValue(10);
               //Set thicc to false
               thicc.setSelected(false);
               //thick =0
               thick=0;
              //set no space = true
              nospace.setSelected(true);
              //set spacer =0
               spacer=0;
               //Call the Draw Method
               draw(gc);
            }

               
       }
   }
   
   
   
   
   
   
   //EndsTextBoxStuff
         
         //Draw
      public void draw(GraphicsContext gc)
    {
         gc.setStroke(Color.BLACK);
         gc.clearRect(0,0,400,300);
         
   //Spaces the lines and makes them thicker
   if(spacer==1 && thick==1)
   {
      for(int p=0; p<value; p++)
        {
            if(value==10)
            {
                
             gc.strokeLine(0,(p*10)+10,50,(p*10)+10);
             gc.strokeLine(0,(p*10)+11,50,(p*10)+11);
             gc.strokeLine(55,(p*10)+10,100,(p*10)+10);
             gc.strokeLine(55,(p*10)+11,100,(p*10)+11);


            }
            else if(value==50)
            {
               gc.strokeLine(0,(p*3)+10,50,(p*3)+10);
               gc.strokeLine(0,(p*3)+11,50,(p*3)+11);
               gc.strokeLine(55,(p*3)+10,100,(p*3)+10);
               gc.strokeLine(55,(p*3)+11,100,(p*3)+11);
             
            }
            else
           { 
               gc.strokeLine(0,(p*2)+10,50,(p*2)+10);
               gc.strokeLine(0,(p*2)+11,50,(p*2)+11);
               gc.strokeLine(55,(p*2)+10,100,(p*2)+10);
               gc.strokeLine(55,(p*2)+11,100,(p*2)+11);
           }
        }
     }
     //Does no space and thickens the lines
     else if(spacer==0 && thick==1)
     {
         for(int k=0; k<value; k++)
         {
               if(value==10)
             {
                
             gc.strokeLine(0,(k*10)+10,100,(k*10)+10);
             gc.strokeLine(0,(k*10)+11,100,(k*10)+11);

              }
                else if(value==50)
                {
                   gc.strokeLine(0,(k*3)+10,100,(k*3)+10);
                   gc.strokeLine(0,(k*3)+11,100,(k*3)+11);
             
                }
                 else
               {    
                  gc.strokeLine(0,(k*2)+10,100,(k*2)+10);
                   gc.strokeLine(0,(k*2)+11,100,(k*2)+11);
              }
           }
        }
        //Spaces the lines but doesnt thicken them
        else if(spacer==1 && thick==0)
        {
         for(int m=0; m<value; m++)
         {
                if(value==10)
                {   
               
                gc.strokeLine(0,(m*10)+10,50,(m*10)+10);
                gc.strokeLine(55,(m*10)+10,100,(m*10)+10);
                }
                else if(value==50)
                {
                   gc.strokeLine(0,(m*3)+10,50,(m*3)+10);
                   gc.strokeLine(55,(m*3)+10,100,(m*3)+10);
             
                }
                 else
                {    
                  gc.strokeLine(0,(m*2)+10,50,(m*2)+10);
                   gc.strokeLine(55,(m*2)+10,100,(m*2)+10);
                }
             }
          }
         //Does no spaces or no thickening of the lines
        else if(spacer==0 && thick==0)
        {
         for(int n=0; n<value; n++)
         {
                if(value==10)
                {   
               
                gc.strokeLine(0,(n*10)+10,100,(n*10)+10);
               
                }
                else if(value==50)
                {
                   gc.strokeLine(0,(n*3)+10,100,(n*3)+10);
                   
             
                }
                 else
                {    
                  gc.strokeLine(0,(n*2)+10,100,(n*2)+10);
                  
                }
             }
          }
 //ThisGuyClosestheDrawMethod NO REMOVE     
   }
   
   
  

   //ComboBox Listener
   public class ComboBoxListener implements EventHandler<ActionEvent>
   {
     public void handle(ActionEvent e)
    {
      //Retrives get value of cb and makes it an object
      Object name= cb.getValue();
      //Parses object into a integer
      value= Integer.parseInt(name.toString());
         

      //Switch statement for value
       switch(value)
       {
         case 10: 
          
            draw(gc);
             break;
         case 50:
            
            draw(gc);
         break;
         case 100:
         
         draw(gc);
         break;
       }
     }
  }
   
   


            
   public void start(Stage stage)
   {
      //Flowpane creation
    
    FlowPane fp= new FlowPane();
     FlowPane fp2= new FlowPane();
     //Sets gc= canvas.getGraphicsContext2D();
     gc= c.getGraphicsContext2D();
     //Creates the labels for spacing
     Label l = new Label(" "+" ");
     Label l1 = new Label(" "+" ");
     Label l2 = new Label(" "+" ");
     Label l3 = new Label(" "+" ");
     //Adds the items to the combo box
      cb.getItems().add(10);
      cb.getItems().add(50);
      cb.getItems().add(100);
     
     
     //Sets the size of the flowpane
     fp.setPrefSize(400,300);
     fp2.setPrefSize(400,300);
     //Adds the component flowpane to the root flowpane
     fp.getChildren().add(fp2);
     //Adds components and spaces to the component flowpane
     fp2.getChildren().add(cb);
     fp2.getChildren().add(l);
     fp2.getChildren().add(thicc);
     fp2.getChildren().add(l1);
     fp2.getChildren().add(nospace);
     fp2.getChildren().add(l2);
     fp2.getChildren().add(space);
     fp2.getChildren().add(l3);
     fp2.getChildren().add(zeBox);
     //Adds Canvas to the component flowpane
     fp2.getChildren().add(c);
    //Creates a combo box listener object
     ComboBoxListener cbl = new ComboBoxListener();
     //Sets the action of cb1 to cb
     cb.setOnAction(cbl);
     //Sets value of combo box to 10
     cb.setValue(10);
      
      
       //Handles the new action event
      cbl.handle(new ActionEvent());
      //Creates CheckBox Object
      CheckBoxListener thiccy = new CheckBoxListener();
     //Sets thicc on action to thiccy
     thicc.setOnAction(thiccy);
    //THiccy handles new action event
     thiccy.handle(new ActionEvent());
     //Radiobuttonlistener object
     RadioButtonListener spacee= new RadioButtonListener();
     //sets no space on action to spacee
     nospace.setOnAction(spacee);
     //Sets no space selected to true
     nospace.setSelected(true);
     //Sets space on action to spacee
     space.setOnAction(spacee);
     //Handles new action event
     spacee.handle(new ActionEvent());
     
    
   
     
     //TextFIeld listener
     TextFieldListener texter= new TextFieldListener();
     //Sets zbox on action to texter
     zeBox.setOnAction(texter);
     //Handles the new acion event
     texter.handle(new ActionEvent());

        

      
    
      
      
      //Creates a new scene
      Scene scene = new Scene(fp, 400, 300);
      stage.setScene(scene);
      //Title of the scene
      stage.setTitle("Lab 6 Pt1");
      //Shows the scene
      stage.show();
   }
     public static void main(String [] args)
     { 
         //Launches the JavaFx application stuff
         launch(args);
     
     }
     
  }   
