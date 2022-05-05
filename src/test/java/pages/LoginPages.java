package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPages {

	//Variables 
	private By txtUser = By.name("userName");
	private By txtPassword =  By.name("password");
	private By btnSubmit = By.name("submit");
	private By txtMensajeError = By.xpath("//span");
	private WebDriver driver ;
	
	public LoginPages(WebDriver driver) {
		this.driver = driver;
			
	}
	
	public void iniciarSesion(String user , String pass) {
		driver.findElement(txtUser).sendKeys(user);;
		driver.findElement(txtPassword).sendKeys(pass);
		driver.findElement(btnSubmit).click();
		
	}
	
	public String  GetensajeError() {
		
		return driver.findElement(txtMensajeError).getText();
		
	}
}
