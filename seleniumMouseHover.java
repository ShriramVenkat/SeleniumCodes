package NewPAck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class webSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:/TCS/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//li[@class='menu-arrow fk-inline-block' and @data-submenu-key='electronics']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement nexus=driver.findElement(By.xpath("//a[@data-tracking-id='0_Motorola']"));
		builder.click(nexus).build().perform();
	}

}