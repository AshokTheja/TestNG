package DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_On_Demo {

	@Test(testName = "Test_1")
	public void Test_1() {
		String st = "Stars";
		Assert.assertEquals(st, "Star");
		System.out.println("Inside Test_1");
	}

	@Test(dependsOnMethods = "Test_1")
	public void Test_2() {
		System.out.println("Inside Test_2");
	}

	@Test(dependsOnMethods = "Test_2")
	public void Test_3() {
		System.out.println("Inside Test_3");
	}

	@Test(dependsOnMethods = "Test_3")
	public void Test_4() {
		System.out.println("Inside Test_4");
	}
}
