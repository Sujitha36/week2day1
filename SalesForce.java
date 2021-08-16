package assignmentweek2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("suji");
		driver.findElement(By.name("UserLastName")).sendKeys("peru");
		driver.findElement(By.name("UserEmail")).sendKeys("wre@rt.com");
		WebElement drop1=driver.findElement(By.name("UserTitle"));
		Select drpDwn=new Select(drop1);
		drpDwn.selectByIndex(1);
		driver.findElement(By.name("CompanyName")).sendKeys("cts");
		WebElement drop2=driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2=new Select(drop2);
		drpDwn2.selectByIndex(1);
		driver.findElement(By.name("UserPhone")).sendKeys("78693546278");
		WebElement drop3=driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3=new Select(drop3);
		drpDwn3.selectByValue("AF");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
	}

}
