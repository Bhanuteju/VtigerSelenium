package alertpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(2000);
        al.sendKeys("Hello Mawa");
        Thread.sleep(2000);
        al.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        Thread.sleep(2000);
        driver.quit();
	}

}
