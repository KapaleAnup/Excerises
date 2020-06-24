package practice.practice1;

import java.util.*;

public class CountCharacterOccurance {


    public static void main(String[] args) {
        String str = "Java programing Java ops";

        int totalcount = str.length();

        int totalcountafterremoval = str.replace("J","").length();

        int count =totalcount - totalcountafterremoval;

        System.out.println(count);

        List<String> tes = new ArrayList<String>();

        Set<String>  yrd = new HashSet<>();

        HashMap<String, String> map = new HashMap<>();

        map.put("name","Anup");
        map.put("tet","Anup");
        map.put("name","Amit");

        System.out.println(map);
    }


}
