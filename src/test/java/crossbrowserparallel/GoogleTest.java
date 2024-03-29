package crossbrowserparallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends BaseClass
{
	@Test
	public void googleTest()
	{
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement googleImage = driver.findElement(By.xpath("//img[@alt='Google']"));
		if(googleImage.isDisplayed())
			System.out.println("Google Page Displayed");
		else
			System.out.println("Google Page Not Found");
	}
}