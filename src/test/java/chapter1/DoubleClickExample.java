package chapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapp.skillrary.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement courseTab = driver.findElement(By.id("course"));
        
        Actions a = new Actions(driver);
        a.moveToElement(courseTab).perform();
        
        driver.findElement(By.xpath("//span/a[text()='Selenium Training']")).click();
        
        WebElement quantity = driver.findElement(By.id("quantity"));
        System.out.println("Intial Value: "+quantity.getAttribute("value"));
        
        a.doubleClick(driver.findElement(By.id("add"))).perform();
        System.out.println("Final Value: "+quantity.getAttribute("value"));
        
        driver.quit();
	}
}