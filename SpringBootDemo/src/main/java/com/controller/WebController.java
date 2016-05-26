package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/serach")
@Configuration
public class WebController {
	
	@RequestMapping("/{count}")
	public  void getString(@PathVariable("count")final  int count){
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<count;i++){
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							System.out.println(Thread.currentThread().getName()+" start");
							excute(Thread.currentThread().getName());
						}
					},"client"+i).start();
				}
				
			}
		},"client");
		
		thread.start();
		try {
			thread.join();
			System.out.println("deaom is down!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private  void  excute(String name){
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://localhost:8080/SpringBootDemo/getclient/"+name);
		HttpResponse httpResponse;
		try {
			httpResponse = httpClient.execute(httpGet);
		
		int status = httpResponse.getStatusLine().getStatusCode();
		
		System.out.println("code "+ status);
		HttpEntity entity = httpResponse.getEntity();
		
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(entity.getContent()));
		StringBuffer sb = new StringBuffer();
		while(bReader.readLine() != null){
			sb.append(bReader.readLine());
		}
		
		EntityUtils.consume(entity);
		System.out.println(sb.toString());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
