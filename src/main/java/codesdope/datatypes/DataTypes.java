package codesdope.datatypes;

import org.testng.annotations.Test;

public class DataTypes {


    @Test
    public void test1(){
        int a = 100;
        double b = 10.33;
        char c = 'C';

        System.out.println("int is : "+ a + "\ndouble value is :"+ b+ "\ncharacter is :" + c);
    }

    @Test
    public void areaOftrangle(){

        int area ;

        area = 2*6;

        System.out.println(area);


    }

    @Test
    public void ASCIIvalue(){

        char text = 'a';

        System.out.println((int)text);
    }

    @Test
    private void doublevalueConvertToInt(){

        double d =100.235;

        System.out.println((int)d);
    }

    @Test
    private void asschivalue(){

        int x = 3 + 'd';
        System.out.println((char)x);
    }
}
