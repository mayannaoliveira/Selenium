/*
* Objetivo: Estudo Selenium Java
* Estudante: Mayanna Oliveira
* Email: mayannaoliveira@ymail.com
* Skype: mayannaoliveira
*/
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;

public class AbrirChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayanna Oliveira\\Desktop\\Eclipse\\Workspace\\SeleniumChrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		//driver.findElement(By.id("search")).click();
		driver.findElement(By.id("masthead-search-term")).sendKeys("Automação de Teste");
		driver.findElement(By.id("masthead-search-term")).sendKeys(Keys.RETURN);
	}
}
