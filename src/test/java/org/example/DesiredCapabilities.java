package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilities {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        // 2. Add arguments (the most common way to configure)
        options.addArguments("--start-maximized");      // Open browser maximized
        options.addArguments("--incognito");            // Private browsing
        options.addArguments("--headless=new");        // Run without a window (very fast)

        WebDriver driver = new ChromeDriver(options);

        WebDriver driver1 = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        Thread.sleep(2000);
    }
}
