package week2.day1.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'crmsfa')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/accountsMain')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/findAccounts')]")).click();
		driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field']")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
		
		
		
	}
	

}
