/*
* Objetivo: Código de Estudo Selenium Java
* Estudante: Mayanna Oliveira
* Email: mayannaoliveira@ymail.com
* Skype: mayannaoliveira
*/

// Bibliotecas
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class UrlCodigoFonte {

	public static void main(String[] args) {

		// Gecko Driver
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mayanna Oliveira\\Desktop\\Eclipse\\Git\\SeleniumFirefox\\geckodriver32.exe");

		// Webdriver
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
        System.out.println(driver.getTitle());
        
        // Captura código fonte da página 
        String codigofonte = driver.getPageSource();
		System.out.println(codigofonte);
		
        // Captura URL da página
        String sURL = driver.getCurrentUrl();
        System.out.println(sURL);
        
  }

}
