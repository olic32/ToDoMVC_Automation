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
import static org.junit.jupiter.api.Assertions.fail;
import static org.openqa.selenium.NoSuchElementException.*;

public class DeleteToDoFF {

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
    public void testCreateAndDeleteIncomplete() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("Incomplete to-do", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.xpath("//label[text()='Incomplete to-do']"));
        WebElement deleteButton = todoItem.findElement(By.xpath("./following-sibling::button[@class='destroy']"));
        deleteButton.click();

        assertElementNotPresent(todoItem, "Item should be deleted");
    }

    @Test
    public void testCreateAndDeleteComplete() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("Complete to-do", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.xpath("//label[text()='Complete to-do']"));
        WebElement checkbox = todoItem.findElement(By.xpath("./preceding-sibling::input[@type='checkbox']"));
        checkbox.click();

        WebElement deleteButton = todoItem.findElement(By.xpath("./following-sibling::button[@class='destroy']"));
        deleteButton.click();

        assertElementNotPresent(todoItem, "Complete item should be deleted");
    }

    private void assertElementNotPresent(WebElement element, String message) {
        try {
            assertFalse(element.isDisplayed());
        } catch (NoSuchElementException e) {
            return;
        } fail(message);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
