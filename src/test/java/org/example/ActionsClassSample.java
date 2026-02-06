package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassSample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        String profileLocator = "(//img[@alt='User Avatar'])"; //[i]

        for (int i=1; i<=3; i++){
            WebElement profile = driver.findElement(By.xpath(profileLocator+"["+i+"]"));
            actions.moveToElement(profile).perform();

            actions.keyDown(Keys.SPACE);
            actions.keyUp(Keys.SPACE);
        }
    }
}
