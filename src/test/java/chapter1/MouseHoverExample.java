package chapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement kids = driver.findElement(By.xpath("//a[text()='Kids' and @class='desktop-main']"));
        
        Actions a = new Actions(driver);
        a.moveToElement(kids).perform();
        
        driver.findElement(By.xpath("//a[text()='Learning & Development']")).click();
        
        String pageTitle = driver.findElement(By.xpath("//div[@class='filter-summary-filter']")).getText();
      	Thread.sleep(2000);
       	if(pageTitle.equals("Learning And Development Toys"))
       		System.out.println("pass");
       	else
       		System.out.println("fail");
       	
       	driver.quit();
	}
}