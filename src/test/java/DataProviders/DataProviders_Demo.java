package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_Demo {

	@DataProvider(name = "reqData")
	public Object[][] i_provide_Data() {

		Object[][] data = new Object[2][3];

		data[0][0] = "TestUser";
		data[0][1] = "TestUserName";
		data[0][2] = "TestUserPwd";
		data[1][0] = "AdminUser";
		data[1][1] = "AdminUserName";
		data[1][2] = "AdminUserPwd";

		return data;
	}

	@Test(dataProvider = "reqData")
	public void Print_Data(String userType, String username, String password) {

		System.out.println(userType);
		System.out.println(username);
		System.out.println(password);
	}

}
