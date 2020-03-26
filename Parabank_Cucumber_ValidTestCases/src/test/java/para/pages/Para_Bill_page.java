package para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Para_Bill_page 
{
	public static WebDriver driver;
	 
	  By username=By.name("username");
      By password=By.name("password");
      By login=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	  By billpay=By.xpath("//*[@id='leftPanel']/ul/li[4]/a");
	  By payeename=By.name("payee.name");
	  By address=By.name("payee.address.street");
	  By payeecity=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[3]/td[2]/input");
	  By payeestate=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[4]/td[2]/input");
	  By payeeZipcode=By.xpath("//table[@class='form2']//tbody//tr[5]//input");
	  By payeephoneno=By.xpath("//table[@class='form2']//tr[6]//td[2]/input");
	  By accountno=By.name("payee.accountNumber");
	  By verifyaccount=By.xpath("//input[@name='verifyAccount']");
	  By amount=By.name("amount");
	  By submit=By.xpath("//table[@class='form2']//tr[14]//input");
	  
	  
	public Para_Bill_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void customerLogin()
	{
		driver.findElement(username).sendKeys("tri");
		driver.findElement(password).sendKeys("tri123");
		driver.findElement(login).click();
	}
	
	public void customerBillPay()
	{
		driver.findElement(billpay).click();
		driver.findElement(payeename).sendKeys("Radhika");
		driver.findElement(address).sendKeys("shrada colony 3rd street");
		driver.findElement(payeecity).sendKeys("Guntur");
		driver.findElement(payeestate).sendKeys("AndhraPradesh");
		driver.findElement(payeeZipcode).sendKeys("526007");
		driver.findElement(payeephoneno).sendKeys("6241587933");
		driver.findElement(accountno).sendKeys("1352");
		driver.findElement(verifyaccount).sendKeys("1352");
		driver.findElement(amount).sendKeys("50");
		
	}

	public void submitBillPay() throws InterruptedException
	{
		driver.findElement(submit).click();
		Thread.sleep(3000);
		driver.close();
	}
	
}
