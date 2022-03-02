package week3.day4;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mic1 = driver.findElement(By.xpath("//li[text()='Item 2']"));

		WebElement mic2 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		Actions buil=new Actions(driver);
//1.continue drag
//buil.clickAndHold(mic1).moveToElement(mic2).release().perform();
//2.one by one	

		buil.keyDown(Keys.CONTROL).click(mic1).click(mic2).release().perform();
}

}
