package JavaTutorials.fileCreator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreater {


    public static void main(String[] args) {

        File file = new File("Filename.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println("This is the new content which we have created");
                printWriter.println(10000);
                printWriter.close();
                System.out.println("Done, File has been created...");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }
    }
}
