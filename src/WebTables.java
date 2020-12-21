import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");	
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'])[1]")).click();
        Thread.sleep(2000);
    //   driver.findElement(By.id("item-3")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
      	jse.executeScript("document.getElementById('item-3').click();");
      	Thread.sleep(2000);
      	driver.findElement(By.id("addNewRecordButton")).click();
      	Thread.sleep(2000);
      	driver.findElement(By.id("firstName")).sendKeys("Kazi");
      	Thread.sleep(2000);
      	driver.findElement(By.id("lastName")).sendKeys("Islam");
      	Thread.sleep(2000);
      	driver.findElement(By.id("userEmail")).sendKeys("kjewel74@yahoo.com");
      	Thread.sleep(2000);
      	driver.findElement(By.id("age")).sendKeys("42");
      	Thread.sleep(2000);
      	driver.findElement(By.id("salary")).sendKeys("95000");
      	Thread.sleep(2000);
      	driver.findElement(By.id("department")).sendKeys("DOB");
      	Thread.sleep(2000);
      	driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("edit-record-4")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("age")).sendKeys("40");
        Thread.sleep(2000);
    //    driver.findElement(By.xpath("//*[@id=\"delete-record-4\"]")).click();
      	
      	



	}

}
