        
package textFileApps;

import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;   

/**
 *
 * @author nrk
 */
public class CreateTextFile
{
   private static Formatter output; // outputs text to a file       

   /*public static void main(String[] args)
   {
      openFile();
      addRecords();
      closeFile();
   } */

   // open file clients.txt
   public static void openFile()
   {
      try
      {
         output = new Formatter("agenda.txt"); // open the file
      }
      catch (SecurityException securityException)
      {
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); // terminate the program
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1); // terminate the program
      } 
   } 

   // add records to file
   public static void addRecords(String nome,String endereco,String telefone,String email)
   {
      Scanner input = new Scanner(System.in);
      

      //while (input.hasNext()) // loop until end-of-file indicator
      //{
         try
         {
            // output new record to file; assumes valid input
            output.format("%s%s%s%s%n",nome,endereco,telefone,email);                             
         } 
         catch (FormatterClosedException formatterClosedException)
         {
            System.err.println("Error writing to file. Terminating.");
            
         } 
         catch (NoSuchElementException elementException)
         {
            System.err.println("Invalid input. Please try again.");
            input.nextLine(); // discard input so user can try again
         } 

      //}
       //System.out.println("Sair");//Testando o final do While 
   }

   // close file
   public static void closeFile()
   {
      if (output != null)
         output.close();
   } 
} // end class CreateTextFile
