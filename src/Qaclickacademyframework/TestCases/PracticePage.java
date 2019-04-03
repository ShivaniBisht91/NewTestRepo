package Qaclickacademyframework.TestCases;

import org.testng.annotations.Test;
import Qaclickacademyframework.DriverReaders.AllDrivers;
import Qaclickacademyframework.KeywordUtil.KeywordUtil;
import Qaclickacademyframework.ObjectRepo.ObjectRepo;


public class PracticePage extends AllDrivers {
	
  @Test
  public void all() {
	  
	  KeywordUtil key=new KeywordUtil();
		
	  ObjectRepo objrep=new ObjectRepo();
	  
	  key.clickFunction(objrep.radio2);
	  String autotext=pro.getProperty("autotext");
	  key.sendkeysFunction(objrep.auto,autotext);
	  
	  key.threadSleep(4000);
	  key.autocomplete(objrep.autolist,autotext);
	  
	  key.basicDropDown(objrep.drop3);
	  key.checkBox(objrep.check2);
  }
}
