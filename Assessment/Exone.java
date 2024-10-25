package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exone {
	
	/*Launch the browser and Load Url as https://www.cartify.pk/ 

Click on "Shop By Categories" 

Click on "Cloth Rack" category 

Click on the "Floor-Standing Cloth Rack With Wheels" item 

Add the item to the cart 

Click on Add to cart 

Retrieve the subtotal price 

Quit the driver 
	*/
	public static void main(String[] args)
	{
		try {
			//Launch the browser and Load Url as https://www.cartify.pk/ 
		
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.cartify.pk/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//2.Click on "Shop By Categories" 
			driver.findElement(By.xpath("//span[@class='site-nav__label'][text()='Shop By Categories']")).click();
			Thread.sleep(2000);
			//3.Click on "Cloth Rack" category 
			driver.findElement(By.xpath("//div[contains(text(),'Cloth Rack')]")).click();
			Thread.sleep(2000);
			//4.Click on the "Floor-Standing Cloth Rack With Wheels" item 
			driver.findElement(By.xpath("//a[@href='/products/floor-standing-cloth-rack-with-wheels']")).click();
			Thread.sleep(2000);
			//5.Add to the cart 
			driver.findElement(By.xpath("//button[@aria-label='Add to cart']")).click();
			Thread.sleep(2000);
			//6.Click on view to cart 
			driver.findElement(By.xpath("//a[@class='cart-popup__cta-link btn btn--secondary-accent']")).click();
			Thread.sleep(2000);
			//7.Retrieve the subtotal price 
			WebElement subtotal = driver.findElement(By.xpath("//span[@class='cart-subtotal__price']"));
			System.out.println("The subtotal is:"+subtotal.getText());
			//8.Quit the driver
			
			driver.quit();
		}
		
		catch(Exception e)
		{
			System.out.println("Element not found: " + e.getMessage());
		}
		
	}

}
