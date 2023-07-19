package confrim.ch06;

class ShopSevice {
	
	private static ShopSevice instance = new ShopSevice();
	
	public static ShopSevice geInstance() {
		return instance;
	}
	
}

public class Test18 {
	public static void main(String[] args) {
		ShopSevice obj1 = ShopSevice.geInstance();
		ShopSevice obj2 = ShopSevice.geInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
		}
		
	}
}
