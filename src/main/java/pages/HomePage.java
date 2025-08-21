package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
    // Locators for account services links
    By openNewAccountLink = By.linkText("Open New Account");
    By accountOverviewLink = By.linkText("Accounts Overview");
    By transferFundsLink = By.linkText("Transfer Funds");
    By billPayLink = By.linkText("Bill Pay");
    By findTransactionsLink = By.linkText("Find Transactions");
    By updateContactInfoLink = By.linkText("Update Contact Info");
    By requestLoanLink = By.linkText("Request Loan");
    By logoutLink = By.linkText("Log Out");

	
    // Constructor
    
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
    // Methods to navigate to each section
	
    public void clickOpenNewAccount() {
        driver.findElement(openNewAccountLink).click();
    }

    public void clickAccountOverview() {
        driver.findElement(accountOverviewLink).click();
    }

    public void clickTransferFunds() {
        driver.findElement(transferFundsLink).click();
    }

    public void clickBillPay() {
        driver.findElement(billPayLink).click();
    }

    public void clickFindTransactions() {
        driver.findElement(findTransactionsLink).click();
    }

    public void clickUpdateContactInfo() {
        driver.findElement(updateContactInfoLink).click();
    }

    public void clickRequestLoan() {
        driver.findElement(requestLoanLink).click();
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
	

}
