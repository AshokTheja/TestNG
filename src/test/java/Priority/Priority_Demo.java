package Priority;

import org.testng.annotations.Test;

public class Priority_Demo {

	@Test(priority = 1)
	private void Test_1() {
		System.out.println("Inside Test_1 & Priority 1");
	}

	@Test(priority = 3)
	private void Test_2() {
		System.out.println("Inside Test_2 & Priority 2");
	}

	@Test
	private void Test_3() {
		System.out.println("Inside Test_3 & Priority 3");
	}

	@Test(priority = 0)
	private void Test_4() {
		System.out.println("Inside Test_4 & Priority 4");
	}

}
