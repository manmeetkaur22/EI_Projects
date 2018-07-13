package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class config_Provider {
	Properties pro;
		public config_Provider() throws Exception 
		{
			File src=new File ("C:\\Users\\Manmeet\\eclipse-workspace\\com.google\\configuration\\config.properties");
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
			
		}
		public String getApplicationURl()
		{
			String url = pro.getProperty("url");
			return url;
			
		}
		public String ChromePath()
		{
			String path=pro.getProperty("chromePath");
			return path;
		}
		public String IEPath()
		{
			String path=pro.getProperty("iEPath");
			return path;
		}
		public String firfoxPath()
		{
			String path=pro.getProperty("firfoxPath");
			return path;
		}
		public String ChromeDriver()
		{
			String dpath=pro.getProperty("ChromeDriver");
			return dpath;
		}
		public String FirFoxDriver()
		{
			String dpath=pro.getProperty("FirFoxDriver");
			return dpath;
		}
		public String IeDriver()
		{
			String dpath=pro.getProperty("IeDriver");
			return dpath;
		}
		
	

}

