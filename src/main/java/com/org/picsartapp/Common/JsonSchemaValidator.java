package com.org.picsartapp.Common;

import java.io.File;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class JsonSchemaValidator {
	
	 public static void JSONSchemaValidation(String schemaName, String url) {    
		 
		         File schema = new File(System.getProperty("user.dir")+"\\src\\main\\java\\JsonSchemas\\"+schemaName+".json");
		 
		       given().		 
		           get(url).
		       then().
		       assertThat()
				.statusCode(200)
		       .body(matchesJsonSchema(schema));      
		 
		     }
	

}
