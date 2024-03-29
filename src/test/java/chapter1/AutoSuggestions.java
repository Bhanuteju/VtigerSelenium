package chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        
        driver.findElement(By.name("q")).sendKeys("dress");
        
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct' and @jsaction]"));  
        
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getText());
        }
        
//        for(WebElement element: list) {
//        	System.out.println(element.getText());
//        }
        
        driver.quit();
	}
}