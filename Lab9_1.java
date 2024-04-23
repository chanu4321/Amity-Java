import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Lab9_1 {
    public static void main(String[] args) {
        Hashtable<String, String> phoneBook = new Hashtable<>();

        try (BufferedReader br = new BufferedReader(new FileReader("phonebook.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ", 2);
                if (parts.length >= 2) {
                    String name = parts[0];
                    String phone = parts[1];
                    phoneBook.put(name, phone);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all phone numbers
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }
}
