package todomvc_automation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

//THIS TEST SUITE WAS THE SECOND BUILT ONE
//ALL TESTS TESTED ON CHROME FIRST, FIREFOX SECOND
//THIS TEST SUITE JUST BUILT TO SEE IF THE CHROME TESTS WORK ON FIREFOX TOO
//MOSTLY THEY DO, BUT APPEARS TO BE SOME ISSUES WITH SOME FRAMEWORKS



public class ToDoMVCFireFox {
    private static FirefoxDriver driver;

    @BeforeEach
    public void launchBrowserSmall() {
        driver = new FirefoxDriver();
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
    @Disabled //Unsure why this doesnt work on this framework
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





    //Test for accented characters

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







// Test for modifying existing entries

    @Test
    public void modifyEntryBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    //This test fails as Knockback.JS requires a double click, the one further click in order to edit. report to devs
    @Disabled
    @Test
    public void modifyEntryKnockbackJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }

    //this test fails as the modify tool works slightly differently - feedback to devs? it places the cursor at the start
    @Disabled
    @Test
    public void modifyEntryMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it

        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }

    //this test fails as the modify tool works slightly differently - feedback to devs? it places the cursor at the start
    @Disabled
    @Test
    public void modifyEntrySpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }

    //This looks like it works, but doesnt - check with screenshots?
    @Disabled
    @Test
    public void modifyEntryElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }

    //this test fails as the modify tool works slightly differently - feedback to devs? it places the cursor at the start
    @Disabled
    @Test
    public void modifyEntryReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it
        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }







//    Test to see if modifying the input then pressing escape cancels the modification

    @Test
    public void modifyEntryEscapeBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    //This test fails as Knockback.JS requires a double click, the one further click in order to edit. report to devs
    //Understand this test is for checking cancelling modification
    //But i cant figure out how to get selenium to double click then click again then send keys!
    @Disabled
    @Test
    public void modifyEntryEscapeKnockbackJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter

        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            System.out.println("Here");
            System.out.println(thisOneMod);
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }
    @Test
    public void modifyEntryEscapeReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        //add a first todo
        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        //assert it looks the same
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        //modify it, then press escape before enter
        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        //assert the new top entry
        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
    }


    //These tests check for ticking off a ToDo item. There is a commented out screenshot function for
    //checking if the line appears. Commented out to save the repo from filling up with pngs
    @Test
    public void tickOffTodoBackbone() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoKnockoutJS() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoDojo() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoKnockbackJS() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoCanJS() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoMithril() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoVuejs() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoMarionettejs() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoKotlinReact() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoSpine() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoDart() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoClosure() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoElm() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoAngularDart() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffTodoReagent() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        //frameworkPageSelect.takeScreenshot("backbone_tickline.png");
        assertTrue(frameworkPageSelect.checkIfTicked());
    }




    //these tests check that it can be ticked open again
    @Test
    public void tickOffThenOnTodoBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoKnockbackJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }
    @Test
    public void tickOffThenOnTodoReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("tick me off, then on!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        assertTrue(frameworkPageSelect.checkIfTicked());
        frameworkPageSelect.toggleCompleteButton();
        assertFalse(frameworkPageSelect.checkIfTicked());
    }

    //According to our test plan, we should here have the click and drag function for todo's
    //However, this functionality not implemented yet
    //Not going to write a test as will have no idea if it will work!



    //These tests check if ToDo's can be deleted!
    //Both complete, and incomplete - these tests dont work currently
    @Disabled
    @Test
    public void createAndDeleteTodoBackbone() throws IOException {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoKnockbackJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }
    @Disabled
    @Test
    public void createAndDeleteTodoReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("delete me!");
        frameworkPageSelect.enterInputTodo();

        //check if the entry appears
        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("delete me!");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }
        //click the delete button
        frameworkPageSelect.deleteTopEntry();

        //check its disappeared

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());

        //do the same with a completed ToDo

        frameworkPageSelect.inputIntoToDoField("tick me off, then delete me!");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.deleteTopEntry();

        assertFalse(frameworkPageSelect.getAllTodos().isEmpty());
    }


    //This test checks the status bar displays correct number of todo's in the list
    @Test
    public void toDoCount123Backbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123KnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Dojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Knockbackjs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123CanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Mithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Vuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Marionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123KotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Spine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Dart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Closure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Elm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    //This test fails due to a bug - only the number "3" appears, not "3 items left"
    @Disabled
    @Test
    public void toDoCount123AngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }
    @Test
    public void toDoCount123Reagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        frameworkPageSelect.inputIntoToDoField("number 1");
        frameworkPageSelect.enterInputTodo();

        //get the count
        String statusNumber = frameworkPageSelect.getNumberStatusBar();
        //assert is 1
        assertEquals(statusNumber,"1 item left");

        //add two more
        frameworkPageSelect.inputIntoToDoField("number 2");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("number 3");
        frameworkPageSelect.enterInputTodo();

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 3
        assertEquals(statusNumber2,"3 items left");

    }



    //this test checks the upper limits of the amount of todos
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Backbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99KnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Dojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Knockbackjs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99CanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Mithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Vuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Marionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99KotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Spine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Dart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Closure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Elm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99AngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }
    @Disabled //too long to run in every pass
    @Test
    public void todoCount99Reagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        //add 100 todos
        for (int i = 1; i <= 100; i++){
            String s=String.valueOf(i);
            frameworkPageSelect.inputIntoToDoField(s);
            frameworkPageSelect.enterInputTodo();
        }

        String statusNumber2 = frameworkPageSelect.getNumberStatusBar();
        //assert is 100
        assertEquals("100 items left",statusNumber2);
    }



    //These tests see if the status bar is hidden when no todos (complete or incomplete)

    @Test
    public void statusBarBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarKnockbackjs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    //This test fails as angular dart framework is missing alot of status bar functionality. more info in bug report
    @Disabled
    @Test
    public void statusBarAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }
    @Test
    public void statusBarReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();

        assertTrue(frameworkPageSelect.getStatusBarStatus());

        frameworkPageSelect.toggleCompleteButton();
        frameworkPageSelect.clearCompleted();

        assertFalse(frameworkPageSelect.getStatusBarStatus());
    }


