
public abstract class Base {
	int hp;
	int power;
	int defense;
	String name;
	String type;
	
	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		return true;
	}
	
	public abstract void action(Base[] player, Base[] enemy);
}
