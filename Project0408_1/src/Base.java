public class Base {
	int hp;
	int power;
	int defense;
	String name;
	
	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		return true;
	}
	
	
	
}
