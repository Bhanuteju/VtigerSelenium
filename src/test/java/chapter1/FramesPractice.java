package chapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
        Actions a = new Actions(driver);
        a.moveToElement(signIn).perform();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='login']")).click();
        
        driver.switchTo().frame("loginIframe");
        
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("3448503728");
        driver.findElement(By.id("close-pop")).click();
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.name("keyword")).sendKeys("soft toys");
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        
        driver.quit();
	}
}