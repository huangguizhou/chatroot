package cn.hgz.chatroot;

import java.awt.BorderLayout;
import java.awt.Button;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChatRootServer {
	public static final int PORT= 9080;
	public static void main(String[] args) {
		ChatRootServer  crs= new ChatRootServer();
		//crs.init();
		crs.JFrame();
	
		
		
	
	}
	
	public void JFrame() {
		JFrame frame = new JFrame();
		frame.setLocation(200, 200);
		frame.setSize(600,600);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
		
		
		
		JButton button = new JButton("发送111111");
		button.setBounds(520, 520, 50, 60);
	};
	
	JPanel p = new JPanel() {
		public void paintComponent() {
			Button button1 = new Button("我是按钮");
			button1.setBounds(520, 520, 50, 50);
		}
	};
	

}
