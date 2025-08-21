package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=47D918E875B8F4498E5339B5B18C61D5");
		
	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}
