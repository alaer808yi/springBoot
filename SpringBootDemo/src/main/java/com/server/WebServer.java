package com.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class WebServer {
	public static void main(String args[]) throws IOException{
		new WebServer();
	}
	
	public WebServer() throws IOException{
		
		ServerSocket serverSocket = new ServerSocket(2013);
		Socket socket = null;
		try{
			while(true){
				socket = serverSocket.accept();
				new Thread(new AcceptClient(socket)).start();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(serverSocket != null){
					serverSocket.close();
				}
				if(socket != null){
					socket.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	class AcceptClient implements Runnable{

		private Socket socket;
		public AcceptClient(Socket socket){
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try{
				System.out.println(Thread.currentThread().getName()+" is  working");
				BufferedReader b = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			    PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
				
				//receive str
				String str =b.readLine(); 
				if(str != null){
					System.out.println("client say: "+str);
				}
				
				
				//send str
				printWriter.println("hi i am server,i receve you msg: "+str);
				printWriter.flush();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}
