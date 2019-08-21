package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class TcpIpServer {

	public static void main(String[] args) {
		
		ServerSocket serversocket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			serversocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
		} catch (Exception e) {
           e.printStackTrace();
		}
		

		while(true) {
			try { 
				System.out.println("Client 요청을 기다립니다.");
				Socket socket = serversocket.accept(); // 기다리는 구문
				//System.out.println(socket.getInetAddress()+"와 연결중입니다.");
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				
				String name = br.readLine();
				//System.out.println("hello ~~~"+name +"님 \n");
				
				
				
				
				bw.write("Hello ~~"+name+"님\n");
				bw.flush();
				
				String msg = null;
				while((msg = br.readLine()) != null) {
					bw.write(name+":"+msg+"\n");
					bw.flush();
					
				}
					
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		

	}

}
