package project_1;

public class PayLoad {
	public static String getComplexObject() {
		return("{\r\n"
				+ "	\"id\": \"1\",\r\n"
				+ "	\"type\": \"icecream\",\r\n"
				+ "	\"name\": \"Vanilla Cone\",\r\n"
				+ "	\"image\":\r\n"
				+ "		{\r\n"
				+ "			\"url\": \"img/01.png\",\r\n"
				+ "			\"width\": 200,\r\n"
				+ "			\"height\": 200\r\n"
				+ "		},\r\n"
				+ "	\"thumbnail\":\r\n"
				+ "  [\r\n"
				+ "    {\r\n"
				+ "			\"url\": \"images/thumbnails/01.png\",\r\n"
				+ "			\"width\": 32,\r\n"
				+ "			\"height\": 32\r\n"
				+ "		},\r\n"
				+ "        {\r\n"
				+ "			\"url\": \"images/thumbnails/01.png\",\r\n"
				+ "			\"width\": 32,\r\n"
				+ "			\"height\": 32\r\n"
				+ "		}\r\n"
				+ "  ]\r\n"
				+ "		\r\n"
				+ "}");
	}
		
	public static String leadJsonAdd(String firstName, String lastName, String email, long mobile) {
		String jsPayLoad="{\\r\\n\"\r\n"
				+ "				+ \"        \\\"firstName\\\": \\\""+firstName+"\\\",\\r\\n\"\r\n"
				+ "				+ \"        \\\"lastName\\\": \\\""+lastName+"\\\",\\r\\n\"\r\n"
				+ "				+ \"        \\\"email\\\": \\\""+email+"\\\",\\r\\n\"\r\n"
				+ "				+ \"        \\\"mobile\\\": "+mobile+"\\r\\n\"\r\n"
				+ "				+ \"    }";
		return jsPayLoad;
	}
}
