package org.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class edgedriversetup {

    public static void main(String[] args) {

      

        WebDriver driver = new FirefoxDriver();
        System.out.println("l");

        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}
