package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FbSignup {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		 WebElement signup=driver.findElement(By.id("u_0_2_Ss"));
		 signup.click();
		 WebElement Fname=driver.findElement(By.name("firstname"));
		 WebElement Lname=driver.findElement(By.name("lastname"));
		 WebElement mail=driver.findElement(By.name("reg_email__"));
		 WebElement Pass=driver.findElement(By.name("reg_passwd__"));
				
		
		 Fname.sendKeys("Barkha");
		 Lname.sendKeys("Jain");
		 mail.sendKeys("jainbarkha1993@gmail.com");
		 Pass.sendKeys("Test@12345");
		 
		 
		 
	}

}
