package ProjectPages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Jacketpage {
	WebDriver driver;
	By product=By.xpath("//*[@id=\"products\"]/div[3]/div[1]/div/div[2]/a/div/div[1]/div[1]/img");
	
	public Jacketpage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void select1()
	{
		driver.findElement(product).click();
	}

}
