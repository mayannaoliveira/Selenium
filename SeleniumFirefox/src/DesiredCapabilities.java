/*
* Objetivo: Estudo do Selenium com Java
* Estudante: Mayanna Oliveira
* Email: mayannaoliveira@ymail.com
* Skype: mayannaoliveira
*/

// Bibliotecas
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		// Gecko Driver
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mayanna Oliveira\\Desktop\\Eclipse\\Git\\SeleniumFirefox\\geckodriver32.exe");

		// Desired Capabilities
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("Testando", true);

		try {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://yahoo.com.br/");
			Thread.sleep(2000);
			System.out.println("Teste realizado!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Sistema com falha!");
		}
	}
}