package todomvc_automation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ToDoMVCTest {
    private static FirefoxDriver driver;
    @BeforeAll
    public static void setUp() {
        driver = new FirefoxDriver();
    }

    @BeforeEach
    public void clearInput() {
        driver.get("https://todomvc.com/examples/react/#/");
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.clear();
    }

    @Test
    public void addToDoItem() {
        driver.get("https://todomvc.com/examples/react/#/");

        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("a", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.cssSelector(".todo-list li:nth-of-type(1) label"));
        Assertions.assertEquals("a", todoItem.getText());
    }

    @Test
    public void addToDoAccentedCharacter() {
        driver.get("https://todomvc.com/examples/react/#/");

        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("ö", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.cssSelector(".todo-list li:nth-child(2) label"));
        Assertions.assertEquals("ö", todoItem.getText());
    }

    @Test
    public void addToDoAccentedCharacter2() {
        driver.get("https://todomvc.com/examples/react/#/");

        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("á", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.cssSelector(".todo-list li:nth-child(3) label"));
        Assertions.assertEquals("á", todoItem.getText());
    }

    @Test
    public void addToDoPunctuation() {
        driver.get("https://todomvc.com/examples/react/#/");

        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("!", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.cssSelector(".todo-list li:nth-child(4) label"));
        Assertions.assertEquals("!", todoItem.getText());
    }

    @Test
    public void addToDoPunctuation2() {
        driver.get("https://todomvc.com/examples/react/#/");

        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("?", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.cssSelector(".todo-list li:nth-child(5) label"));
        Assertions.assertEquals("?", todoItem.getText());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
