package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader(System.getProperty("user.dir")+"/src/main/resources/PropertyFile/application.properties");
		

		Properties properties = new Properties();
		properties.load(reader);

		System.out.println(properties.getProperty("user"));
		System.out.println(properties.getProperty("password"));
	}

}
