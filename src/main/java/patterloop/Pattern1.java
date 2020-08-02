package patterloop;

import org.testng.annotations.Test;

public class Pattern1 {


    @Test
    public void test(){
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
