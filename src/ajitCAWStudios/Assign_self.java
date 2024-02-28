package ajitCAWStudios;
import java.net.SocketException;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Assign_self {

	public static void main(String[] args) throws InterruptedException, SocketException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\1003458\\Documents\\Driver\\chromedriver-win64\\chromedriver-win64");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the given URL
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        
        Thread.sleep(1000);
        System.out.println("page loaded");
        
        //click on TbaleData button
        WebElement tableDataButton=driver.findElement(By.xpath("//summary[contains(text(),'Table Data')]"));
        tableDataButton.click();
        System.out.println("tabledata button clicked");
        
        WebElement inputTextBox = driver.findElement(By.cssSelector("#jsondata"));
        inputTextBox.click();
        inputTextBox.clear();
        String jsonData = "[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, " +
                "{\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, " +
                "{\"name\": \"Sara\", \"age\" : 42, \"gender\": \"female\"}, " +
                "{\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, " +
                "{\"name\": \"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]";

        inputTextBox.sendKeys(jsonData);
        System.out.println("data entered in textbox");
        
            Thread.sleep(2000); // using wait because network is not stable
            
            WebElement refreshButton = driver.findElement(By.cssSelector("#refreshtable"));
            
            Thread.sleep(2000); // after entering data page is taking time
            
            refreshButton.click();
            
           System.out.println("Task completed successfully ");
           
        }   
	
     
	}
	
	
