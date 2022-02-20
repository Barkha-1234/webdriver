package Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.simplilearn.com/");
driver.manage().window().maximize();
WebElement LoginLink=driver.findElement(By.linkText("Log in"));
LoginLink.click();
WebElement userName=driver.findElement(By.name("user_login"));
WebElement Password=driver.findElement(By.id("password"));

WebElement LoginBtn=driver.findElement(By.name("btn_login"));
WebElement RemBtn=driver.findElement(By.className("rememberMe"));
userName.sendKeys("abc@gmail.com");
Password.sendKeys("Test@12123");
RemBtn.click();
LoginBtn.click();

//WebElement Errormsg = driver.findElement(By.className("error_msg"));


WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 

String ActualMsg = ErrorMsg.getText();
String ExpMsg = "The email or password you have entered is invalid.";

if(ActualMsg.equals(ExpMsg)) {
	System.out.println("TC Passed");
}else {
	System.out.println("TC Failed");
}

List<WebElement> links= driver.findElements(By.tagName("a"));
System.out.println("Total links are" +links.size());


for(WebElement elm : links)
{
	
	System.out.println(elm.getAttribute("href"));
}


//driver.close();


	}

}
