package org.basics;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class practice 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.switchTo().activeElement();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().frame(1);
		
		WebElement a = driver.findElement(By.id(""));
		Select se = new Select(a);
		
		
		
			WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(15));
			explicitwait.until(ExpectedConditions.elementToBeClickable(a));
			
			FluentWait as = new FluentWait(driver);
			as.withTimeout(Duration.ofSeconds(15));
			as.pollingEvery(Duration.ofMillis(250));
			as.until(ExpectedConditions.elementToBeClickable(a));
			
			Assert.assertEquals(false, null);
			Assert.assertEquals(driver.getTitle(), "test", "error");
	}
	 
}
