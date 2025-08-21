package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	By userNameInput = By.xpath("//input[@name='username']");
	By userPassInput = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//input[@type='submit' and @value='Log In']");

    // Optional error message locator
    By errorMessage = By.cssSelector(".error");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String userName , String password) {
		driver.findElement(userNameInput).sendKeys(userName);
		driver.findElement(userPassInput).sendKeys(password);
		driver.findElement(loginButton).click();

	}
	
    public String getErrorMessage() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).getText();
    
    }
    
	
	
	
}
