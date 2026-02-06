package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitsSample {

    static String firstName = "Amr";
    static String lastName = "Saber";
    static String email = "amr.test@test.com";
    static String password = "Test_15Amr";

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .pollingEvery(Duration.ofSeconds(2));

        driver.get("https://qacart-todo.herokuapp.com/signup");
        driver.manage().window().maximize();

        //first name field

        By firstNameFieldLocator = By.cssSelector("input[data-testid='first-name2']");

        WebElement firstNameField = wait.until(d -> d.findElement(firstNameFieldLocator));

        firstNameField.sendKeys(firstName);


        driver.quit();
    }
}
