import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesIOLecture {
    public static void main(String[] args) {
        newFile();
        writeFile();
    }


    static void newFile() {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toAbsolutePath());
        Path dataFile = Paths.get(directory, filename);

        try{
            if(Files.notExists(dataDirectory)){
                Files.createDirectories(dataDirectory);
                System.out.println("Created directory");
            }
            if (!Files.exists(dataFile)){
                Files.createFile(dataFile);
                System.out.println("Created file");
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

//    static void readFile(){
//        try{
//            Path poemFile = Paths.get("europa", "poem.txt");
//            List<String> poem = new ArrayList<>();
//            poem.add()
//        }
//    }

    static void writeFile(){
        List<String> fruit = new ArrayList<>();
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("peach");
        fruit.add("pineapple");

        try{
            Path groceries = Paths.get("data", "groceries.txt");
            Files.write(groceries, fruit);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

    }


}
