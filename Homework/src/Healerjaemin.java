import java.util.Random;

public class HealerJaemin extends Player1 {
	public Healerjaemin(String name) {

		// Player [] player = {new Healerjaemin("잼아저씨")}

		this.hp = 80;
		this.power = 10;
		this.name = name;
		this.defense = 2;
		this.mp = 0;
	}

	public void attack(Base enemy) {

		int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;

		Random r = new Random();
		int random = r.nextInt(3);

		if (random == 0) {
			damage = damage * 2;
			System.out.println("★★★힐러도쎄다잉?★★★ " + this.name + " 가 " + enemy.name + " 에게 " + damage + "의 피해를 입혔다.");

		} else {
			damage = damage * 1;
			System.out.println("널! 죽여버리겠다 " + this.name + " 가 " + enemy.name + " 에게 " + damage + "의 피해를 입혔다.");
		}

		if (!enemy.isLive()) {
			System.out.println(this.name + " 은 " + enemy.name + " 를 부셔버렸다.");
		}
	}

	public void healing(Base enemy) {

	}

}
