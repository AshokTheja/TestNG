package com.rev.SSforFail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Utility.Utilitys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingiTestResult {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("Inside Before Method");
	}

	@Test
	public void GoogleLogoTest() {
		driver.findElement(By.id("hploogo")).isDisplayed();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			Utilitys.takeScreenshot(driver, result.getName());
		}
		driver.quit();
	}

}
