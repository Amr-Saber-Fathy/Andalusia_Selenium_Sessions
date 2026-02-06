package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        driver.manage().window().maximize();

        WebElement profile1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));

        WebElement profile3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(profile1).perform();

        Thread.sleep(2000);

        actions.moveToElement(profile3).perform();

        actions.contextClick(profile1).perform();

    }
}
