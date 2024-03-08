package Selenium_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Imp\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//object creation launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//img[@loading='eager'])[1]")).click();
		
		Set<String> ids= driver.getWindowHandles();
		List<String> ids1 = new ArrayList<String>(ids);
		System.out.println(ids1);
		Thread.sleep(3000);
		
		driver.switchTo().window(ids1.get(1));
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dhomnerohit123@gmail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7722050904");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
