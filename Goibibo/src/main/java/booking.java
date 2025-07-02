import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class booking {
	WebDriver driver;
	public void launchAUT(){
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

	public static void main(String[] args) {
		booking obj=new booking();
		obj.launchAUT();

	}

}
