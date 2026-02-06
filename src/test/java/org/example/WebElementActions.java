package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class WebElementActions {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://qacart-todo.herokuapp.com/login");

        driver.manage().window().maximize();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("tester@test.co");

        driver.findElement(By.name("password")).sendKeys("test_12test");

        emailField.getAttribute("type");
        emailField.clear();

//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class);

//        String inputFieldsDynamicLocator = "(//input[@type])";
//
//        for(int i=1; i<=2; i++){
//            driver.findElement(By.xpath(inputFieldsDynamicLocator+"["+i+"]")).sendKeys("test" + i);
//        }

//        ArrayList<WebElement> inputFields = (ArrayList<WebElement>) driver.findElements(By.tagName("input"));
//
//        inputFields.get(0).sendKeys("tester@test.co");
//        inputFields.get(1).sendKeys("test_12test");

        driver.findElement(By.tagName("button")).click();

    }
}
