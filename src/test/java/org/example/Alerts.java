package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        /*
         * Simple Alert
         * */

        WebElement jsSimpleAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));

        jsSimpleAlertButton.click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();



        /*
        * Confirm Alert
        * */

//        WebElement jsConfirmAlertButton = driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]"));
//
//        jsConfirmAlertButton.click();
//
//        alert = driver.switchTo().alert();
//
//        System.out.println(alert.getText());
//
//        alert.dismiss();
//        alert.accept();



        /*
         * Prompt Alert
         * */

//        WebElement jsPromptAlertButton = driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]"));
//        jsPromptAlertButton.click();
//
//        alert = driver.switchTo().alert();
//
//        alert.sendKeys("Test Alerts");
//        alert.accept();

    }
}
