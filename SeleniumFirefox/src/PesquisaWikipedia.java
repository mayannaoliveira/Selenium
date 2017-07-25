/*
* Objetivo: Código de Estudo Selenium Java
* Estudante: Mayanna Oliveira
* Email: mayannaoliveira@ymail.com
* Skype: mayannaoliveira
*/

// Bibliotecas
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class PesquisaWikipedia {

	public static void main(String[] args) {

		// Gecko Driver
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mayanna Oliveira\\Desktop\\Eclipse\\Git\\SeleniumFirefox\\geckodriver32.exe");

		// Webdriver
		WebDriver driver = new FirefoxDriver();
		driver.get("https://pt.wikipedia.org/");

		// Faz pesquisa usando o busca do wikipedia
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("ooui-1")).sendKeys("teste de software");
		driver.findElement(By.id("ooui-1")).sendKeys(Keys.RETURN);

	}

}
