package ProjectPages1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
	WebDriver driver;
	By men= By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[1]/a");
	By jacket= By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[1]/ul/li[1]/div[1]/ul/li[1]/div/div/div[2]/div[1]/div[2]/span[1]/a");
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void category()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		WebElement a = driver.findElement(men);
		Actions act=new Actions(driver);
		act.moveToElement(a).perform();
		driver.findElement(jacket).click();
	}
}

