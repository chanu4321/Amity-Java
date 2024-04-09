import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab9_4 {
    public static void m1() throws ArithmeticException{
        int x=10/0;
    }
    public static void main(String[] args) {
        String filename = "example.txt";
        String data = "This is a sample text that we will write to the file.";
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing data to the file: " + e.getMessage());
            e.printStackTrace();
            return;
        }
        
        try{
            m1();
        }
        catch(ArithmeticException ae){
            System.out.println("catch");
        }
        try (FileInputStream fis = new FileInputStream(filename)) {
            int i;
            System.out.println("Content of the file:");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading data from the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
