package Qaclickacademyframework.KeywordUtil;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Qaclickacademyframework.DriverReaders.AllDrivers;


public class KeywordUtil extends AllDrivers{
	
	public void sendkeysFunction(By id,String s) {
		
		driver.findElement(id).sendKeys(s);

}
public void clickFunction(By id) {
		
		driver.findElement(id).click();

}

public void clearFunction(By id) {
	
	driver.findElement(id).clear();

}

public void threadSleep(int s) {
	try {
		Thread.sleep(s);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void autocomplete(By id, String auto) {
	
	List<WebElement> items=driver.findElements(id);
	
	
	for(int i=0; i<items.size();i++) {   
		
		if(items.get(i).getText().equals(auto)) {
			
			items.get(i).click();
		}
	}
}

public void basicDropDown(By id) {
	
	WebElement optionDrop=driver.findElement(id);
	
	Select drop=new Select(optionDrop);
	drop.selectByVisibleText("Option3");
}

public void checkBox(By id) {
	driver.findElement(id).click();;
}

public void openNewWindow(By id, By xpath){
	
	driver.findElement(id).click();
	
	String mainWindow=driver.getWindowHandle();
	Set<String> allWindow=driver.getWindowHandles();
	
	Iterator<String> it=allWindow.iterator();
	
	while(it.hasNext()){
		
		String window=it.next();
		
		if(!window.equals(mainWindow)) {
			
			String childWindow=window;
			driver.switchTo().window(childWindow);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(xpath).click();
		}
		
	}
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();

driver.switchTo().window(mainWindow);		
}

public void alertaccept() {

	driver.switchTo().alert().accept();
}

}
