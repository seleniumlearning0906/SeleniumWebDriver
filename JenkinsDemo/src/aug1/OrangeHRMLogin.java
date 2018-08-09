package aug1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMLogin {
	
	@Test
	public static void test() throws Exception{
		System.out.println("Hello World");
		System.out.println("This is Jenkins Demo");
		System.out.println("Hiii Hello");
		System.out.println("Hiii Hello India");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumlearns-trials641.orangehrmlive.com");
		System.out.println("OrangeHRM website is launched");
		driver.manage().window().maximize();
		System.out.println("OrangeHRM Browser is maximized");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("UserName is entered");
		driver.findElement(By.id("txtPassword")).sendKeys("SeleniumTest");
		System.out.println("Password is entered");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login button is clicked");
		
		driver.findElement(By.xpath("*//span[text()='PIM']")).click();
		System.out.println("PIM Menu is clicked");
		
		driver.findElement(By.xpath("*//span[text()='Add Employee']")).click();
		System.out.println("Add Employee link is clicked");
		
		Thread.sleep(20000);
		
		driver.findElement(By.id("firstName")).sendKeys("Sagar");
		System.out.println("First Name is entered");
		
		driver.findElement(By.id("photo-preview-lable")).click();
		System.out.println("Image is clicked");
		
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec("D:\\Learning\\AutoIT Files\\FileUploadDemo.exe");
		
		driver.quit();
	}
	
}
