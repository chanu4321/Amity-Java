import java.io.FileOutputStream;  
public class Lab9_3 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Chaitanya\\Amity Java\\hellojava.txt");    
             String s="hello, this is a file!";    
             byte b[]=s.getBytes();  
             fout.write(b);    
             fout.close();    
             System.out.println("The data has been entered in the file");    
            }catch(Exception e){
                System.out.println(e);}    
      }    
}  
