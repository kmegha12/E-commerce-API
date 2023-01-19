package serialization;

import org.testng.annotations.Test;
import io.restassured.RestAssured;


public class Currentprize {
	
	
	@Test (priority = 0)  //POST method 
	public void postcurrentprize()
	{
		
		RestAssured.baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json"; 
		RestAssured.given().log().all().body("{\"time\":\r\n"
					+ "	{\"updated\":\"Jan 18, 2023 09:39:00 UTC\",\r\n"
					+ "	\"updatedISO\":\"2023-01-18T09:39:00+00:00\",\r\n"
					+ "	\"updateduk\":\"Jan 18, 2023 at 09:39 GMT\"},\r\n"
					+ "	\"disclaimer\":\"This data was produced from the CoinDesk Bitcoin Price Index (USD). \r\n"
					+ "			Non-USD currency data converted using hourly conversion rate from openexchangerates.org\",\r\n"
					+ "	\"chartName\":\"Bitcoin\",\r\n"
					+ "	\"bpi\":\r\n"
					+ "		{\r\n"
					+ "		\"USD\":{\"code\":\"USD\",\r\n"
					+ "			\"symbol\":\"&#36;\",\r\n"
					+ "			\"rate\":\"21,205.5074\",\r\n"
					+ "			\"description\":\"United States Dollar\",\r\n"
					+ "			\"rate_float\":21205.5074},\r\n"
					+ "		\r\n"
					+ "		\"GBP\":{\"code\":\"GBP\",\r\n"
					+ "			\"symbol\":\"&pound;\",\r\n"
					+ "			\"rate\":\"17,719.1523\",\r\n"
					+ "			\"description\":\"British Pound Sterling\",\r\n"
					+ "			\"rate_float\":17719.1523},\r\n"
					+ "\r\n"
					+ "		\"EUR\":{\"code\":\"EUR\",\r\n"
					+ "			\"symbol\":\"&euro;\",\r\n"
					+ "			\"rate\":\"20,657.2602\",\r\n"
					+ "			\"description\":\"Euro\",\r\n"
					+ "			\"rate_float\":20657.2602\r\n"
					+ "	}\r\n"
					+ "	\r\n"
					+ "}\r\n"
					+ "	}").when().post("https://api.coindesk.com/v1/bpi/currentprice.json").then().log().all().statusCode(201);
	System.out.println("POST method ");
	}
	
	@Test(priority = 1)
	void getcurrentPrice()
	{
		RestAssured.
		when().get("https://api.coindesk.com/v1/bpi/currentprice.json")
		.then().log().all().statusCode(200);
	}
}
