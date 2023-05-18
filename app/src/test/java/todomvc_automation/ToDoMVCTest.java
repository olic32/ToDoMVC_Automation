package todomvc_automation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToDoMVCTest {
    private static FirefoxDriver driver;
    @BeforeAll
    public static void setUpDriver() {
        driver = new FirefoxDriver();
    }

    @BeforeEach
    public void setUpPage() {
        driver.get("https://todomvc.com/examples/react/#/");
    }

    @Test
    public List<WebElement> getAllToDos() {
        WebElement toDoList = driver.findElement(By.className("todo-list"));
        List<WebElement> allToDos = driver.findElements(By.className("view"));
        return allToDos;
    }

    @Test
    public void testGetAllToDos() {
        List<WebElement> allToDos = getAllToDos();
        List<String> expectedToDos = Arrays.asList("a", "ö", "á", "!", "?");
        for (WebElement todo: allToDos) {
            String thisOne = todo.getText();
            assertTrue(expectedToDos.contains(thisOne));
        }
    }

    @Test
    public void addToDoItem() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("a", Keys.ENTER);
    }

    @Test
    public void addToDoAccentedCharacter() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("ö", Keys.ENTER);
    }

    @Test
    public void addToDoAccentedCharacter2() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("á", Keys.ENTER);
    }

    @Test
    public void addToDoPunctuation() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("!", Keys.ENTER);
    }

    @Test
    public void addToDoPunctuation2() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("?", Keys.ENTER);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
