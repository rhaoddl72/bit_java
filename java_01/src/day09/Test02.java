package day09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test02 {

	public static void main(String[] args) {
		String msg = "Java programing/23000";
		System.out.println(msg.indexOf("/"));

		String d1 = msg.substring(0,msg.indexOf("/"));
		String d2 = msg.substring(msg.indexOf("/")+1);
		
		System.out.println(d1);
		System.out.println(d2);
		
		String url = "http://127.0.0.1:0000/web1/list.do";
        System.out.println(url.indexOf('/'));	
        System.out.println(url.lastIndexOf('/'));
        System.out.println(url.substring(url.lastIndexOf('/')+1));	
        
        System.out.println(url.contains("web1"));
        
        String data = "201501193_홍길동/ 90/ 70/100";
        System.out.println(data);
        data = data.replace('_','/');
                                //_를  /로 입력시켜줌
        System.out.println(data);
        String[] sdata = data.split("/");
        System.out.println(Arrays.toString(sdata));
        
        data = "2014132_홍길동 / 90_50/100";
        		StringTokenizer st = new StringTokenizer(data,"/_");
        		                                          //stringtokenizer 문자쪼개는거 여러개넣기가능
        System.out.println(st.countTokens());
        while(st.hasMoreElements()) {
        	System.out.print(st.nextToken()+",");
        }
	}
	
	// ur1.substring(url.indexOf('/'))

}
