import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");	
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'])[1]")).click();
        Thread.sleep(2000);
         driver.findElement(By.id("item-0")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("userName")).sendKeys("Kazi Islam");
         Thread.sleep(2000);
         driver.findElement(By.id("userEmail")).sendKeys("kjewel74@yahoo.com");
         Thread.sleep(2000);
         driver.findElement(By.id("currentAddress")).sendKeys("130 Oak");
         Thread.sleep(2000);
         driver.findElement(By.id("permanentAddress")).sendKeys("130 Oak");
         Thread.sleep(2000);
         //driver.findElement(By.id("submit")).click();
      //   Actions builder = new Actions(driver);
    // 	builder.moveToElement(driver.findElement(By.id("submit"))).build().perform();
    // 	driver.findElement(By.id("submit")).click();
     	JavascriptExecutor jse = (JavascriptExecutor)driver;
     	jse.executeScript("document.getElementById('submit').click();");


         
		
		
		
		
		Thread.sleep(2000);
	//	driver.close();

	}

}
