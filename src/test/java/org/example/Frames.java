package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();

        //iFrame
        By iframeLocator = By.id("mce_0_ifr");
        WebElement iframe = driver.findElement(iframeLocator);
        driver.switchTo().frame(iframe);

        //Content Body
        By contentBodyLocator = By.id("tinymce");
        WebElement contentBody = driver.findElement(contentBodyLocator);

        System.out.println(contentBody.getText());


        driver.switchTo().parentFrame();

        //h3
        By headerLocator = By.tagName("h3");
        WebElement header = driver.findElement(headerLocator);

        System.out.println(header.getText());

    }
}
