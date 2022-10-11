package week2.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Access Health Care");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sai");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesh");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sai");
		driver.findElement(By.name("departmentName")).sendKeys("Insurance");
		driver.findElement(By.name("description")).sendKeys("I am an AR Executive.My job role is to adjudicate claimed Insurance.");
		driver.findElement(By.name("primaryEmail")).sendKeys("Saiganeshsgcl@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName"));
		WebElement username=driver.findElement(By.id("createLeadForm_companyName"));
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		username.sendKeys("Access");
		WebElement fn=driver.findElement(By.id("createLeadForm_firstName"));
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		fn.sendKeys("Sai Ganesh");
		WebElement sn=driver.findElement(By.id("createLeadForm_lastName"));
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		sn.sendKeys(".s");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
