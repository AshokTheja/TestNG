package Parallel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Browser_Demo {

	WebDriver driver;
	WebDriverWait wait;
	String browser;

	@BeforeMethod
	@Parameters("browser_name")
	public void set_Up(String browser) {

		this.browser = browser;

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tear_Down() {
		driver.quit();
	}

	@org.testng.annotations.Test
	public void Test() throws IOException, InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("SS// " + browser + ".PNG"));
	}
}
