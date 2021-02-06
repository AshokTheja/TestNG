package com.rev.SSforFail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.qa.Utility.Listener.class)
public class UsingiTestListener {
	static WebDriver driver;

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
	public void tearDown() throws IOException {
		driver.quit();
	}

	public void takeScreenshot() throws IOException {
		File src = ((TakesScreenshot) UsingiTestListener.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/test.png"));
		System.out.println("Screenshot taken");
	}

}
