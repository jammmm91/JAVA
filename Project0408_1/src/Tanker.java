import java.util.Random;

public class Tanker extends Base {
	public Tanker(String name) {

		// Player [] player = {new Healerjaemin("잼아저씨")}

		this.hp = 80;
		this.power = 10;
		this.name = name;
		this.defense = 2;

	}

	public void attack(Base Boss) {

		int damage = this.power - Boss.defense;
		Boss.hp = Boss.hp - damage;

		Random r = new Random();
		int random = r.nextInt(3);

		if (random == 0) {
			damage = damage * 2;
			System.out.println("♨타노스핑거스냅♨ " + this.name + "가 " + Boss.name + " 에게 " + damage + "의 피해를 입혔다.");

		} else {
			damage = damage * 1;
			System.out.println("♨진실의방으로♨ " + this.name + "가 " + Boss.name + " 에게 " + damage + "의 피해를 입혔다.");
		}

		if (!Boss.isLive()) {
			System.out.println(this.name + "가 " + Boss.name + " 를 부셔버렸다.");
		}
	}

	public void healing(Base Boss) {

	}

}
