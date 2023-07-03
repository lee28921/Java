package sub3;

public class Add {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	//동기화 처리가 필요없다
	public void setNum(int num) {
		this.num += num;
	}
}
