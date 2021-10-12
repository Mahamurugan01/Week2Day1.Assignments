package week2.day1.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount_assign1 {

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
		driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/createAccountForm')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account_91");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("madipakkam");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("madipakkam south");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("150000");
		WebElement eleindus = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dropdown = new Select(eleindus);
		dropdown.selectByVisibleText("Computer Software");
		WebElement eleowner = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dropdown1 = new Select(eleowner);
		dropdown1.selectByVisibleText("S-Corporation");
		WebElement elesource = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select dropdown2 = new Select(elesource);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		WebElement elecompaign = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select dropdown3 = new Select(elecompaign);
		dropdown3.selectByIndex(1);
		WebElement elestatepro = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select dropdown4 = new Select(elestatepro);
		dropdown4.selectByValue("TX");
		driver.findElement(By.xpath("//input[contains(@onclick,'submitFormWithSingleClick(this)')]")).click();
		String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_accounts']")).getText();
		System.out.println(text);
		
	}
	

}
