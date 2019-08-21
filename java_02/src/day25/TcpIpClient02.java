package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpClient02 {

	public static void main(String[] args) {
		//String serverIp = "127.0.0.1";
		String serverIp = "192.168.0.133";
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null;
		Scanner keyboard = null;
	
		try {
			System.out.println(serverIp+"연결 시도...");
			socket = new Socket(serverIp,7777);
			System.out.println("서버와 연결이 되었습니다.");
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//bw.write("www ~~"+"님\n");
			//bw.flush();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//System.out.println(br.readLine());
			
			keyboard = new Scanner(System.in);
			
			
            bw.write("name"+"\n");
			bw.flush();
			System.out.println(br.readLine());
			
			while(true) {
				System.out.println("메세지를 입력하세요...");
				String msg = keyboard.nextLine();
				bw.write(msg+"\n");
				bw.flush();
				System.out.println(br.readLine());
				if(msg.equals("q")) break;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}

	}

}
