package todomvc_automation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.NoSuchElementException.*;

public class DeleteToDoFF {

    private static FirefoxDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setUpDriver() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
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

    @Test
    public void testCreateAndDeleteIncomplete() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("Incomplete to-do", Keys.ENTER);

        WebElement todoItem = driver.findElement(xpath("//label[text()='Incomplete to-do']"));
        WebElement deleteButton = todoItem.findElement(xpath("./following-sibling::button[@class='destroy']"));
        deleteButton.click();

        assertFalse(getAllToDos().isEmpty());
    }

    @Test
    public void testCreateAndDeleteComplete() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("Complete to-do", Keys.ENTER);

        WebElement todoItem = driver.findElement(xpath("//label[text()='Complete to-do']"));
        WebElement checkbox = todoItem.findElement(xpath("./preceding-sibling::input[@type='checkbox']"));
        checkbox.click();

        WebElement deleteButton = todoItem.findElement(xpath("./following-sibling::button[@class='destroy']"));
        deleteButton.click();

        assertFalse(getAllToDos().isEmpty());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
