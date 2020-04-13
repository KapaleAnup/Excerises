package FileWriteAndRead;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWrite {

    public static void main(String[] args) {

        File file = new File("/Users/anupkapale/Documents/File/PersonalDetails.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
//            bufferedWriter.write("FullName: Aushutosh kapale");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Age:30");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Address:Parel");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Mobile:1234567890");
//            bufferedWriter.close();

            for (int i=0;i<4;i++){
                for (int j=0;j<3;j++){

                    int num = (int)(Math.random()*100);
                    bufferedWriter.write(num + ",");
                }
                bufferedWriter.newLine();

            }
            System.out.println("File created.!!!");
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
