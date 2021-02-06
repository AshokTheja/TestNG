package Groups;

import org.testng.annotations.Test;

public class Groups_Demo_Class_2 {

	@Test(groups = "Group_3")
	public void Test_1() {
		System.out.println("Inside Test_1 of Group_3");
	}

	@Test(groups = "Group_3")
	public void Test_2() {
		System.out.println("Inside Test_2 of Group_3");
	}

	@Test(groups = "Group_4")
	public void Test_3() {
		System.out.println("Inside Test_3 of Group_4");
	}

	@Test(groups = "Group_4")
	public void Test_4() {
		System.out.println("Inside Test_4 of Group_4");
	}
}
