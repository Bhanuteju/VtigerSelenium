package chapter1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapp.skillrary.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement dropdown = driver.findElement(By.id("cars"));
	    Select s = new Select(dropdown);
	       
	    if(s.isMultiple()) {
	    	s.selectByIndex(0);
	        s.selectByValue("299");
	        s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
	        
	        Thread.sleep(2000);
	        
	        System.out.println(s.getFirstSelectedOption().getText());
	        
	        List<WebElement> dropdowns = s.getAllSelectedOptions();
			for (WebElement d : dropdowns) {
			    System.out.println(d.getText());
			}
			
			s.deselectByIndex(0);
			s.deselectByValue("299");
			s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
	    }
	    else
	    	System.out.println("Single select");
	    
	    driver.quit();
	}
}