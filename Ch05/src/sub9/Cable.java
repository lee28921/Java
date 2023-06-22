package sub9;

public class Cable implements Socket{ //서브 클래스

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	public void switchOn() {
		bulb.lightOn();
	}

	public void switchOff() {
		bulb.lightOff();
	}

}
