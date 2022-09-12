package project_1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.osgl.xls.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class C {
//lect date 24-08-22
	@Test(dataProvider = "getData")
	public void saveLead(Object firstName, Object lastaName, Object email, Object mobile ) {

		RestAssured.baseURI="http://localhost:8080";
		String response=given().accept(ContentType.JSON).header("Content-Type", "application/json")
		.body(PayLoad.leadJsonAdd(firstName.toString(), lastaName.toString(), email.toString(), Long.parseLong(mobile.toString()))).when()
		.post("/api/lead").then().assertThat().log().all().extract().response().asString();
	}
	
	@DataProvider
	public Object[][] getData(){
	 Object[][] data=new Object[1][4];
	ArrayList arrayList= ExcelReader.getExcelData("D:\\TECH ZONE\\PSA\\Testing\\api testing 050922\\addLeadTestData.xlsx");
	 return data;
	}
	
}
