package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\admin\\Desktop\\name.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement textField = driver.findElement(By.id("abc"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value=arguments[1]", textField, "selenium");
        
        Thread.sleep(5000);
        driver.quit();
	}

}
