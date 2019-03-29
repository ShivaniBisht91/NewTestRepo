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
	  key.sendkeysFunction(objrep.auto,"India");
	  
	 
	  
  }
}
