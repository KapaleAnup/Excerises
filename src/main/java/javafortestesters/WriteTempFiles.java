package javafortestesters;

import org.testng.annotations.Test;

import java.io.*;

public class WriteTempFiles {

    @Test
    private File writeTheTestDataFile() throws IOException {
        File file = File.createTempFile("forReading", null);
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        for (int lineNumber = 1;lineNumber <6 ;lineNumber++){
            printWriter.println("line" + lineNumber);
        }
        printWriter.close();
        return file;
    }
}
