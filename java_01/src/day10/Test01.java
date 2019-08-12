package day10;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("java programing".equals("java programing"));
		System.out.println("java programing".equals("java. programing"));
		System.out.println("java programing".equalsIgnoreCase("java programing"));
		System.out.println("java programing".equalsIgnoreCase("JAVA "));
		System.out.println("java programing".equalsIgnoreCase("java "));
		System.out.println("java programing".contains("JAVA "));
		System.out.println("java programing".toLowerCase().contains("java "));
		System.out.println("java programing".toLowerCase().contains("java ".toLowerCase()));
		System.out.println("=============================");
		

	}

}
