package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefreshFetchTitleUrl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("window.location=arguments[0]","https://www.ebay.com/");
        System.out.println(js.executeScript("return document.title"));
        System.out.println(js.executeScript("return document.URL"));
        
        Thread.sleep(2000);
        js.executeScript("history.go(0)");
        Thread.sleep(2000);
        driver.quit();
	}
}