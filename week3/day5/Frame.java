package week3.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions in=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(in);
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/frame.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.switchTo().frame(0);
	    WebElement in1 = driver.findElement(By.id("Click"));
	    in1.click();
	    String mic1=in1.getText();
	    System.out.println(mic1);
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(1);
	    driver.switchTo().frame("frame2");
	    WebElement in2 = driver.findElement(By.id("Click1"));
	    in2.click();
	   String mic2=in2.getText();
	   System.out.println(mic2);
	   driver.switchTo().defaultContent();
	   
	   List<WebElement> size = driver.findElements(By.tagName("iframe"));
	size.size();
	
	System.out.println(size.size());
	
	File mic3=driver.getScreenshotAs(OutputType.FILE);
	File des=new File("./Selenium/SUNA PANA.png");
	FileUtils.copyFile(mic3, des);
	
	
	
	}
}
