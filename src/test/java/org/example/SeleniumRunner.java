package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRunner {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://qacart-todo.herokuapp.com/signup");

        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.navigate().to("https://qacart-todo.herokuapp.com/login");

        driver.navigate().back();

        driver.navigate().forward();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

//        driver.quit();
    }
}
