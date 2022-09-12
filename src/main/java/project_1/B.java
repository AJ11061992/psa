package project_1;

import io.restassured.path.json.JsonPath;

public class B {
	public static void main(String[] args) {
		JsonPath js=new JsonPath(PayLoad.getComplexObject());
int id = js.getInt("id");
System.out.println(id);

String url = js.getString("image.url");

System.out.println(url);

String thumbnail = js.getString("thumbnail[0].url");

System.out.println(thumbnail);



	}

}
