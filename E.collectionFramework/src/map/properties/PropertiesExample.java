package map.properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

//HashTable에 하위 클래스
//Key Value 모두 String

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();

		// file path 찾기
		String path = PropertiesExample
				 	  .class
				 	  .getResource("database.properties")
				 	  .getPath();

		path = URLDecoder.decode(path, "utf-8"); // 한글변환
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
