package com.sossgrid.datastore;

import java.util.ArrayList;
import java.util.HashMap;

public class ResourceExtractor {
	
	public static HashMap<String,String> GetDataStoreConfig(String Domain){
		//These Should be Dynamic 
		//ArrayList<HashMap<String,String>> conts=new ArrayList<HashMap<String,String>>(); 
		HashMap<String,String> o=new HashMap<String,String>();
		
		o.put("server", "localhost");
		o.put("database", "s_"+Domain.replace('.', '_'));
		o.put("username", "root");
		o.put("password", "sossgrid@321");
		o.put("dataadapter", "com.sossgrid.mysql.MysqlConnector");
		//conts.add(o);
		return o;
	}

}
