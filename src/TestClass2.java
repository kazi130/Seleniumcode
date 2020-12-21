import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
	  Thread.sleep(3000);
		driver.get("https://accounts.google.com");
	
	
	  driver.findElement(By.id("identifierId")).sendKeys("kazijewel7@gmail.com");	
      Thread.sleep(3000);
      driver.close();
}

}


