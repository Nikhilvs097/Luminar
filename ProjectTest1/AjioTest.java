package ProjectTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProjectPages1.AddtobagPage;
import ProjectPages1.Homepage;
import ProjectPages1.Jacketpage;

public class AjioTest {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		Homepage ob=new Homepage(driver);
		ob.category();
		Jacketpage ob1=new Jacketpage(driver);
		ob1.select1();
		AddtobagPage ob2=new AddtobagPage(driver);
		ob2.select2();
		
	}

}
