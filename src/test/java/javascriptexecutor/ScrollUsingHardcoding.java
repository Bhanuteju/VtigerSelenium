package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingHardcoding {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-3000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(2000,3000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(2000,-3000)");
        
        Thread.sleep(2000);
        driver.quit();
	}
}