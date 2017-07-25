/*
* Objetivo: Estudo do Selenium com Java
* Estudante: Mayanna Oliveira
* Email: mayannaoliveira@ymail.com
* Skype: mayannaoliveira
*/

// Bibliotecas
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.apache.log4j.*;

public class CapturarLogger {

	public static void main(String[] args) {

		Logger registro = Logger.getLogger("Teste");
		PropertyConfigurator.configure("log4j.properties");

		// Gecko Driver
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mayanna Oliveira\\Desktop\\Eclipse\\Git\\SeleniumFirefox\\geckodriver32.exe");
		
		// Webdriver
		WebDriver driver = new FirefoxDriver();
		// Captura logger
		registro.info("Firefox aberto");
		// Site a ser executado
		driver.get("https://wikipedia.org/");
		// Captura logger
		registro.info("Site executado");

		driver.findElement(By.id("js-link-box-pl")).click();
		registro.info("Clicar no link");

	}
}