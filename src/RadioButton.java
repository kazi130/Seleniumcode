import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");	
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'])[1]")).click();
        Thread.sleep(2000);
         driver.findElement(By.id("item-2")).click();
         Thread.sleep(2000);
     //    driver.findElement(By.id("yesRadio")).click();
         
         JavascriptExecutor jse = (JavascriptExecutor)driver;
      	jse.executeScript("document.getElementById('yesRadio').click();");
      	 Thread.sleep(2000);
      	 
     	driver.findElement(By.id("oimpressiveRadi")).click();
      	 JavascriptExecutor jse = (JavascriptExecutor)driver;
       	jse.executeScript("document.getElementById('oimpressiveRadi').click();");
         

	}

}
