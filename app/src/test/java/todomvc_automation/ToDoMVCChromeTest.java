package todomvc_automation;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

public class ToDoMVCChromeTest {

    private static ChromeDriver driver;



    @BeforeAll
    static void launchBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Test
    public void addEntryCheckTop() {

        //Create instance of the homepage POM class
        HomepagePOM homePageSelect = new HomepagePOM(driver);

        //Navigate to the first framework
        homePageSelect.navigateToFramework("Backbone.js");

        //Create generic instance of the framework page (same across frameworks)
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //Then from heere you can run your tests on the first framework
        //For example - add "Hello to the input field"
        frameworkPageSelect.inputIntoToDoField("a");

        //Then press enter
        frameworkPageSelect.enterInputTodo();

        //Check what is at the top of the list
        String topOfList = frameworkPageSelect.checkTopOfList();

        //Assert it's what we inputted
        assertEquals(topOfList, "a");

    }
    @Test
    public void checkMultipleEntries() {

        //Create instance of the homepage POM class
        HomepagePOM homePageSelect = new HomepagePOM(driver);

        //Navigate to the first framework
        homePageSelect.navigateToFramework("Dojo");

        //Create generic instance of the framework page (same across frameworks)
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //Then from heere you can run your tests on the first framework
        //For example - add "Hello to the input field"
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ö");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("c");
        frameworkPageSelect.enterInputTodo();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a", "ö", "c");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

    }

    @AfterAll
    static void closeBrowser() {
        driver.quit();
    }
}
