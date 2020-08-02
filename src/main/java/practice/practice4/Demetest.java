package practice.practice4;

import java.util.ArrayList;
import java.util.List;

public  class Demetest  {


    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        data.add("test");
        data.add("gsd");
        data.add("fgfhf");

        int size =data.size();

        for (String f: data
             ) {
            System.out.println(f.trim());
        }





    }


}
