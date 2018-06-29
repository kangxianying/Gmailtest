package Gmailtest.Gmailtest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class GmailSignInTest {
	WebDriver driver = new FirefoxDriver();
	@Test
	public void gmailLoginSuccessful(){
		
		driver.get("https://mail.google.com/");
		
		WebElement usernameTextbox = driver.findElement(By.id("identifierId"));
		usernameTextbox.clear();
		usernameTextbox.sendKeys("kangshasha93@gmail.com");
		
		WebElement nextbnt1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span"));
		nextbnt1.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement passwordTextbox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[1]/div/div[1]/input"));
		passwordTextbox.clear();
		passwordTextbox.sendKeys("19930325kang");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		WebElement nextbnt2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span"));
		nextbnt2.click();
		
		Assert.assertTrue("Inbox should exist", driver.findElements(By.partialLinkText("收件箱 ")).size()>0);
		
		
		
		
	}
	

}
