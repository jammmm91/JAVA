
public class PlayerType1 extends Player { 
	public PlayerType1(String name) {
		this.hp = 20;
		this.power = 10;
		this.name = name;
	}
	
		public void attack(Base enemy) {
		int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;
		
		System.out.println(this.name + "은(는) " + enemy.name + "에게 " + damage + "의 피해를 입혔다.");
		if (!enemy.isLive()) {
			System.out.println(this.name +"은(는)" + enemy.name + "을(를) 파괴했다.");
		}
	}

}
