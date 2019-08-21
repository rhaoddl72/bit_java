package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class Test02 {

	public static void main(String[] args) {

		String address = "https://www.naver.com/index.html";
		String line = null;
		
		URL url = null;
		BufferedReader br = null;
		//bufferdreder 테스트문서 한라인씩읽기
		BufferedWriter bw = null;
		
		try {
			url = new URL(address);
		br = new BufferedReader(new InputStreamReader(url.openStream())); //byte스트림을 문자로읽을수있도록 char타입으로 바꿔주는게 인풋스트림리더 오픈스트림=인풋스트림 스트림생성해주는거
			    //사이트에서 데이터 들어옴
		bw = new BufferedWriter(new FileWriter("naver.html"));
		                                        //받아오는거x 써야하므로 입력
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			bw.write(line+"\n");
		}
		bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(bw != null) bw.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
