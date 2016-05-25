package com;

import java.util.HashMap;



public abstract class FactoryDemo {
	
	
	public FactoryDemo(){
		super();
	}
	
	abstract void say();
	public void close(){
		System.out.println("close FactoryDeo");
		
		
	}
	public HashMap<String, Object> call(){
		HashMap map = new HashMap();
		return map;
	}
	

}
