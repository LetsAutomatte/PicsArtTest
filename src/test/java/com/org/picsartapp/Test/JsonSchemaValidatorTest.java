package com.org.picsartapp.Test;

import org.testng.annotations.Test;

import com.org.picsartapp.Common.JsonSchemaValidator;

public class JsonSchemaValidatorTest {
	
	static String url ="";
	static String schemaName= "";

	@Test
	public static void photoEditorSchemaTest()
	{
		schemaName="PhotoEditorSchema";
		url="https://api.picsart.com/localizations/en/messages?project=reusable_components,photo_editor";
		JsonSchemaValidator.JSONSchemaValidation(schemaName, url);
	}
	
	
	
}
