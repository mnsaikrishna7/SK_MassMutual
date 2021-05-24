package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	
	public WebDriver driver;	
	
	public Pages(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="lbl_val_1")
	WebElement value1;
	@FindBy(how=How.ID, using="lbl_val_2")
	WebElement value2;
	@FindBy(how=How.ID, using="lbl_val_3")
	WebElement value3;
	@FindBy(how=How.ID, using="lbl_val_4")
	WebElement value4;
	@FindBy(how=How.ID, using="lbl_val_5")
	WebElement value5;
	@FindBy(how=How.ID, using="lbl_ttl_val")
	WebElement TotalValue;
	
	
	@FindBy(how=How.ID, using="txt_val_1")
	WebElement actual_Value1;
	@FindBy(how=How.ID, using="txt_val_2")
	WebElement actual_Value2;
	@FindBy(how=How.ID, using="txt_val_4")
	WebElement actual_Value3;
	@FindBy(how=How.ID, using="txt_val_5")
	WebElement actual_Value4;
	@FindBy(how=How.ID, using="txt_val_6")
	WebElement actual_Value5;
	@FindBy(how=How.ID, using="txt_ttl_val")
	WebElement TotalSum;
	
	public String actual_Value1(){
		return actual_Value1.getText();
		
	}

	public String actual_Value2(){
		return actual_Value2.getText();
		
	}
	public String actual_Value3(){
		return actual_Value3.getText();
		
	}
	public String actual_Value4(){
		return actual_Value4.getText();
		
	}
	public String actual_Value5(){
		return actual_Value5.getText();
		
	}
	public String actual_Value_total(){
		return TotalSum.getText();
		
	}
}
