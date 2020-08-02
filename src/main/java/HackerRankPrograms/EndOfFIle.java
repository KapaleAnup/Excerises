package HackerRankPrograms;

import java.util.Scanner;

public class EndOfFIle {


    public static void main(String[] args) {
//        Hello world
//        I am a file
//        Read me until end-of-file.
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while(scanner.hasNext()){
            System.out.println(i + " "+scanner.nextLine());
            i++;
        }

        scanner.close();







    }
}
