package shopperstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSHOPPERSTACK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		// SHOPPER LOGIN
		
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("shopperstack258@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		//Search the products
		
		driver.findElement(By.id("search")).sendKeys("men");
		Thread.sleep(3000);
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.id("category")).click();
		driver.findElement(By.id("men")).click();
		driver.findElement(By.id("searchBtn")).click();
		//driver.findElement(By.xpath("(//button[@tabindex='0'])[1]")).click();
		
		//Add to Cart
		
		driver.findElement(By.xpath("//span[(text()='Men Woven Design Silk Blend Straigh...')]")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("Add To Cart")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("cartIcon")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("38545")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		 Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//span[(text()='Cash On Delivery (COD)')]")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		 Thread.sleep(1000);
		System.out.println("Men collection open succesfully");
		System.out.println("Orde Placed succesfully");
		Thread.sleep(1000);
		
		driver.quit();
		
		
		

	}

}
 