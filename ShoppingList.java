/***
 * 
 *  1. Launch the URL https://www.ajio.com/
	2. In the search box, type as "bags" and press enter
	3. To the left  of the screen under " Gender" click the "Men"
	4. Under "Category" click "Fashion Bags"
	5. Print the count of the items Found. 
	6. Get the list of brand of the products displayed in the page and print the list.
	7. Get the list of names of the bags and print it
 */

package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ShoppingList {

	public static void main(String[] args) {
		LinkedHashSet<String> LinkedHashSetset1 = new LinkedHashSet();
		LinkedHashSet<String> LinkedHashSetset2 = new LinkedHashSet();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name ='searchVal']")).sendKeys("bags", Keys.ENTER);
        driver.findElement(By.partialLinkText("MEN")).click();
      //input[@value='fashion bags']
        driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("fashion bags", Keys.ENTER);
        String size = driver.findElement(By.className("length")).getText();
        System.out.println(size);
        
        List<WebElement> brandprod = driver.findElements(By.xpath("(//div[@class='brand'])"));
        for(int i=0;i<brandprod.size();i++) {
        	String bp=brandprod.get(i).getText();
        	LinkedHashSetset1.add(bp);        	
        }
        System.out.println(LinkedHashSetset1);	
        System.out.println(LinkedHashSetset1.size());	
        List<WebElement> bagname = driver.findElements(By.xpath("(//div[@class='nameCls'])"));
        for (int j=0;j<bagname.size();j++) {
        	String bn = bagname.get(j).getText();
        	LinkedHashSetset2.add(bn);
        }
        System.out.println(LinkedHashSetset2);
        System.out.println(LinkedHashSetset2.size());
	}

}
