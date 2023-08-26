package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInkText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgotten password?")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create a Page")).click();
        Thread.sleep(2000);
        driver.close();
	}

}
