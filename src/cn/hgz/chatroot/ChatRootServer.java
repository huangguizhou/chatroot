package cn.hgz.chatroot;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatRootServer {
	public static final int PORT= 9080;
	public static void main(String[] args) {
		new ChatRootServer().init();
	
	}
	
	
	public void init() {
		try {
			ServerSocket serversocket= new ServerSocket(PORT);
			while(true) {
				Socket sa= serversocket.accept();
				System.out.println("有计算机连接到服务器");
				
				new Thread (new Runnable() {
					
					public void run() {
						
					}
					
				} ).start();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("服务器异常"+e.getMessage());
		}
	}

}
