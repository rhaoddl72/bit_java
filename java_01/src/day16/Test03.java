package day16;

public class Test03 {
	public static void main(String[] args) {

		System.out.println("main start");
		String msg = null;
		msg = "xml";
		
		try {
			if(msg != null )
		System.out.println(msg.charAt(3));

		int num = Integer.parseInt(msg);
		
		} catch (NullPointerException e) {
			System.out.println("예외 발생 :" + e.getMessage());//null
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("예외 발생 :"+e.getMessage()); // index
		}
		catch (NumberFormatException  e) {
			System.out.println("예외 발생 정수 입력" + e.getMessage());
		}
	     
			
			catch (Exception  e) {
	    	 System.out.println("예외 발생 : 정수로 입력해주세요" + e.getMessage());
	     }
		finally {
			System.out.println("finally {자원 반납 코드}");
		}
		
		System.out.println("main and");
	}

}
