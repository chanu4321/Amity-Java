import java.io.FileOutputStream; 
import java.io.IOException;
public class Lab9_2
{
     public static void main(String args[])
     {
         try
         {
             FileOutputStream f=new FileOutputStream("hellojava.txt");    
             f.write(65);    
             f.close();    
             System.out.println("The data has been entered in the file");
         }
         catch(IOException e)
         {
             System.out.println(e);
         }    
     }    
}
