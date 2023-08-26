package chapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysPractice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("//html")).sendKeys(Keys.F5);
//        driver.findElement(By.linkText("Forgotten password?")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        Thread.sleep(4000);
        driver.quit();
	}

}
