package com.example.gank_io_beauty.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
	public static InputStream get(String path) throws IOException{
		URL url=new URL(path);
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		InputStream is=conn.getInputStream();
		return is;
		
		
		
	}
	
	public static String isTOString(InputStream is) throws IOException{
		StringBuffer sb=new StringBuffer();
		BufferedReader reader=new BufferedReader(new InputStreamReader(is));
		String line="";
		while((line=reader.readLine())!=null){
			sb.append(line);
		}
		return sb.toString();
	} 
}	
