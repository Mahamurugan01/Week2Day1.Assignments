package week2.day1.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateleadusingXpath {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps");
WebElement eleusernam = driver.findElement(By.xpath("//input[@id='username']"));
		eleusernam.sendKeys("Demosalesmanager");
				
driver.findElement(By.id("password")).sendKeys("crmsfa");
WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));

driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
		//"decorativeSubmit")).click();

		
		
driver.findElement(By.xpath("//a[contains(@href,'crmsfa')]")).click();
driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/leadsMain')]")).click();
driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/createLeadForm')]")).click();
String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
System.out.println(text);
		
		
		
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("HCL");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mahalakshmi");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Balamurugan");
/*driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Geetha");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("B");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("TestLead");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
//driver.findElement(By.className("createLeadForm_birthDate")).sendKeys("10/1/21");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SCM");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("ISD101");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$123");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello Employee");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Please take care of your reports");
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9962995512");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Spouse-9962995512");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mahamurugan01@gmail.com");
WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dropDown = new Select(eleSource);
dropDown.selectByVisibleText("Direct Mail");
WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dropDown2 = new Select(eleIndustry);
dropDown2.selectByIndex(7);
WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select dropDown3 = new Select(eleOwnership);
dropDown3.selectByValue("OWN_PARTNERSHIP");
driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");


//driver.findElement(By.id("")).sendKeys("");
//driver.findElement(By.id("")).sendKeys("");*/
//driver.findElement(By.className("smallSubmit")).click();
//String text2 = driver.findElement(By.//(id='viewLead_firstName_sp']")).getText();
//System.out.println(text2);
	}

}
