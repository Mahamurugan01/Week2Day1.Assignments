package week2.day1.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahalakshmi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balamurugan");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Geetha");
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
driver.findElement(By.className("smallSubmit")).click();
//driver.findElement(By.id("")).sendKeys("");
//driver.findElement(By.id("")).sendKeys("");
String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
System.out.println(text);
String text2 = driver.findElement(By.id("createLeadForm_firstName")).getText();
System.out.println(text2);
	}

}
