package chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        Thread.sleep(2000);
        for(WebElement link: links)
        {
        	System.out.println(link.getText());
        }
        Thread.sleep(2000);
        driver.close();
	}
}