package JavaTutorials.Arrays;

public class ObjectArray {

    public static void main(String[] args) {

        // We can store multiple data types vales by object
        Object a[] = new Object[5];

        a[0]= 10;
        a[1]= 20.8;
        a[2]= true;
        a[3]="Welcome";
        a[4]='F';

        for (Object i:a
             ) {
System.out.println(i);
        }
    }
}
