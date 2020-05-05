package devqa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllNumbersfromaString {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher("string1234more567string890");

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
