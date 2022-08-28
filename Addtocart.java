package milk.milk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id='global-sticker']/button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@class='lilo3746-overlay lilo3746-overlay-lightbox']/a")).click();
		//Actions a=new Actions(driver);
		//Thread.sleep(2);
		//a.moveToElement(driver.findElement(By.xpath("//div[@class='header-main-bar']/div/div/div/div/a[@href='/en-us/shop']"))).build().perform();
		//a.click(driver.findElement(By.xpath("//div[@class='header-main-bar']/div/div/div/div/div/div/div/a[@href='/en-us/shop/type/powder']"))).build().perform();
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='header-main-bar']/div/div/div/div/a[@href='/en-us/shop']")).click();
		driver.findElement(By.xpath("//div[@class='row plp-product-previews-wrapper plp-product-previews-cards']/div/div/div/div/div/div/a/picture/img[@loading='lazy']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//div[@class='container tide-product-topbanner']/div/div[2]/div/span[@class='ps-button-label']")).click();
		driver.findElement(By.xpath("//div[@data-item='onlineSellers']/div/div/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//div[@aria-label='Press & Hold']/div[2]/p[text()='Press & Hold']")).click();
	}

}
