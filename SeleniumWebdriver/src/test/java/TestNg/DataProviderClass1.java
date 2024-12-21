package TestNg;

import org.testng.annotations.DataProvider;

public class DataProviderClass1 {
	
	@DataProvider(name="getTestData")
	public String[][] LoginData()
	{
		String[][] data = 
			{ 
				{"standard_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
			};
		return data;

	}


}
