package httpmethodpkg;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class httpmethodcls {
	
	static RequestSpecBuilder rsb =new RequestSpecBuilder();

	public static void main(String[] args) 
	
	{
		RequestSpecification postreq=rsb.setBaseUri("https://petstore.swagger.io/v2/pet").addHeader("accept","application/json").addHeader("Content-Type","application/json").setUrlEncodingEnabled(false).setBody("{\r\n"
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
			Response postrep=RestAssured.given().spec(postreq).post();
			System.out.println(postrep.getBody().asString());
			System.out.println(postrep.getStatusCode());
	
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
			
			RequestSpecification getreq=rsb.setBaseUri("https://petstore.swagger.io/v2/pet/1011").addHeader("accept","application/jsxon").setUrlEncodingEnabled(false).build();
			Response getrep=RestAssured.given(getreq).get();
			System.out.println(getrep.getBody().asString());
			System.out.println(getrep.getStatusCode());
		
			RequestSpecification delreq=rsb.setBaseUri("https://petstore.swagger.io/v2/pet/1011").addHeader("accept","application/json").setUrlEncodingEnabled(false).build();
			Response delrep=RestAssured.given(delreq).delete();
			System.out.println(delrep.getBody().asString());
			System.out.println(delrep.getStatusCode());
		}
	}
