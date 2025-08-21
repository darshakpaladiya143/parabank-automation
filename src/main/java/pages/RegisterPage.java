package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
    WebDriver driver;
    
    By registerLink = By.linkText("Register");
    By firstName = By.xpath("//input[@id='customer.firstName']");
    By lastName = By.xpath("//input[@id='customer.lastName']");
    By address = By.xpath("//input[@id='customer.address.street']");
    By city = By.xpath("//input[@id='customer.address.city']");
    By state = By.xpath("//input[@id='customer.address.state']");
    By zipcode = By.xpath("//input[@id='customer.address.zipCode']");
    By phone = By.xpath("//input[@id='customer.phoneNumber']");
    By ssn = By.xpath("//input[@id='customer.ssn']");
    
    By userName = By.xpath("//input[@id='customer.username']");
    By password = By.xpath("//input[@id='customer.password']");
    By confirmPassword = By.xpath("//input[@id='repeatedPassword']");
    By registerButton = By.xpath("//input[@value='Register']");
    
    
    
    
	public RegisterPage(WebDriver driver) {
		this.driver =  driver;
	}
	
    public void openRegisterPage() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink));
        driver.findElement(registerLink).click();
    }
	
    public void customerInfoandRegister(String firstNameVal , String lastNameVal , String addressVal , String cityValue ,
    		                           String stateVal , String zipCodeVal , String phoneVal , String ssnVal , String 
    		                           userNameVal , String passwordVal , String confirmPassVal) 
    
    {
    	
        driver.findElement(firstName).sendKeys(firstNameVal);
        driver.findElement(lastName).sendKeys(lastNameVal);
        driver.findElement(address).sendKeys(addressVal);
        driver.findElement(city).sendKeys(cityValue);
        driver.findElement(state).sendKeys(stateVal);
        driver.findElement(zipcode).sendKeys(zipCodeVal);
        driver.findElement(phone).sendKeys(phoneVal);
        driver.findElement(ssn).sendKeys(ssnVal);    	
        
        driver.findElement(userName).sendKeys(userNameVal);
        System.out.println("Register userName is " + userNameVal);
    	driver.findElement(password).sendKeys(passwordVal);
    	driver.findElement(confirmPassword).sendKeys(confirmPassVal);
    	driver.findElement(registerButton).click();
    	
    	
    }
    
    public String getWelcomeMessage() {
        return driver.findElement(By.xpath("//h1[@class='title']")).getText();
    }


}

