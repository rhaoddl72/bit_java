package java_prob;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) {
		
		
		String serverIp = "192.168.0.133";
		
		try {
			System.out.println(serverIp+"연결 시도...");
			Socket socket = new Socket(serverIp,8080);
			System.out.println("서버와 연결이 되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	
		
		

	}

}
