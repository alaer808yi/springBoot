package com.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
	private Services(){
		
	}
	private static final Map<String,Provider> providers= new ConcurrentHashMap<String, Provider>();
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	public static void registerDefaultProvider(Provider p){
		registerProvider(DEFAULT_PROVIDER_NAME,p);
	}
	public static void registerProvider(String name,Provider p){
		providers.put(name, p);
	}
	
	public static Service newInstance(String name){
		Provider p = providers.get(name);
		if(null == p){
			throw new IllegalArgumentException("no suitable driver register for name "+name);
		}
		return p.newService();
		
	}

}
