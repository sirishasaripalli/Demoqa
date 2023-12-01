import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class MyDemoqaClass {
	
	public static void DemoqaMethod() {
		WebDriver Chromedriver = new ChromeDriver();
		Chromedriver.manage().window().setSize(new Dimension(2048, 1024));
		Chromedriver.get("https://tutorialsninja.com/demo/index.php");
		WebElement Clickthis = Chromedriver.findElement(By.xpath("//div[@class='pull-left']/form/div/button/span[text()='Currency']"));
		Clickthis.click();
		Chromedriver.findElement(By.xpath("//button[@name='EUR']")).click();
		Chromedriver.findElement(By.xpath("//a[text()='Canon EOS 5D']")).click();
		Chromedriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		try {
			//Chromedriver.wait(10000);
			if(Chromedriver.findElement(By.xpath("//div[@class='text-danger']")).isDisplayed())
		{
			System.out.println("got the error message");
		}
		}
		catch (Exception e)
		{
			System.out.println("else loop");
		}
		
	}
	public static void main(String[] args) {
		DemoqaMethod();
	}
}
