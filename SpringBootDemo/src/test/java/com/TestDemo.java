package com;

import java.util.HashMap;


public class TestDemo extends FactoryDemo {

	@Override
	void say() {
		System.out.println("ok");
		
	}
	public void close(){
		System.out.println("child close");
		super.close();
	}
	public static void main(String args[]){
		try{
			TestDemo demo = new TestDemo();
			demo.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
		
	}
	public HashMap<String, Object> call(){
		return null;
		
	}
	
	
	

}
