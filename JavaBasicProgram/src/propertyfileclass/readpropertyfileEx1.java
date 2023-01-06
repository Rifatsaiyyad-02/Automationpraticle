package propertyfileclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readpropertyfileEx1 {

	public static void main(String[] args) throws IOException {
		//find property file location and created an instance of fileInputstress class
		//property file absolute location
	String filelocation="C:\\Workspace\\JavaBasicProgram\\propertyflie\\Appdata.properties";
	FileInputStream fis=new FileInputStream(filelocation);
	//create an intace of property class
	Properties prop=new Properties();
	prop.load(fis);
	  String name=prop.getProperty("name");
	  System.out.println("name is:"+name);
	  //or
	  System.out.println("email id is "+prop.getProperty("email"));
	  System.out.println("Address is "+prop.getProperty("Address"));


	}

}
