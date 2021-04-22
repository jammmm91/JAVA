import java.util.Random;

public class Boss extends Base {
	public Boss(String name) {
			this.hp = 100;
			this.power = 10;
			this.name = name;
		}
		
		public void attack(Base Tanker) {
			
			int damage = this.power - Tanker.defense;
			Tanker.hp = Tanker.hp - damage;
			
			Random r = new Random();
			int random = r.nextInt(5);
			
			if (random == 0) {
				damage = damage * 3;
			} else {
				damage = damage * 1;
			}
			
			System.out.println(this.name + "가 " + Tanker.name + "에게 " + damage + "의 피해를 입혔다.");
			if (!Tanker.isLive()) {
				System.out.println(this.name +"가 " + Tanker.name + " 를 파괴했다.");
			}
		}

	}



