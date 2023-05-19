package todomvc_automation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.xpath;

public class ToDoMVCReactFF {
    private static FirefoxDriver driver;
    private static WebDriverWait wait;




    @BeforeEach
    public void launchBrowserSmall() {

        driver = new FirefoxDriver();
        driver.get("https://todomvc.com/examples/react/#/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }


    public List<WebElement> getAllToDos() {
        List<WebElement> allToDos = driver.findElements(By.className("view"));
        return allToDos;
    }

    public void createToDoItem(String itemName) {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys(itemName, Keys.ENTER);
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

    @Test
    public void canModifyEntry() {
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        List<WebElement> allToDos = frameworkPageSelect.getAllTodos();
        List<String> expectedToDos = Arrays.asList("Looks like this");

        for (WebElement todo : allToDos) {
            String thisOne = todo.getText();
            assertTrue(expectedToDos.contains(thisOne));
        }

        frameworkPageSelect.doubleClickTopEntryModify(", plus this");

        List<WebElement> allToDosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedToDosModified = Arrays.asList("Looks like this, plus this");

        for (WebElement todo : allToDosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedToDosModified.contains(thisOneMod));
        }
    }

    @Test
    public void modifyEntryEscape() {
        ToDoPOM frameworkPageSelect = new ToDoPOM(driver);

        frameworkPageSelect.inputIntoToDoField("Looks like this");
        frameworkPageSelect.enterInputTodo();

        List<WebElement> allTodos = frameworkPageSelect.getAllTodos();
        List<String> expectedTodos = Arrays.asList("Looks like this");

        for (WebElement todo : allTodos) {
            String thisOne = todo.getText();
            assertTrue(expectedTodos.contains(thisOne));
        }

        frameworkPageSelect.doubleClickTopEntryModifyEscape(", plus this");

        List<WebElement> allTodosModified = frameworkPageSelect.getAllTodos();
        List<String> expectedTodosModified = Arrays.asList("Looks like this");

        for (WebElement todo : allTodosModified) {
            String thisOneMod = todo.getText();
            assertTrue(expectedTodosModified.contains(thisOneMod));
        }
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

    @Test
    public void testCreateAndDeleteIncomplete() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("Delete me", Keys.ENTER);
        WebElement inputElement2 = driver.findElement(By.cssSelector(".new-todo"));
        inputElement2.sendKeys("Keep me", Keys.ENTER);

        WebElement todoItem = driver.findElement(xpath("//label[text()='Delete me']"));
        WebElement checkbox = todoItem.findElement(xpath("./preceding-sibling::input[@type='checkbox']"));
        checkbox.click();
        checkbox.click();

        WebElement deleteButton = todoItem.findElement(xpath("./following-sibling::button[@class='destroy']"));
        deleteButton.click();

        List<WebElement> remainingToDos = getAllToDos();
        for (WebElement todo : remainingToDos) {
            WebElement todoLabel = todo.findElement(xpath(".//label"));
            String todoText = todoLabel.getText();
            assertFalse(todoText.equals("Delete me"));
        }
    }

    @Test
    public void testCreateAndDeleteComplete() {
        WebElement inputElement = driver.findElement(By.cssSelector(".new-todo"));
        inputElement.sendKeys("Delete me!", Keys.ENTER);
        WebElement inputElement2 = driver.findElement(By.cssSelector(".new-todo"));
        inputElement2.sendKeys("I'm here to stay", Keys.ENTER);

        WebElement todoItem = driver.findElement(xpath("//label[text()='Delete me!']"));
        WebElement checkbox = todoItem.findElement(xpath("./preceding-sibling::input[@type='checkbox']"));
        checkbox.click();

        WebElement deleteButton = todoItem.findElement(xpath("./following-sibling::button[@class='destroy']"));
        deleteButton.click();

        List<WebElement> remainingToDos = getAllToDos();
        for (WebElement todo : remainingToDos) {
            WebElement todoLabel = todo.findElement(xpath(".//label"));
            String todoText = todoLabel.getText();
            assertFalse(todoText.equals("Delete me!"));}
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

    @AfterEach
    public void closeBrowserBetween() {
        driver.quit();
    }

    @AfterAll
    static void closeBrowser() {
        driver.quit();
    }


}
