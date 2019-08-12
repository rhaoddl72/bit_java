package day08;

public class Test02 {

	public static void main(String[] args) {
		student[] students = {
				new student("홍길동", 201310054, 50, 66, 75),
				new student("정길동", 201510754, 67, 15, 38),
				new student("김길동", 201910054, 80, 55, 90),
				new student("강길동", 201210054, 95, 75, 85),
				new student("고길동", 201710054, 90, 90, 90),
				
		};
		
		for(student data:students) 
			if(data.getGrade() =='b') {
			data.print();
		}
		
		
		

	}

}

class student{
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;
	
	public student() { }
	public student(String name, int number, int kor, int eng, int math) {
	this.name = name;
	this.number = number;
	
	this.setKor(kor);
	this.setEng(eng);
	this.setMath(math); //유효성 검사를 위해서 아래쪽 인식
}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(!checkjumsu(kor)) return;
		this.kor = kor;
		
		
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(!checkjumsu(eng)) return;
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(!checkjumsu(math)) return;
		this.math = math;
	}	
	

	public char getGrade() {
		//this.setGradeprocess();
		return grade;
	}
	public void setGradeprocess() {
		double avg = (kor+eng+math)/3.;
		this.grade = avg>=90 ? 'a':(avg>=80?'b':(avg>=70?'c':(avg>=60?'d':'f')));
	
	}
	
	
	
	private boolean checkjumsu(int num) {
		boolean flag = true;
		if(!(num>=0 && num <=100)) {
			System.out.println(num+"=> 점수가 유효하지 않습니다.");
			flag= false;
		}
		return flag;
		
	}
	public void print() {
		System.out.printf("%s,%.2f,%s %n" ,name,(kor+eng+math)/3.,getGrade());
	
	}
}
