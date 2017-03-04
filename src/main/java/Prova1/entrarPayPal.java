package Prova1;

import java.util.Scanner;

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class entrarPayPal {

	public static final String paypalUrl = "https://www.paypal.com/"; 
	public static String email = new String();
	public static String password = new String(); 
	public static String user = "Diana"; 
	
    public static void main(String[] args) {

        if(user.equals("Diana")) System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cabrera\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.25.0\\chromedriver.exe");
        if(user.equals("Zaira")) System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cabrera\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.25.0\\chromedriver.exe");
        if(user.equals("Cami")) System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cabrera\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.25.0\\chromedriver.exe");
        if(user.equals("Marta")) System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cabrera\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.25.0\\chromedriver.exe");
        
         WebDriver driver = new ChromeDriver(); 
         driver.get(paypalUrl); 
         
         
       //create the Scanner
         @SuppressWarnings("resource")
		Scanner terminalInput = new Scanner(System.in);

         //ask and read input
         System.out.println("What's your e-mail?");
         email = terminalInput.nextLine();
         System.out.println("What's your paypal password?");
         password = terminalInput.nextLine(); 
         
         try {
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.id("ul-btn")); 
			element.click(); 
			Thread.sleep(1000);
			
			WebElement emailTextBox = driver.findElement(By.id("email"));
			emailTextBox.clear();
			emailTextBox.sendKeys(email);
			emailTextBox.submit(); 
			WebElement passwordTextBox = driver.findElement(By.id("password"));
			passwordTextBox.clear(); 
			passwordTextBox.sendKeys(password);
			passwordTextBox.submit(); 
			Thread.sleep(1000);
			
			WebElement loginButton = driver.findElement(By.id("btnLogin")); 
			loginButton.click(); 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         driver.close();
    }



}