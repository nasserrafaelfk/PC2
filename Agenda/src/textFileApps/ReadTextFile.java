
package textFileApps;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;
   // open file clients.txt
   public static void openFile()
   {
      try
      {
         input = new Scanner(Paths.get("agenda.txt")); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read record from file
   public static ArrayList readRecords()
   {
      ArrayList<String>contatos = new ArrayList<>();
      
      System.out.printf("Nome;Endereço;Telefone;Email\n");

      try 
      {
        while (input.hasNext()) // while there is more to read
        {
            // display record contents                     
            //System.out.printf("%s%n",contatos.add(input.nextLine()));
            contatos.add(input.nextLine());
        }
      } 
      catch (NoSuchElementException elementException)
      {
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {
         System.err.println("Error reading from file. Terminating.");
      }
      
    
      return contatos;
      
   } // end method readRecords

   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} // end class ReadTextFile