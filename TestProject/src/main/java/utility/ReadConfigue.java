package utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadConfigue {
	
	Properties pro;
	
	public ReadConfigue()
	{
		String path="E:\\Nitin\\Github\\4 June\\DemoRepository4junBatach\\TrailBlazeProject\\TestProject\\Configue\\Configue.properties";
		
		File file=new File(path);
		try 
		{
			FileInputStream fis=new FileInputStream(file);
			pro=new Properties();
			pro.load(fis);
			
		} 
		catch (IOException e)
		{
			System.out.println("Exception in " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	//readurl
	public String getApplicationURL()
	{
	String	url=pro.getProperty("url");
	return url;
	
	}
	

}
