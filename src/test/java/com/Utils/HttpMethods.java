package com.Utils;

public class HttpMethods {
	public void postExample()
	{
	String myJson = "{\"name\":\"Jimi Hendrix\"}";
    	RestAssured.baseURI  = "http://ec2-52-212-72-231.eu-west-1.compute.amazonaws.com:9091/Kraydel-server/rest/login";	

    	Response r = given()
    	.contentType("application/json").
    	body("{\"username\":\"nikom@gmail.com\",\"password\":\"test@12\" }").
        when().
        post("");

    	String body = r.getBody().asString();
    	System.out.println(body);
    	JsonPath jsonPath = new JsonPath(body);
    	String zzz = jsonPath.getString("status");
    	System.out.println("xxxxxx"+zzz);
    	Assert.assertEquals(zzz,"successfull");
	}
}
