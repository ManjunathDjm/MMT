package com.mmt.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesData {

	static Properties properties;

	public static void loadData() throws Exception {

		properties = new Properties();
		File f = new File("D:\\Toppr Automation Projects\\MakeMyTrip\\src\\com\\mmt\\config\\config.properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
		
}

	public static String getObject(String Data) throws Exception {
	loadData();
	String data = properties.getProperty(Data);
	return data;
	}

}
