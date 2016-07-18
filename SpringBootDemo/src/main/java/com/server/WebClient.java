package com.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.util.SleepUtil;


public class WebClient {

	public static void main(String args[]) throws InterruptedException{
	
		final WebClient webClient = new WebClient();

		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<100;i++){
					
					new Thread(webClient.new MutiClient("client"),"little_client_"+i).start();
					
				}
				
			}
		},"client");
		t.start();
		t.join();

	}
	
	
	class MutiClient implements Runnable{
		private String clientName;
		public MutiClient(String clientName){
			this.clientName = clientName;
		}

		@Override
		public void run() {
			createClient(clientName);
			
		}
		
	}
	
	public synchronized void createClient(String clientName){
		
		SleepUtil.sleepMill(1);
		System.out.println(Thread.currentThread().getName() +" get the work");
		//for(int i=0;i<10;i++){
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
				try(Socket socket = new Socket("127.0.0.1",2013);
						PrintWriter p = new PrintWriter(socket.getOutputStream(),true);
//						BufferedReader b = new BufferedReader(new InputStreamReader(n));
						BufferedReader pBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
							
//							System.out.println(clientName+Thread.currentThread().getName());
							p.println("i am "+clientName+" , "+Thread.currentThread().getName());
							p.flush();
							
							String recemsg = pBufferedReader.readLine();
							System.out.println("Server say: "+recemsg);
						}catch (Exception e) {
							e.printStackTrace();
						}
			//}
			
			
		
				SleepUtil.sleepMill(1);
				System.out.println(Thread.currentThread().getName()+"deal over the work!");
		
	}
	
	
}
