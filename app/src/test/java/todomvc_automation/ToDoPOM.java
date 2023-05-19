package todomvc_automation;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.xpath;

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

    }


    public void doubleClickTopEntryModifyEscape(String newText) {
        WebElement toDoList = driver.findElement(By.className("todo-list"));
        List<WebElement> allTodos = driver.findElements(By.className("view"));
        WebElement topEntry = allTodos.get(0);
        Actions act = new Actions(driver);
        act.doubleClick(topEntry).perform();
        driver.switchTo().activeElement().sendKeys(newText);
        driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);

    }

    public void takeScreenshot(String desiredPath) throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(desiredPath);
        FileUtils.copyFile(screenshotFile, targetFile);
    }

    public void toggleCompleteButton() {
        WebElement toggle = driver.findElement(By.className("toggle"));
        toggle.click();
    }

    public Boolean checkIfTicked() {
        WebElement toggle = driver.findElement(By.className("toggle"));
        Boolean isChecked = (toggle.getAttribute("checked") != null);
        return isChecked;
    }

    public void deleteTopEntry() {
        WebElement completeSwitch = driver.findElement(By.className("toggle"));
        completeSwitch.click();
        completeSwitch.click();
        WebElement deleteButton = driver.findElement(By.className("destroy"));

        deleteButton.click();
    }

    public String getNumberStatusBar() {
        WebElement todoCount = driver.findElement(By.className("todo-count"));
        return todoCount.getText();
    }

    public Boolean getStatusBarStatus() {
        try{
            WebElement statusBar = driver.findElement(By.className("filters"));
            return (statusBar.isDisplayed());
        }
        catch(NoSuchElementException error) {
            return false;
        }

    }

    public void toggleAllTodos() {
        WebElement allToggle = driver.findElement(By.linkText("All"));
        allToggle.click();
    }
    public void toggleActiveTodos() {
        WebElement activeToggle = driver.findElement(By.linkText("Active"));
        activeToggle.click();
    }
    public void toggleCompletedTodos() {
        WebElement completeToggle = driver.findElement(By.linkText("Completed"));
        completeToggle.click();
    }



    public void clearCompleted() {
        WebElement clearCompletedButton = driver.findElement(By.className("clear-completed"));
        clearCompletedButton.click();
    }









}
