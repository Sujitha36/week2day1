package assignmentweek2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("Suji");
driver.findElement(By.name("lastname")).sendKeys("Perumal");
driver.findElement(By.name("reg_email__")).sendKeys("2345");
driver.findElement(By.name("reg_passwd__")).sendKeys("rgetyu");
WebElement drop1=driver.findElement(By.id("day"));
Select drpDwn=new Select(drop1);
drpDwn.selectByIndex(1);
WebElement drop2=driver.findElement(By.id("month"));
Select drpDwn2=new Select(drop2);
drpDwn2.selectByIndex(10);
WebElement drop3=driver.findElement(By.id("year"));
Select drpDwn3=new Select(drop3);
drpDwn3.selectByIndex(5);
driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
