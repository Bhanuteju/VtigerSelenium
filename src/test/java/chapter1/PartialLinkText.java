package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Return")).click();
        Thread.sleep(2000);
        driver.close();
	}
}