package sub1;

// extends Object를 작성하지 않아도 Object 클래스를 상속 받고 있다
public class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		//hashCode는 객체의 유일한 식별번호
		System.out.println("해시값 : "+hashCode());
		System.out.println("원산지 : "+this.country);
		System.out.println("가격 : "+this.price);
		return super.toString();
	}
}
