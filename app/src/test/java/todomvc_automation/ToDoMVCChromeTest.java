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

    @BeforeEach
    public void launchBrowserSmall() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Test
    public void singleCharacterBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void singleCharacterKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void singleCharacterDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void singleCharacterKnockback() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void singleCharacterCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void singleCharacterMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void singleCharacterVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void singleCharacterMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("a");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }






    @Test
    public void checkMultipleEntriesBackBone() {

        //Create instance of the homepage POM class
        HomepagePOM homePageSelect = new HomepagePOM(driver);

        //Navigate to the first framework
        homePageSelect.navigateToFramework("Dojo");

        //Create generic instance of the framework page (same across frameworks)
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //Then from heere you can run your tests on the first framework
        //For example - add "Hello to the input field"
        frameworkPageSelect.inputIntoToDoField("Hello");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("Hello too");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("Hello three");
        frameworkPageSelect.enterInputTodo();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Hello", "Hello too", "Hello three");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

    }

    @AfterEach
    public void closeBrowserBetween() {
        driver.quit();
    }

    @AfterAll
    static void closeBrowser() {
        driver.quit();
    }
}
