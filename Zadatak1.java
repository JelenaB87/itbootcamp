package D_04_06_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
//		Napisati program koji:
//			Ucitava stranicu https://www.google.com/
//			Hvata body element sa stranicu i njemu setuje atribut 
//			style na vrednost “background: nekaBoja”
//			Skripta: arguments[0].style=”background: black”;
//			(Za vezbanje) Setuje prosledjenu boju:
//			Skripta: arguments[0].style=”background:” + arguments[1];
//			Boje za testiranje - red, green, blue, …

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement body = driver.findElement(By.xpath("/html/body"));
		
		
		js.executeScript("arguments[0].style.backgroundColor='black';", body);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].style.backgroundColor=arguments[1];", body, "red");
		Thread.sleep(2000);

		js.executeScript("arguments[0].style.backgroundColor=arguments[1];", body, "green");
		Thread.sleep(2000);

		js.executeScript("arguments[0].style.backgroundColor=arguments[1];", body, "blue");
		
		// A sad krece zurkicaaaaaa za moju dusu  :D ili napad epilepsije :P 

		for (int i = 0; i < 20; i++) {
			js.executeScript("arguments[0].style.backgroundColor='black';", body);
			Thread.sleep(100);
			
			js.executeScript("arguments[0].style.backgroundColor=arguments[1];", body, "red");
			Thread.sleep(100);

			js.executeScript("arguments[0].style.backgroundColor=arguments[1];", body, "green");
			Thread.sleep(100);

			js.executeScript("arguments[0].style.backgroundColor=arguments[1];", body, "blue");
		}

	}

}
