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

public class CheckerBoardSlot extends Canvas
{
   //Variables 
   private Color c;
   public CheckerBoardSlot(Color c)
   {
      this.c=c;
      setWidth(100);
      setHeight(100);
      GraphicsContext g = getGraphicsContext2D();
      sketch(g);
   
   }
   
   public void sketch(GraphicsContext g)
   {
      if(c.equals(Color.YELLOW))
      {
        g.setFill(Color.YELLOW);
        g.fillRect(0,0,100,100);
      }
      else if(c.equals(Color.GREEN))
      {
         g.setFill(Color.GREEN);
         g.fillRect(0,0,100,100);
      }
   }
  

      












}