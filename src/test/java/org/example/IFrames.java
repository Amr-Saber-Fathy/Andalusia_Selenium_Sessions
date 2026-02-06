package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();

//        WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
//
//        driver.switchTo().frame(iFrame);

        WebElement textBody = driver.findElement(By.id("tinymce"));

        System.out.println(textBody.getText());
    }
}
