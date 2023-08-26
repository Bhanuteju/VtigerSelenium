package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=5)
	 public void demo1()
	   {
		   Reporter.log("test1", true);
	   }
	 public void demo2()
	   {
		   Reporter.log("test2", true);
	   }
	 @Test(invocationCount=0)
	 public void demo3()
	   {
		   Reporter.log("test3", true);
	   }

}
