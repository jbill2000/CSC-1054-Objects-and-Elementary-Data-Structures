import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.animation.*;
import java.util.*;
import java.net.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.stage.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import java.util.*;


public class Lab7Canvas extends Canvas
{
   Lab7Level level;

   public Lab7Canvas(String firstLevel)
   {
      setWidth(9*50);
      setHeight(9*50);
      
      level = new Lab7Level(firstLevel);
      
      GraphicsContext gc = getGraphicsContext2D();
      draw(gc);

   }
   
   public void draw(GraphicsContext gc)
   {
      gc.clearRect(0,0,450,450);
      gc.setFill(Color.BLACK);
      gc.fillRect(0,0,450,450);
      
      for(int i=0;i<9;i++)
      {
         for(int j=0;j<9;j++)
         {
            int k = level.getData(j,i);
            if(k == 1)
            {
               gc.setFill(Color.BLACK);
               gc.fillRect(j*50,i*50,50,50);
            }
            else if(k == 0)
            {
               gc.setFill(Color.CYAN);
               gc.fillRect(j*50,i*50,50,50);
            }
         }
      }
   }
}