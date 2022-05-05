package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import dev.failsafe.internal.util.Assert;
import pages.LoginPages;
import pages.PagesLoginSucces;

public class TestLogin {
	
	//variables
	WebDriver driver;
	String PATH_DRIVER ="./src/test/resources/driver/chromedriver.exe";
	String TYPE_DRIVER = "webdriver.chrome.driver";//valida siempre  el tema de  minusculas
	String URL ="https://demo.guru99.com/test/newtours/";
	LoginPages loginPages;
	PagesLoginSucces pagesLoginSucces;
	@Before
	public void  setUp()
	{
		System.setProperty(TYPE_DRIVER, PATH_DRIVER);
		driver =  new ChromeDriver();
		driver.get(URL);
		loginPages =  new LoginPages(driver);
	}
	
	@Test
	
	public void testLoginExitoso()
	{
		loginPages.iniciarSesion("123","123");
		//verificacion de pagina
		pagesLoginSucces = new PagesLoginSucces(driver);
		assertEquals("Login Successfully",pagesLoginSucces.GetMensajeExito());
		
	}
	@Test
	public void testLoginFallido()
	{
		loginPages.iniciarSesion("1230","123");
		//verificacion de pagina
		loginPages = new LoginPages(driver);
		assertEquals("Enter your userName and password correct",loginPages.GetensajeError());
		
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
			

}
