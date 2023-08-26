package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.foundit.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//div[normalize-space(text())='Upload Resume']")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\admin\\Downloads\\BHANU. Resume.docx");
        
        Thread.sleep(5000);
        driver.quit();
	}
}