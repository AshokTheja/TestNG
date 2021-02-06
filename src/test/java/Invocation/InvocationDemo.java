package Invocation;

import org.testng.annotations.Test;

public class InvocationDemo {

	// Testing InvocationCount Feature
	@Test(invocationCount = 10)
	public void InvocationCount() {
		int i = 10;
		int j = 20;

		int k = i + j;

		System.out.println("Sum is " + k);
	}
}