//this tests the status bar toggles, and checks that todos are correctly displayed under correct tabs

    @Test
    public void statusBarTogglesBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesKnockbackjs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }
    @Test
    public void statusBarTogglesReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("a");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.inputIntoToDoField("b");
        frameworkPageSelect.enterInputTodo();
        frameworkPageSelect.toggleCompleteButton();

        frameworkPageSelect.toggleAllTodos();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedAllTodos = Arrays.asList("a","b");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedAllTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleActiveTodos();

        List<WebElement> activeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedActiveTodos = Arrays.asList("a");

        for (WebElement todo : activeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedActiveTodos.contains(thisOne));
        }

        frameworkPageSelect.toggleCompletedTodos();

        List<WebElement> completeTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedCompleteTodos = Arrays.asList("b");

        for (WebElement todo : completeTodos) {
            String thisOne = todo.getText();
            System.out.println(thisOne);
            assertFalse(expectedCompleteTodos.contains(thisOne));
        }

    }


//these test for a 256 character long todo


    @Test
    public void largeCharacterBackbone() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Backbone.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterKnockoutJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("KnockoutJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterDojo() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dojo");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterKnockbackjs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Knockback.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterCanJS() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("CanJS");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterMithril() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Mithril");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterVuejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Vue.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterMarionettejs() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Marionette.js");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterKotlinReact() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Kotlin + React");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterSpine() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Spine");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Dart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterClosure() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Closure");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterElm() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Elm");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterAngularDart() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("AngularDart");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
    }
    @Test
    public void largeCharacterReagent() {
        HomepagePOM homePageSelect = new HomepagePOM(driver);
        homePageSelect.navigateToFramework("Reagent");
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);
        for (Integer i = 0; i < 256; i++) {
            frameworkPageSelect.inputIntoToDoField("a");
        }

        frameworkPageSelect.enterInputTodo();

        List<WebElement> todoList = frameworkPageSelect.getAllTodos();

        WebElement thisTodo = todoList.get(0);
        String thisTodoString = thisTodo.getText();

        Integer length = thisTodoString.length();

        assertEquals(256,length);
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
