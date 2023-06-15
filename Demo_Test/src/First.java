import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/dracs02/:root/Coding/ST/chromedriver_mac_arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("BMS College of Engineering");
		driver.findElement(By.name("btnK")).click();
	}

}
