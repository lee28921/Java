package confrim.ch06;

public class MemberService {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public MemberService() {}
	
	//로그인 기능
	public boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
		
	}
	public void logout(String id) {
		id.equals("hong");
		System.out.println(id+"님이 로그아웃하였습니다");
	}
	
	public void show() {
		System.out.println("이름 : "+this.name);
		System.out.println("아이디 : "+this.id);
	}
}
