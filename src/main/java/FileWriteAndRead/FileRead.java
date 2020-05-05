package FileWriteAndRead;

import java.io.*;

public class FileRead {

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/anupkapale/Documents/File/PersonalDetails.txt");

        FileReader reader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = null;
        while ((line = bufferedReader.readLine())!=null){

            System.out.println(line);
        }

        bufferedReader.close();


    }
}
