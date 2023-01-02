package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get(" https://login.salesforce.com/");
		 driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		 driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		 driver.findElement(By.id("Login")).click();
		 System.out.println(driver.getTitle());

	}

}
