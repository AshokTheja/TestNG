package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Inside Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Inside After Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside After Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("inside After class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside After Method");
	}

	@Test
	public void insideTest() {
		System.out.println("Inside Test Method");
	}

}
