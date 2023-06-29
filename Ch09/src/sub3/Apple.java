package sub3;

import java.io.Serializable;

public class Apple implements Serializable {
	// 직렬화된 객체 버전 관리를 위하여 사용되는 역할
	private static final long serialVersionUID = 1L;
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
		
	}
}
