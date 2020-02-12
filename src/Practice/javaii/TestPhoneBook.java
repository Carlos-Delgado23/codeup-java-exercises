package Practice.javaii;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPhoneBook {
    public static void main(String[] args) {
        Path phoneBookDir = Paths.get("BookDir");
        Path phoneBookFile = Paths.get(phoneBookDir.toString(),"phonebook.txt");
        if (Files.notExists(phoneBookDir)){
            try{
                Files.createDirectories(phoneBookDir);
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
        if (Files.notExists(phoneBookFile)){
            try{
                Files.createFile(phoneBookFile);
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
        try {
//            Files.writeString(phoneBookFile, "", StandardOpenOption.TRUNCATE_EXISTING);
            Files.writeString(phoneBookFile, "First Name, Last Name, Street Address, Secondary Street Address (This " +
                    "may be blank), City, State, Country code, Zip Code, Cell Phone, LandLine\n", StandardOpenOption.APPEND);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        List<String> readLines = new ArrayList<>();
        try {
            readLines = Files.readAllLines(phoneBookFile);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        System.out.println(readLines.get(0));
        System.out.println(readLines.get(1));
        String[] personDetails = readLines.get(0).split(", ");

        for (String item : personDetails){
            System.out.println(item);
        }



//        Files.createFile("")
    }
}
