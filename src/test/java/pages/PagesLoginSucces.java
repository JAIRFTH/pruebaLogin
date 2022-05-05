package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagesLoginSucces {

	private By txtMensaje = By.xpath("//h3");
	private WebDriver driver;
	
	
	public  PagesLoginSucces (WebDriver driver ) {
		this.driver = driver;
	}
		
public String  GetMensajeExito() {
		
		return driver.findElement(txtMensaje).getText();
		
	}
	
}
