package TestNg;

public class TestDependency {

	/*
	 If perticular test will fail then remaining test which is depend on this test will also fail
	 compiler will run all the test case and all the test cases are failed 
	 
	 eg - test1 - login to application
	 	  
	 	  @Run(dependsOnMethods="test1")
	 	  test2 - search the product
	 	  
	 	  @Run(dependsOnMethods={"test1","test2"})
	 	  test3 - add to cart
	 	  test4 - remove from cart
	 	  
	 	If login test will fail then there is no meaning to run other test case
	 	
	 	Note - 
	 	if we want to run other test case which is depend on the main test
	 	then we can use alwaysRun=true attruibute
	 	
	 	eg - @Run(dependsOnMethods="test1",alwaysRun=true)
	 	
	 	NOte - We can use dependsOnGroups={"smoke","sanity"}
	 	
	 	
	 */
}
