package java_prob;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpClient {

	public static void main(String[] args) {
		//String serverIp = "127.0.0.1";
		ServerSocket serversocket = null;
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
				System.out.println(socket.getInetAddress()+"와 연결중입니다.");
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}

	}

}
