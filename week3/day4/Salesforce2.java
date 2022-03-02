package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions mic1=new ChromeOptions();
	mic1.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://qeagle-dev-ed.my.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Password@123");
	driver.findElement(By.name("Login")).click();
	
}
}
