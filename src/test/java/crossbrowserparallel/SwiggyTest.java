package crossbrowserparallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwiggyTest extends BaseClass
{
	@Test
	public void swiggyTest()
	{
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement googleImage = driver.findElement(By.xpath("//*[name()='svg']"));
		if(googleImage.isDisplayed())
			System.out.println("Swiggy Page Displayed");
		else
			System.out.println("Swiggy Page Not Found");
	}
}
