package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseTest {
	 public WebDriver driver;
	 @BeforeMethod
	 public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://example.com");
	    }
	 @afterMethod
	 public void tearDown() {
	        driver.quit();
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
