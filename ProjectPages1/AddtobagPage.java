package ProjectPages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtobagPage {
	WebDriver driver;
	
	By size=By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div[2]/div/span");
	By bag=By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]/div");

		public AddtobagPage (WebDriver driver)
		{
			this.driver=driver;
		}
		public void select2() throws Exception 
		{
			
			driver.findElement(size).click();
			driver.findElement(bag).click();
		}
}
