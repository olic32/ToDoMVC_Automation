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




//Test for adding a single character to the list, and it being displayed
    // Across multiple frameworks

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
    public void singleCharacterKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
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
    public void singleCharacterSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
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
    public void singleCharacterDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
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
    public void singleCharacterClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
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
    public void singleCharacterElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
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
    public void singleCharacterAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
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
    public void singleCharacterReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
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


//Test for adding a multiple entries to the list, and them all being displayed
    // Across multiple frameworks

    @Test
    public void checkMultipleEntriesBackBone() {

        //Create instance of the homepage POM class
        HomepagePOM homePageSelect = new HomepagePOM(driver);

        //Navigate to the first framework
        homePageSelect.navigateToFramework("Backbone.js");

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
    @Test
    public void checkMultipleEntriesKnockoutJS () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesDojo () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesKnockback () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesCanJS () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesMithril () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesVuejs () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesMarionette () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesKotlinReact () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesDart () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesElm () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesAngularDart () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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
    @Test
    public void checkMultipleEntriesReagent () {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
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


    @Test
    public void accentCharactersBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersKnockback() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
    }
    @Test
    public void accentCharactersReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("á");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ú");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("ę");
        frameworkPageSelect.enterInputTodo();
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("á","ú","ę");

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
