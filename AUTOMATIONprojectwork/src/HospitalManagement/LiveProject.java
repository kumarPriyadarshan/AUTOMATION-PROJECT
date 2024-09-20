package HospitalManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LiveProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//DOCTOR MODULE
		
		//REGISTER
	driver.get("http://106.51.79.67:9007/");
	Thread.sleep(1000);
	
	driver.findElement(By.id("email")).sendKeys("oardoctor@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("123456");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Appointment']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Appointment List']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(), 'Add Appointment')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='date here']")).click();
	
	Actions ac = new Actions(driver);
	
//	for(;;) {
//		try {
//	
//	        driver.findElement(By.xpath("(//th[contains(text(), '»')])[1]")).click();
//	        break;
//			
//		}
//		catch(Exception e) {
//			Thread.sleep(5);
//			WebElement link = driver.findElement(By.xpath("//td[contains(text(), '08 Feb')]"));
//			
//            ac.doubleClick(link).perform();
//		}
//	}
	
	driver.findElement(By.xpath("(//button[contains(text(),'×')])[1]")).click();
    driver.findElement(By.xpath("//span[text()='Requested Appointments']")).click();
	Thread.sleep(2000);
	
	// Approve
	
    // driver.findElement(By.partialLinkText("Approve")).click();
    //driver.findElement(By.xpath("//span[text()='Ankit_oar1']")).click();
   // Thread.sleep(1000);
    //driver.findElement(By.xpath("//input[@value='Approve']")).click();
    
    // Prescription
    
    driver.findElement(By.xpath("//span[contains(text(), 'Prescription')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(), 'Add Prescription')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='date here']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='time here']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	Thread.sleep(2000);
	
	//Add Patient
	
	driver.findElement(By.xpath("//span[contains(text(), 'Patient')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(), 'Add Patient')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("name")).sendKeys("Rahul Kumar");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("rahul@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("123456");
	Thread.sleep(1000);
	driver.findElement(By.name("address")).sendKeys("Bangalore");
	Thread.sleep(1000);
	driver.findElement(By.name("phone")).sendKeys("771321290");
	Thread.sleep(1000);
	driver.findElement(By.name("sex")).sendKeys("Select Sex");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//option[@value='male']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//option[@value='female']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.name("birth_date")).sendKeys("25/05/2002");
	Thread.sleep(1000);
	driver.findElement(By.name("age")).sendKeys("22");
	Thread.sleep(1000);
	driver.findElement(By.name("blood_group")).sendKeys("Select Blood Group");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//option[@value='A+']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='A-']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='B+']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='B-']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='AB+']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='AB-']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='O+']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='O-']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='B+']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	Thread.sleep(2000);
	
	

	}

}
