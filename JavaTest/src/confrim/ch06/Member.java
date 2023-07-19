package confrim.ch06;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;

	}
	
	//로그인 기능
	public boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
		
	}
	public void logout() {
		
	}
	
	public void show() {
		System.out.println("이름 : "+this.name);
		System.out.println("아이디 : "+this.id);
	}
}
