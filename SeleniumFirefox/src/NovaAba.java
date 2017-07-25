/*
* Objetivo: C�digo de Estudo Selenium Java
* Estudante: Mayanna Oliveira
* Email: mayannaoliveira@ymail.com
* Skype: mayannaoliveira
*/

// Bibliotecas
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class NovaAba {

	public static void main(String[] args) {

		// Gecko Driver
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mayanna Oliveira\\Desktop\\Eclipse\\Git\\SeleniumFirefox\\geckodriver32.exe");

		// Webdriver
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		// T�tulo da p�gina
		System.out.println(driver.getTitle());

		// Gmail abre em uma nova aba
		String abrirnovaaba = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Gmail")).sendKeys(abrirnovaaba);
	}
}
