package opening_broswers;

public class OpenChrome {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ecoders.in");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
