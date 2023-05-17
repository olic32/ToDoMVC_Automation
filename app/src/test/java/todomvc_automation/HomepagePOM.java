package todomvc_automation;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

//This class is the Page-Object model for the ToDoMVC homepage, so that we can store links to the various frameworks

public class HomepagePOM {

//    Sets the name 'driver' for the webdriver
    protected WebDriver driver;

//    When an instance of the OPM is created, can pass in the
    public HomepagePOM(WebDriver driver) {
        this.driver = driver;
    }

}
