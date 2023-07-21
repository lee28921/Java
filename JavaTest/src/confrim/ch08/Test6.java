package confrim.ch08;

interface Soundable {
	public String sound();
	
}

class Cat implements Soundable {
	
	public String sound() {
		String cat = "야옹";
		return cat;
	}
	
}
class Dog implements Soundable {
	
	public String sound() {
		return "멍멍";
	}
}

public class Test6 {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
	}
}
