package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions in=new ChromeOptions();
		in.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(in);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mic1 = driver.findElement(By.linkText("MEN"));
	
		 Actions input=new Actions(driver);
		 input.moveToElement(mic1).perform();
		 
		 driver.findElement(By.linkText("Play Time")).click();
		 
		 
		//driver.findElement(By.xpath(null))
		
	}

}
