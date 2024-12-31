package httpmethodpkg;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class httpmethod {
	static RequestSpecBuilder rsb=new RequestSpecBuilder();
	public static void post()
	{
		RequestSpecification postreq=rsb.setBaseUri("https://petstore.swagger.io/v2/pet").addHeader("accept","application/json").addHeader("Content-Type","application/json").setUrlEncodingEnabled(false).setBody("{\r\n"
				+ "  \"id\": 1011\r\n"
				+ "  ,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"chicks\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"chicken\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"Available\"\r\n"
				+ "}").build();
		Response postrep=RestAssured.given().spec(postreq).post();
		System.out.println(postrep.getBody().asString());
		System.out.println(postrep.getStatusCode());
	}
	public static void put()
	{
		RequestSpecification putreq=rsb.setBaseUri("https://petstore.swagger.io/v2/pet").addHeader("accept","application/json").addHeader("Content-Type","application/json").setUrlEncodingEnabled(false).setBody("{\r\n"
				+ "  \"id\": 1011,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"Chicks\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"Chicken\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"out of stock\"\r\n"
				+ "}").build();
		Response putrep=RestAssured.given().spec(putreq).put();
		System.out.println(putrep.getBody().asString());
		System.out.println(putrep.getStatusCode());
	}
public static void get(int id)
{
	RequestSpecification getreq=rsb.setBaseUri("https://petstore.swagger.io/v2/pet/").addHeader("accept","application/json").setUrlEncodingEnabled(false).build();
	Response getrep=RestAssured.given().spec(getreq).get("/"+id);
	System.out.println(getrep.getBody().asString());
	System.out.println(getrep.getStatusCode());
}
public static void delete(int id)
{
	RequestSpecification delreq=rsb.setBaseUri("https://petstore.swagger.io/v2/pet").addHeader("accept","application/json").setUrlEncodingEnabled(false).build();
	Response delrep=RestAssured.given().spec(delreq).delete("/"+id);
	System.out.println(delrep.getBody().asString());
	System.out.println(delrep.getStatusCode());
}
}
