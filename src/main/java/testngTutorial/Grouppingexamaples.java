package testngTutorial;

import org.testng.annotations.Test;

public class Grouppingexamaples {

    @Test(groups = {"Sanity"})
    void test1(){
        System.out.println("This is test1");
    }

    @Test(groups = {"Regression"})
    void test2(){
        System.out.println("This is test2");
    }

    @Test(groups = {"Sanity"})
    void test3(){
        System.out.println("This is test3");
    }

    @Test(groups = {"Regression"})
    void test4(){
        System.out.println("This is test4");
    }


    @Test(groups = {"Sanity", "Regression"})
    void test5(){
        System.out.println("This is test5");
    }

}
