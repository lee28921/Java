package confrim.ch07;

// 부모 클래스
class Parent {
	public String name;
	
	
	public Parent(String name) {
		this.name = name;
	}
}

// 자식 클래스
class Child extends Parent {
	public int studentNo;

	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
		
	}
	
	
}

public class Test6 {
	
}
