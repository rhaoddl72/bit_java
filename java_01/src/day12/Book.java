package day12;

public class Book extends Object {
	private String title;
	private int price;
	
	
	
	
	
	
	
	
	public Book() {
		super();
	}
	public Book( int price,String title) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public Book( String title,int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Book 정보 / title:");
    	sb.append(title);
    	sb.append(", 가격 :");
    	sb.append(price);
    	
    	
    	
    	
    	return sb.toString();
    	
    	
    	//return "book 정보/title"+title+"/ 가격:"+price;
    }
    
    public boolean equals(Object obj) {
    	boolean flag = false;
    	if(obj == null || !(obj instanceof Book)) {
    		//null이 아니면서 북타입 아닌거 거름
    		return false;
    	}
    	Book data = (Book)obj;
    	if(price == data.price && title.equals(data.title)) {
    		
    		flag = true;
    	}
    	return flag;
    	}
    
    @Override
    protected void finalize() throws Throwable {
    	// 객체가 소멸되기 직전에 호출되는 메소드
    	// 자바에서는 사용안하고 별도의 자원반납 기능을 만들어 사용한다. ex) close()
    	System.out.println("자원 반납 코드 ~~~~");
    	//super.finalize();
    }
    
    public void close() {
    	System.out.println("close() 자원 반납 코드 ~~~~~");
    }
    	
    }
    

