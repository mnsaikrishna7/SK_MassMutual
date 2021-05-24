package Utils;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TableReader {
	
	public static WebDriver driver;
	
	@Before
	public void setUp(){
		
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.exercisel.com/values");
	}
	
	@Test
	public void tableValidationByGivenLoacators(){
				
		Pages p = new Pages(driver);
		
		String val1= p.actual_Value1();
		String val2= p.actual_Value2();
		String val3= p.actual_Value3();
		String val4= p.actual_Value4();
		String val5= p.actual_Value5();
		String ttl=  p.actual_Value_total();
		
		
		int i1 = Integer.parseInt(val1);
		int i2 = Integer.parseInt(val2);
		int i3 = Integer.parseInt(val3);
		int i4 = Integer.parseInt(val4);
		int i5 = Integer.parseInt(val5);
		int i_ttl = Integer.parseInt(ttl);
		
		
		int total = i1+i2+i3+i4+i5;
		
		if(total==i_ttl){
			
			System.out.println("Sum value has matched!!!");
		}
		
		
		
	}
	
	@Test()
	public void htmlTableReader(){
			//Xpath for getting row and col count from HTML table	
		String colXpath = "//table[@id='Values']/tbody/tr[1]/th"; //XPath attribute is assumend and is desgined as per syntax
		String rowXpath = "//table[@id='Values']/tbody/tr";
		
		
		String footerXpath  = "//table[@id='Values']/tfoot/tr[1]/th[2]";// this is footer part of the table which has last row data
		
		//Xpath is broken into small fragments to feed i and j values to get  HTML tbale values
		String beforeXpath = "//table[@id='Values']/tbody/tr[";
		String midXpath = "]/th[";
		String afterXpath = "]";
		
		List<WebElement> col =driver.findElements(By.xpath(colXpath));
		int colCount = col.size();
		
		List<WebElement> row =driver.findElements(By.xpath(rowXpath));
		int rowCount = col.size();
		
		int sum =0;
		//Starting loop at 2nd column to retireve values and validate of table body
		for(int i=2; i<=rowCount; i++){
			
			for(int j=1; j<=colCount; j++){
				
				String data = driver.findElement(By.xpath(beforeXpath + i + midXpath+ j + afterXpath)).getText();
				
				int intData = Integer.parseInt(data);
				
				if(intData!=0 || intData<0){
					System.out.println("The retrieved value is either zero or less than zero");
				}
				else{
					System.out.println("Value is postive number");
				}
				
				
				sum = sum + intData;
							 
			}
		}
		String total = driver.findElement(By.xpath(footerXpath)).getText();
		int intTotal = Integer.parseInt(total);
		
		
		if (sum ==intTotal ){
			System.out.println("Total value is matched");
		}
		
		
		
	}

}
