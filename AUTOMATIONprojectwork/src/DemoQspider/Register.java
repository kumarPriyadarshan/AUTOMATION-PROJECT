package DemoQspider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//REGISTER
	driver.get("https://demoapps.qspiders.com/?scenario=1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
	driver.findElement(By.id("name")).sendKeys("PriyadarshanKumar");
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("Testing123@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Testing12345");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	
	//LOGIN
	
	driver.findElement(By.id("email")).sendKeys("Testing123@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Testing12345");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	
	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	//WebElement frme = driver.findElement(By.xpath("//section[@class='px-4']"));
	//driver.switchTo().frame(frme);
	
	// buttons
	
	driver.findElement(By.id("btn")).click();
	driver.findElement(By.id("btn3")).click();
	driver.findElement(By.id("btn8")).click();
	Thread.sleep(1000);
	
	//right click
	
	//driver.findElement(By.id("btn30")).click();
	driver.findElement(By.linkText("Right Click")).click();
	driver.findElement(By.id("btn30")).click();
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	Actions action = new Actions(driver);
	action.contextClick().perform();
	
	driver.findElement(By.id("btn31")).click();
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	Actions action1= new Actions(driver);
	action.contextClick().perform();
	
	}

}
