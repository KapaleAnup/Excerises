package testngTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependecyExamples {

    @Test
    void startCar() {
        System.out.println(" Car started.");
//        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar() {
        System.out.println(" drive card.");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar() {
        System.out.println(" Car stoped.");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    void parkCar() {
        System.out.println(" car parked.");
    }

}
