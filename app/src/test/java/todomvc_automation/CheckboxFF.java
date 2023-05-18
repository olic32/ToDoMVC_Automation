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

public class CheckboxFF {
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
    public void toggleCheckbox() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("Test to-do", Keys.ENTER);

        WebElement todoItem = driver.findElement(By.xpath("//label[text()='Test to-do']"));
        WebElement checkbox = todoItem.findElement(By.xpath("./preceding-sibling::input[@type='checkbox']"));

        assertFalse(checkbox.isSelected(), "Checkbox should be unticked");
        checkbox.click();
        assertTrue(checkbox.isSelected(), "Checkbox should be ticked");
        checkbox.click();
        assertFalse(checkbox.isSelected(), "Checkbox should be unticked");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
