package ExpectedExceptions;

import org.testng.annotations.Test;

public class ExpectedExceptionsDemo {

	// Handling Exceptions using "expectedExceptions" in @Test annotation
	/*
	 * @Test(invocationTimeOut=2000) public void InfinteLoopTest() {
	 * 
	 * int i=1; while(i==1){ System.out.println(i); } }
	 */

	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
		System.out.println(x);
	}

}
