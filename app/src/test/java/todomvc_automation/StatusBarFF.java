package todomvc_automation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.NoSuchElementException.*;

public class StatusBarFF {
    private static FirefoxDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setUpDriver() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeEach
    public void setUpPage() {
        driver.get("https://todomvc.com/examples/react/#/");
    }

    public List<WebElement> getAllToDos() {
        WebElement toDoList = driver.findElement(By.className("todo-list"));
        List<WebElement> allToDos = driver.findElements(By.className("view"));
        return allToDos;
    }

    public void createToDoItem(String itemName) {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys(itemName, Keys.ENTER);
    }

    @Test
    public void testZeroAndOneItem() {
        createToDoItem("Item 1");

        WebElement checkbox = driver.findElement(By.cssSelector(".toggle"));
        checkbox.click();

        WebElement statusBar = driver.findElement(By.cssSelector(".todo-count"));
        assertEquals("0 items left", statusBar.getText());

        checkbox.click();
        assertEquals("1 item left", statusBar.getText());
    }

    @Test
    public void testTwoItems() {
        createToDoItem("Item 1");
        createToDoItem("Item 2");

        WebElement statusBar = driver.findElement(By.cssSelector(".todo-count"));
        assertEquals("2 items left", statusBar.getText());
    }

    @Test
    public void testSeveralItemsLeft() {
        for (int i = 1; i <= 99; i++) {
            createToDoItem("Item " + i);
        }
        WebElement statusBar = driver.findElement(By.cssSelector(".todo-count"));
        assertEquals("99 items left", statusBar.getText());
    }

    @Test
    public void testNoItemsExist() {
        boolean isStatusBarDisplayed;
        try{
            WebElement statusBar = driver.findElement(By.cssSelector(".todo-count"));
            isStatusBarDisplayed = statusBar.isDisplayed();
        }
        catch(NoSuchElementException error) {
            isStatusBarDisplayed = false;
        }
        assertFalse(isStatusBarDisplayed);
    }

    @Test
    public void testStatusBarToggle() {
        createToDoItem("Item 1");

        WebElement allButton = driver.findElement(By.xpath("//a[text()='All']"));
        WebElement activeButton = driver.findElement(By.xpath("//a[text()='Active']"));
        WebElement completedButton = driver.findElement(By.xpath("//a[text()='Completed']"));

        assertTrue(allButton.isEnabled());

        activeButton.click();
        assertTrue(activeButton.isEnabled());

        completedButton.click();
        assertTrue(completedButton.isEnabled());
    }

    @Test
    public void testLongToDo() {
        StringBuilder longTextBuilder = new StringBuilder();
        for (int i = 0; i <= 256; i++) {
            longTextBuilder.append("£");
        }
        String longText = longTextBuilder.toString();
        createToDoItem(longText);
        List<WebElement> todos = getAllToDos();
        assertEquals(1, todos.size());

        WebElement todoLabel = todos.get(0).findElement(By.tagName("label"));
        String todoText = todoLabel.getText();
        assertEquals(longText, todoText);
    }

    @Test
    public void testClearCompletedLink() {
        createToDoItem("Item 1");
        createToDoItem("Item 2");

        WebElement item1Checkbox = driver.findElement(By.xpath("//label[text()='Item 1']/preceding-sibling::input[@type='checkbox']"));
        WebElement item2Checkbox = driver.findElement(By.xpath("//label[text()='Item 2']/preceding-sibling::input[@type='checkbox']"));

        item1Checkbox.click();
        item2Checkbox.click();

        WebElement clearCompletedLink = driver.findElement(By.cssSelector(".clear-completed"));
        assertTrue(clearCompletedLink.isDisplayed());
    }

    @Test
    public void testClearCompleted() {
        createToDoItem("Item 1");
        createToDoItem("Item 2");
        createToDoItem("Item 3");

        WebElement item1Checkbox = driver.findElement(By.xpath("//label[text()='Item 1']/preceding-sibling::input[@type='checkbox']"));
        WebElement item2Checkbox = driver.findElement(By.xpath("//label[text()='Item 2']/preceding-sibling::input[@type='checkbox']"));
        WebElement item3Checkbox = driver.findElement(By.xpath("//label[text()='Item 3']/preceding-sibling::input[@type='checkbox']"));

        item1Checkbox.click();
        item3Checkbox.click();

        WebElement clearCompleted = driver.findElement(By.cssSelector(".clear-completed"));
        clearCompleted.click();

        List<WebElement> remainingToDos = getAllToDos();
        assertEquals(1, remainingToDos.size());

        WebElement remainingToDoLabel = remainingToDos.get(0).findElement(By.tagName("label"));
        String remainingToDoText = remainingToDoLabel.getText();
        assertEquals("Item 2", remainingToDoText);
    }

//      Work in progress...
//    @Test
//    public void testToggleAll() {
//        createToDoItem("Item 1");
//        createToDoItem("Item 2");
//
//        WebElement item1Checkbox = driver.findElement(By.xpath("//label[text()='Item 1']/preceding-sibling::input[@type='checkbox']"));
//        WebElement item2Checkbox = driver.findElement(By.xpath("//label[text()='Item 2']/preceding-sibling::input[@type='checkbox']"));
//
//        item1Checkbox.click();
//        item2Checkbox.click();
//
//        WebElement toggleButton = driver.findElement(By.cssSelector(".toggle-all"));
//        toggleButton.click();
//
//        List<WebElement> todos = getAllToDos();
//        assertTrue(todos.isEmpty());
//
//        toggleButton.click();
//
//        List<WebElement> activeToDos = getAllToDos();
//        assertEquals(2, activeToDos.size());
//    }

//    @AfterAll
//    public static void tearDown() {
//        driver.quit();
//    }
}
