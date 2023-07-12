package sub5;

//DAO랑 세트
public class UserVO {
	
	private String uid;
	private String name;
	private String hp;
	private int age;
		
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	
	@Override
	public String toString() {
		
		if(uid == null) { //아직 사용불가 - 보류
			return "해당하는 사용자가 없습니다.";
		}else {
			return uid+","+name+","+hp+","+age;
		}
		
	}
}
