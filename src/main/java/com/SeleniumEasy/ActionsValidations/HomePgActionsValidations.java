package com.SeleniumEasy.ActionsValidations;

import com.SeleniumEasy.PagesObjectRepository.SeleniumHomePgObjectRep;


public class HomePgActionsValidations extends SeleniumHomePgObjectRep {

	

	SeleniumHomePgObjectRep SelHmeObjrep = new SeleniumHomePgObjectRep();
	
	public void DemoHomeClick() 
	{
		SelHmeObjrep.Close().click();
		SelHmeObjrep.DemoHome().click();
		
	}

	
	}


