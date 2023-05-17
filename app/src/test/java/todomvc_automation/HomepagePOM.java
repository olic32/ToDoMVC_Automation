package todomvc_automation;
import org.openqa.selenium.*;


//This class is the Page-Object model for the ToDoMVC homepage, so that we can store links to the various frameworks

public class HomepagePOM {

//    Sets the name 'driver' for the webdriver
    protected WebDriver driver;

//    When an instance of the OPM is created, can pass in the driver used in the main test class
    public HomepagePOM(WebDriver driver) {
        this.driver = driver;
    }

    // This function takes a single string with the full name of the framework (ie Backbone.js), and navigates the driver to it
    public void navigateToFramework(String frameworkName) {

        //First, go to the homepage
        driver.get("https://todomvc.com/");
        //Find the framework by link text
        WebElement link = driver.findElement(By.linkText(frameworkName));
        //Click on it
        link.click();

    }


}
