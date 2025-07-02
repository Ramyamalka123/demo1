import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Booking.Goibibo;

public class flight_booking {
	WebDriver driver;
	Actions  act;
     public void LaunchAUT() throws InterruptedException {
			driver=new ChromeDriver();
			act=new Actions(driver);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("APjFqb")).sendKeys("https://www.goibibo.com/");
			act.sendKeys(Keys.ENTER).perform();
			
			//driver.findElement(By.xpath("//span[text()='Flights']")).click();
			driver.findElement(By.xpath("//h3[text()='Goibibo - Best Travel Website. Book Hotels, Flights, Trains ...']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[2]/div[1]/div/div")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hyderabad");
			Thread.sleep(2000);
			//act.sendKeys(Keys.ARROW_DOWN.ENTER).perform();
			//driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div/div[1]/div/p[2]")).click();
			driver.findElement(By.xpath("//p[text()='Rajiv Gandhi International Airport']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("canada");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[text()='Pearson Intl-ON']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Departure']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-label='Thu Jul 18 2024']")).click();
			//driver.findElement(By.xpath("//p[text()='73,755']")).click();
			Thread.sleep(2000);
		}
		//public void get() {
			//driver.findElement(By.xpath("//span[text()='Book Flights and Hotels - Book Flights Hotels on GoIbibo']")).click();
			
		//}
		public static void main(String[] args) throws InterruptedException {
			Goibibo obj=new Goibibo();
			obj.LaunchAUT();
		//Thread.sleep(2000);
			//obj.get();
		}
		}


