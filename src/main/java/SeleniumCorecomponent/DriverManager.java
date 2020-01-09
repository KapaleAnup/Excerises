package SeleniumCorecomponent;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

   protected WebDriver driver;

   protected abstract void CreateWebDriver();

   public void quitWebDriver(){
       if(null!=driver){
           driver.quit();
           driver = null;
       }
   }

   public WebDriver getWebDriver(WebDriver driver){
       if(null == this.driver){
           CreateWebDriver();
       }
       return this.driver;
   }
}
