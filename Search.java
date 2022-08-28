package milk.milk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id='global-sticker']/button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@class='lilo3746-overlay lilo3746-overlay-lightbox']/a")).click();
		driver.findElement(By.xpath("//div[@class='input-wrap']/input[@type='search']")).sendKeys("bleach");
		driver.findElement(By.xpath("//div[@class='input-wrap']/input[@type='search']")).click();
		driver.findElement(By.xpath("//div[@class='product-preview-image']/a[@href='/en-us/shop/type/powder/tide-plus-bleach-powder']/picture/img[@draggable='false']")).click();

}
}
