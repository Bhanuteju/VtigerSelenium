package chapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
        if(loginButton.isEnabled())
        	System.out.println("Enabled");
        else
        	System.out.println("Disabled");
        
        driver.findElement(By.name("username")).sendKeys("kajal_cult");
        driver.findElement(By.name("password")).sendKeys("bhanu994850");
        
        if(loginButton.isEnabled()) {
        	System.out.println("Enabled");
        	loginButton.click();
        }
        else
        	System.out.println("Disabled");
        
        driver.quit();
	}
}