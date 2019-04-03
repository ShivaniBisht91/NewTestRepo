package Qaclickacademyframework.ObjectRepo;

import org.openqa.selenium.By;
import Qaclickacademyframework.DriverReaders.AllDrivers;


public class ObjectRepo extends AllDrivers {
	
	//Practice page
	
	public By radio2=By.xpath("//input[@name='radioButton' and @value='radio2']");
	public By auto=By.id("autocomplete");
	public By autolist=By.className("ui-menu-item");
	public By drop3=By.id("dropdown-class-example");
	public By check2=By.id("checkBoxOption2");


}
