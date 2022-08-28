package milk.milk;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id='global-sticker']/button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@class='lilo3746-overlay lilo3746-overlay-lightbox']/a")).click();
		driver.findElement(By.xpath("//div[@aria-label='Menu']/span/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//main[@id='site-content']/div/div/div/div/div/div/div/div/div[2]/div/p[6]/a")).click();
		Set<String> handle=driver.getWindowHandles();
		int a=handle.size();
		int b=a-1;
		driver.switchTo().window(handle.toArray()[b].toString());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//form[@name='registrationForm']/div/input[@id='name']")).sendKeys("Anil");
		driver.findElement(By.xpath("//form[@name='registrationForm']/div[2]/input[@id='email']")).sendKeys("Anil123@gmail.com");
		driver.findElement(By.xpath("//form[@name='registrationForm']/div[3]/input[@id='password']")).sendKeys("Anil@123");
		driver.findElement(By.xpath("//form[@name='registrationForm']/div[6]/div/input[@value='CREATE ACCOUNT']")).click();
		driver.findElement(By.xpath("//form[@name='registrationForm']/div[6]/div/input[@value='CREATE ACCOUNT']")).click();
		driver.findElement(By.xpath("//form[@name='registrationForm']/div[6]/div/input[@value='CREATE ACCOUNT']")).click();

	}

}
