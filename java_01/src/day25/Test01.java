package day25;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {

	public static void main(String[] args) {
		
		InetAddress ip = null;
		
		System.out.println("---------------------");
		try {
			ip = InetAddress.getLocalHost();
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("gethostname" + ip.getHostName());
		System.out.println("gethostaddress" + ip.getHostAddress());
		System.out.println("tostring" + ip.toString());
		
		System.out.println("---------------------");
		
		try {
			
			ip = InetAddress.getByName("www.naver.com");
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("gethostname" + ip.getHostName());
		System.out.println("gethostaddress" + ip.getHostAddress());
		System.out.println("tostring" + ip.toString());

	}

}
