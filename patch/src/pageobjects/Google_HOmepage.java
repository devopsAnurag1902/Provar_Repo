package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Google_HOmepage"                                
     , summary=""
     , relativeUrl=""
     , connection="Ui_Connection"
     )             
public class Google_HOmepage {

	@TextType()
	@FindBy(xpath = "//*[@aria-label='Search']")
	public WebElement Search_Bar;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Google Search']")
	public WebElement googleSearch;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Choose area']")
	public WebElement chooseArea;
			
}
