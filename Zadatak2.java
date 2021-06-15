package D_04_06_2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
//		Napisati program koji:
//			Ucitava stanicu https://www.wikipedia.org/
//			Sa stranice sakuplja sve linkove (jezike) i svaki link otvara u novom prozoru pretrazivaca
//			Svaki link potrebno je otvoriti u novom tabu.
//			Skripta: window.open(arguments[0]);
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> allLinks = driver.findElements(By.className("central-featured"));
		
		
		allLinks.add(driver.findElement(By.id("js-link-box-en")));
		allLinks.add(driver.findElement(By.id("js-link-box-ja")));
		allLinks.add(driver.findElement(By.id("js-link-box-es")));
		allLinks.add(driver.findElement(By.id("js-link-box-fr")));
		allLinks.add(driver.findElement(By.id("js-link-box-de")));
		allLinks.add(driver.findElement(By.id("js-link-box-it")));
		allLinks.add(driver.findElement(By.id("js-link-box-ru")));
		allLinks.add(driver.findElement(By.id("js-link-box-zh")));
		allLinks.add(driver.findElement(By.id("js-link-box-pt")));

		for (int i = 0; i < allLinks.size(); i++) {
			js.executeScript("window.open(arguments[0]);", allLinks.get(i));
		}
			
		
	}

}
