package assignmentweek2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suji");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Perumal");
			WebElement drop1=driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select drpDwn=new Select(drop1);
			drpDwn.selectByIndex(1);
			WebElement drop2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select drpDwn2=new Select(drop2);
			drpDwn2.selectByValue("CATRQ_CARNDRIVER");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hari");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Sekar");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("vairav");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/15/20");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SRVC");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
			WebElement drop3=driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select drpDwn3=new Select(drop3);
			drpDwn3.selectByIndex(1);
			WebElement drop4=driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select drpDwn4=new Select(drop4);
			drpDwn4.selectByValue("IND_HARDWARE");
			driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("3");
			WebElement drop5=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select drpDwn5=new Select(drop5);
			drpDwn5.selectByIndex(4);
			driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
			driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("234");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
			driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Test");
			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543");
			driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2725378");
			driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("sudha");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ahoo@hotmail.com");
			driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://suji.com");
			driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sarath");

			driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vanitha");
			driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Veedu");
			driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Vasal");
			driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
			WebElement drop6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select drpDwn6=new Select(drop6);
			drpDwn6.selectByIndex(6);
			driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600060");
			WebElement drop7=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			Select drpDwn7=new Select(drop7);
			drpDwn7.selectByIndex(2);
			driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("567");
			driver.findElement(By.className("smallSubmit")).click();
			String TitleofthePage="View Lead|opentaps CRM";
			String title1=driver.getTitle();
			if(TitleofthePage.equals(title1))
			{System.out.println(title1);
			System.out.println("As expected");
			}else {
				System.out.println("Not an Expected one");
			
			}
			
	}


}
