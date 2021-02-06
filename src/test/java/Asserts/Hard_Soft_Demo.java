package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Demo {

	@Test
	public void hardAssertTest() {
		String st = null;

		Assert.assertEquals(st, "Star");
		System.out.println("trying to print after hard assert fails");
	}

	SoftAssert sAssert = new SoftAssert();

	@Test
	public void softAssertTest() {
		String st1 = "Star";

		sAssert.assertNull(st1);
		System.out.println("Trying to print in softAssert after assert fails");
		sAssert.assertAll();
	}

}
