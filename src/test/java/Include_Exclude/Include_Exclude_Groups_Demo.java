package Include_Exclude;

import org.testng.annotations.Test;

public class Include_Exclude_Groups_Demo {

	@Test(groups = "Group_1")
	public void Test_1() {
		System.out.println("Inside Test_1 of Group_1");
	}

	@Test(groups = "Group_1")
	public void Test_2() {
		System.out.println("Inside Test_2 of Group_1");
	}

	@Test(groups = "Group_2")
	public void Test_3() {
		System.out.println("Inside Test_3 of Group_2");
	}

	@Test(groups = "Group_2")
	public void Test_4() {
		System.out.println("Inside Test_4 of Group_2");
	}
}
