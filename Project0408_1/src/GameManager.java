import java.util.Random;

public class GameManager {
	public void play() {
		Tanker tanker = new Tanker("잼아저씨");
		Boss boss = new Boss("피카츄");
		
		Random r = new Random();
		for (int i = 1; i < 999999; i++) {
			System.out.println("\n" + "Round" + i + "\n");
			// 플레이어 턴
			if (tanker.isLive() && boss.isLive()) {
				tanker.attack(boss);
				}
			
			// 적 턴
			if (boss.isLive() && tanker.isLive()) {
				boss.attack(tanker);
				}
			
			// 게임 종료 여부 확인
			boolean istankerLive = false;
					if (tanker.isLive()) {
					istankerLive = true;
			}
			boolean isbossLive = false;
					if (boss.isLive()) {
					isbossLive = true;
				}
			
			if (istankerLive && !isbossLive) {
				System.out.println("잼아저씨 승리");
				break;
			} else if (!istankerLive && isbossLive) {
				System.out.println("피카츄 승리");
				break;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

	
