package day23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) {
		
		//System.in 인풋스트림타입
		
		InputStreamReader ir = new InputStreamReader(System.in);
		//키보드로부터들어오는 char타입을 reader타입으로 변환
		BufferedReader br = new BufferedReader(ir);
		
		String s =null;
		try{
		while((s = br.readLine()) != null){
			System.out.println("keyboard input data =>" + s);
		
		}
		}catch (Exception e) {
			
		}finally {
			try {
				if(br != null) br.close();
				if(ir != null) ir.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
