package alertpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobotClass {
	
    public static void main(String[] args) throws AWTException, InterruptedException {
    	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        
        //Select the file path
        StringSelection str = new StringSelection("C:\\Users\\admin\\Downloads\\BHANU1. Resume.docx");
        
        //Set the file path to System Clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        
        //Paste the path to File upload pop up
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        
        //Click on Enter
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(5000);
        driver.quit();       
	}
}