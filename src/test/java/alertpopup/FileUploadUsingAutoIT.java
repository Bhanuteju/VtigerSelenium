package alertpopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIT {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        Thread.sleep(5000);
        
        Runtime.getRuntime().exec("\"C:\\Users\\admin\\Desktop\\AutoIT\\bhanu.exe\"");
        Thread.sleep(5000);
        driver.quit();
	}

}
