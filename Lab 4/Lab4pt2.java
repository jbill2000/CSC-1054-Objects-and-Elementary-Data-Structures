//Main created as part of Lab4
import java.io.*;
import java.text.*;
import java.util.*;

public class Lab4pt2
{
     public static void main(String [] args)
     {   
         //Creates a level object called file
         Level file= new Level("EntryFile.txt");
         //Calls the to string in level
         System.out.print(file);
         //Tries code and catches FileNotFoundException if generated
         try
         {
            //Prints the file and closes it
            FileOutputStream fos= new FileOutputStream("output.txt", false);
            PrintWriter pw= new PrintWriter(fos);
            pw.print(file);
            pw.close();
         
         
         }
         //Catches the file not found exception
         catch(FileNotFoundException fnfe)
         {
            System.out.println("File was not found");
         }
     }
     
}
