package alertpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        
        String text = driver.findElement(By.xpath("//p[normalize-space(text())='Congratulations! You must have the proper credentials.']")).getText();
        System.out.println(text);
        
        driver.quit();
	}
}