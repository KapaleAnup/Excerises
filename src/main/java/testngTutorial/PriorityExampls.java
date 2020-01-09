package testngTutorial;

import org.testng.annotations.Test;

public class PriorityExampls {

    @Test(priority = 0)
    void one() {
        System.out.println("test one");
    }

    @Test(priority = 1)
    void two() {
        System.out.println("test two");
    }

    @Test(priority = 2)
    void three() {
        System.out.println("test three");
    }

    @Test(priority = 3, enabled = true)
    void four() {
        System.out.println("test four");
    }
}
