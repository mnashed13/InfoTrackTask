package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Starting webdriver and acessing Website"); 
		String Url = "https://accounts.google.com/ServiceLogin";
		driver.get(Url);
		 
		
		
		
		
		
		
		
		
		
		System.out.println("Closing Driver");
		driver.quit();
	}

}
