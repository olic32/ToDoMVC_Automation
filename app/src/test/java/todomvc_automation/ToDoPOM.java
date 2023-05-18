package todomvc_automation;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ToDoPOM {

    protected WebDriver driver;

    public ToDoPOM(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findToDoInputBar() {
        WebElement todoField = driver.findElement(By.cssSelector(".new-todo"));
        return todoField;
    }

    public void inputIntoToDoField(String inputText) {
        WebElement todoField = driver.findElement(By.cssSelector(".new-todo"));
        todoField.click();
        todoField.sendKeys(inputText);
    }

    public void enterInputTodo() {
        WebElement todoField = driver.findElement(By.cssSelector(".new-todo"));
        todoField.click();
        todoField.sendKeys(Keys.ENTER);
    }

    public String checkTopOfList() {

        WebElement topEntry = driver.findElement(By.xpath("/html/body/section/section/ul/li[1]/div/label"));
        return topEntry.getText();

    }

    public List<WebElement> getAllTodos() {
        WebElement toDoList = driver.findElement(By.className("todo-list"));
        List<WebElement> allTodos = driver.findElements(By.className("view"));
        return allTodos;
    }

    public void doubleClickTopEntryModify(String newText) {
        WebElement toDoList = driver.findElement(By.className("todo-list"));
        List<WebElement> allTodos = driver.findElements(By.className("view"));
        WebElement topEntry = allTodos.get(0);
        Actions act = new Actions(driver);
        act.doubleClick(topEntry).perform();
        driver.switchTo().activeElement().sendKeys(newText, Keys.ENTER);
//        WebElement modifiedEntry = driver.findElement(By.className("edit"));
//        modifiedEntry.sendKeys(newText);


    }









}
