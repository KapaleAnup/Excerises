package searchproduct;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {


    public static String getProperty(String data)
    {
      //  String file_path = "searchproduct/search.properties";
        Properties p=new Properties(); //creating object of properties class
        try
        {
            FileInputStream file = new FileInputStream("searchproduct/search.properties");//read the propertyfile
            p.load(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return p.getProperty(data);
    }
}
