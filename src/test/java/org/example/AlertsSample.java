package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Simple Alert
        By simpleAlertButtonLocator = By.xpath("//button[contains(text(), 'Alert')]");
        WebElement simpleAlertButton = driver.findElement(simpleAlertButtonLocator);

        simpleAlertButton.click();


        Alert alert = driver.switchTo().alert();
        alert.accept();


        //Confirm Alert
        By confirmAlertButtonLocator = By.xpath("//button[contains(text(), 'Confirm')]");
        WebElement confirmAlertButton = driver.findElement(confirmAlertButtonLocator);

        confirmAlertButton.click();

        alert = driver.switchTo().alert();
        alert.accept();


        //Prompt Alert
        By promptAlertButtonLocator = By.xpath("//button[contains(text(), 'Prompt')]");
        WebElement promptAlertButton = driver.findElement(promptAlertButtonLocator);

        promptAlertButton.click();

        alert = driver.switchTo().alert();

        alert.sendKeys("Test Alert");
        alert.accept();

    }
}
