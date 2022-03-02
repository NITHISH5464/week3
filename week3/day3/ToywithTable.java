package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToywithTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	  List<WebElement> input1 = driver.findElements(By.tagName("th"));
		int size = input1.size();
		System.out.println("tablecoloum; "+size);
		
		List<WebElement> input2 = driver.findElements(By.tagName("tr"));
	int size2 = input2.size();
	System.out.println("tablerows: "+size2);
	
//	driver.findElement(By.xpath("(//table[@id='table_id']//td)[7]//following-sibling::td"))
	String text = driver.findElement(By.xpath("//td[text()='80%']")).getText();
	
	System.out.println("Learn to interact with Elements: "+text);

	List<Integer> input=new ArrayList<Integer>();
	for (int i = 2; i <=size2; i++) {
	String text2 = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]//td[2]")).getText();
	//System.out.println(text2);
	String replaceAll = text2.replaceAll("%", "");
	int parseInt = Integer.parseInt(replaceAll);
	System.out.println(parseInt);
	
	input.add(parseInt);
	
}
	System.out.println(input);
	
	Integer min = Collections.min(input);
	System.out.println(min);
	
	}
	}
    
