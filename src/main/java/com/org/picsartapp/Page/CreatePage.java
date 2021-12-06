package com.org.picsartapp.Page;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.org.picsartapp.Base.Base;

public class CreatePage extends Base{

	public CreatePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	
	
}
