package aug1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLogin {
	
	//This is the Test Case of Gmail Login user
	@Test
	public static void test() throws Exception{

		String sKeypath="webdriver.chrome.driver";
		String chromeDriverpath="D:\\Learning\\Drivers\\Chrome\\chromedriver.exe";
		
		System.setProperty(sKeypath, chromeDriverpath);
		WebDriver driver=new ChromeDriver();
		
		//Initialization of ChromeDriver
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		System.out.println("Gmail website is Opened");
		driver.findElement(By.id("identifierId")).sendKeys("Seleniumlearning0806@gmail.com");
		System.out.println("email id is entered in text-box");
		
		driver.findElement(By.xpath("*//span[text()='Next']")).click();
		System.out.println("Next button is clicked");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("SeleniumTest");
		System.out.println("password is entered in text-box");
		driver.findElement(By.xpath("*//span[text()='Next']")).click();
		System.out.println("next button is clicked");
		Thread.sleep(10000);
		driver.quit();
	
	}
}
