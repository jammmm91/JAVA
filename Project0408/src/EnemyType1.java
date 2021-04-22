
public class EnemyType1 extends Enemy {
	public EnemyType1(String name) {
		this.hp = 100;
		this.power = 5;
		this.name = name;
	}

	@Override
	public void attack(Base player) {
		int damage = this.power - player.defense;
		player.hp = player.hp - damage;

		System.out.println(this.name + "은(는) " + player.name + "에게 " + damage + "의 피해를 입혔다.");
		if (!player.isLive()) {
			System.out.println(this.name + "은(는)" + player.name + "을(를) 파괴했다.");
		}
	}
}