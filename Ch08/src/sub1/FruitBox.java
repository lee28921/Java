package sub1;

// 타입을 제대로 정하지 않아 추상 클래스
public class FruitBox<T> {

	private T fruit;

	public T getFruit(){
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
