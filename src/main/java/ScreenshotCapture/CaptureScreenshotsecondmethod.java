package ScreenshotCapture;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshotsecondmethod {

    public static void main (String args[]){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");

        File souce = driver.findElement(By.id("imagetrgt")).getScreenshotAs(OutputType.FILE);

        try {
            FileHandler.copy(souce, new File("./screenshots/photo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
