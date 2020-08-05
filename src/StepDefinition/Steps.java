package StepDefinition;		

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
WebDriver driver; 
     


    @Given("^that I Open google chrome and launch the application to run tests$")				
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This is a test to see if the glue code is correct.");
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    	driver = new ChromeDriver();
//    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
//		driver = new FirefoxDriver();
		System.out.println("Starting webdriver and acessing Website"); 
		String Url = "https://accounts.google.com/ServiceLogin";
		driver.get(Url);
	
	
    }		

    @When("^User runs the sign in test to check the sign in functionality$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {	
    	Thread.sleep(2000);
   		driver.findElement(By.cssSelector("#identifierId")).sendKeys("tt5235783");
   		Thread.sleep(2000);
   		System.out.println("This step enter the Username and Password on the login page.");
   		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
   		Thread.sleep(2000);
    	System.out.println("Staring to input the password");
   		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("!!Password123");
   		Thread.sleep(2000);
   		driver.findElement(By.cssSelector(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > .VfPpkd-RLmnJb")).click();
   		Thread.sleep(15000);
   		driver.quit();
   		System.out.println("Sign In Test Complete");
   	 
    }		

    @Then("^Reset the test for Learn more link Test$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("Resetting browser test for Leanr more link test");		
        driver = new ChromeDriver();
    	System.out.println("Starting webdriver and acessing Website to start the learn more link test"); 
		String Url = "https://accounts.google.com/ServiceLogin";
		driver.get(Url);
	 	driver.findElement(By.xpath("//a[contains(text(),'Learn more')]")).click();
	 	String actualTitle = driver.getTitle();
	 	String expectedTitle = "Browse Chrome as a guest - Computer - Google Chrome Help";
	 	assertEquals(expectedTitle,actualTitle);
	 	System.out.println("Learn More Link Test Passed");
	 	driver.quit();
        
    }	
    

    
    
    @Then("^Reset the test for Create New Account Test$")					
    public void Create_New_Account_Test() throws Throwable 							
    {    		
        System.out.println("Resetting browser test for Create New Account test");		
        driver = new ChromeDriver();
//		driver = new FirefoxDriver();
    	System.out.println("Starting webdriver and acessing Website to start the learn more link test"); 
		String Url = "https://accounts.google.com/ServiceLogin";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".NlWrkb")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span/div[2]/div")).click();
		Thread.sleep(2000);
	 	System.out.println("Entering Account Creation Credentials");
	 	Thread.sleep(2000);
	 	driver.findElement(By.id("firstName")).sendKeys("TestFirstName2");
	 	Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("TestLastName");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".uBOgn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("mnashed1324332@outlook.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#passwd .whsOnd")).sendKeys("!!Password123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#confirm-passwd .whsOnd")).sendKeys("!!Password123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='accountDetailsNext']/span/span")).click();
		Thread.sleep(2000);
		
		String Text1 = "Verify your email address";
		String Text2 = driver.findElement(By.cssSelector("#headingText > span")).getText();
		System.out.println(Text2);

		if(Text1.contentEquals(Text2)) {
			Thread.sleep(2000);
			System.out.println("Account Creation Test has passed");
			driver.quit();
		}else {
			Thread.sleep(2000);
			System.out.println("Account Creation Test has Failed");
			driver.quit();
			
		}
		
		
// 		Another way of verifying text on a webpage is to use the getPagesource() and to see if the page contains the required text.	
		
//		if(driver.getPageSource().contains("If you don’t see it, check your spam folder")){
//			System.out.println("Account Creation Test has passed");
//			driver.quit();
//		}else {
//			System.out.println("Account Creation Test has Failed");
//			driver.quit();
//			
//		}
		
		
    }		

    
  @Then("^Reset the test for Forgot Password link Test$")					
  public void Forgot_Email_Test() throws Throwable 							
  {    		
      System.out.println("Resetting browser test for Forgot Password test");		
      driver = new ChromeDriver();
//		driver = new FirefoxDriver();
  	System.out.println("Starting webdriver and acessing Website to start the learn more link test"); 
		String Url = "https://accounts.google.com/ServiceLogin";
		driver.get(Url);
		driver.findElement(By.cssSelector(".PrDSKc > button")).click();
		Thread.sleep(2000);
	 	System.out.println("Entering Email Address");
		driver.findElement(By.xpath("//input[@id='recoveryIdentifierId']")).sendKeys("tt5235783@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Test");;
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Account");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		String Text1 = "Please provide additional information to aid in the recovery process.";
		String Text2 = driver.findElement(By.xpath("//div[@id='headingSubtext']/span")).getText();
		
		if(Text1.contentEquals(Text2)) {
			
			System.out.println("Forgot Password Test has passed");
			driver.close();
		}else {
			System.out.println("Forgot Password Test has Failed");
			
		}
		
		
		
		
		
  }	
  

}