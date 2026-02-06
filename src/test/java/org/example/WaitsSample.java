package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsSample {

    static String firstName = "Amr";
    static String lastName = "Saber";
    static String email = "amr.test@test.com";
    static String password = "Test_15Amr";

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2));

        driver.get("https://qacart-todo.herokuapp.com/signup");
        driver.manage().window().maximize();

        //first name field

//        Thread.sleep(10000);
        By firstNameFieldLocator = By.cssSelector("input[data-testid='first-name2']");
//        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFieldLocator));

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-testid='first-name2']"))).sendKeys(firstName);
//        WebElement firstNameField = driver.findElement(firstNameFieldLocator);
        WebElement firstNameField = wait.until(driver2 -> driver2.findElement(firstNameFieldLocator));

        firstNameField.sendKeys(firstName);


        driver.quit();
    }
}
