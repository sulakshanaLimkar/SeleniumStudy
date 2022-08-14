package setSizeSetPosition;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getSize());
		
		//to set size we need to create  object of dimentions class and pass width and height as parameters
		
       org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(800, 800);
		
		//call setSize method which will ask you object of dimention class
          
		driver.manage().window().setSize(d);
		
		
		
		
	}}
