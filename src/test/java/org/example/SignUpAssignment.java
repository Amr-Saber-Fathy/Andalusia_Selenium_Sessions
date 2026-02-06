package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpAssignment {


    static String firstName = "Amr";
    static String lastName = "Saber";
    static String email = "amr8.test@test.com";
    static String password = "Test_15Amr";

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://qacart-todo.herokuapp.com/signup");
        driver.manage().window().maximize();

        //first name field
        By firstNameFieldLocator = By.cssSelector("input[data-testid='first-name']");
        WebElement firstNameField = driver.findElement(firstNameFieldLocator);

        //last name field
        By lastNameFieldLocator = By.cssSelector("input[data-testid='last-name']");
        WebElement lastNameField = driver.findElement(lastNameFieldLocator);

        //email field
        By emailFieldLocator = By.cssSelector("input[data-testid='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        //password field
        By passwordFieldLocator = By.cssSelector("input[data-testid='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        //confirm password field
        By confirmPasswordFieldLocator = By.cssSelector("input[data-testid='confirm-password']");
        WebElement confirmPasswordField = driver.findElement(confirmPasswordFieldLocator);

        //Signup button
        By signupButtonLocator = By.cssSelector("button[data-testid='submit']");
        WebElement signupButton = driver.findElement(signupButtonLocator);


        //1- Signup Test Case Execution
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        signupButton.click();

        //2- Logout

        //Logout Button
        By logoutButtonLocator = By.xpath("//span[text()='Logout']");
        WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButtonLocator));
        logoutButton.click();

        //3- Login

        //Email field
        By loginEmailFieldLocator = By.id("email");
        WebElement loginEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmailFieldLocator));
        loginEmailField.sendKeys(email);

        //Password field
        By loginPasswordFieldLocator = By.id("password");
        WebElement loginPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(loginPasswordFieldLocator));
        loginPasswordField.sendKeys(password);

        //Login button
        By loginButtonLocator = By.id("submit");
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButtonLocator));
        loginButton.click();


    }


}
