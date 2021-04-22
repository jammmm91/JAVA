import java.util.Random;
import java.util.Scanner;

public class GameManager {
	public void play() {
		Player[] player = {new PlayerType1("매"), new PlayerType1("닭"), new PlayerType1("오리"), new PlayerType2("참새"), new PlayerType1("독수리")};
		Player[] enemy = {new PlayerType1("정어리"), new PlayerType1("참치"), new PlayerType1("광어"), new PlayerType1("망둥어"), new PlayerType2("고래")};
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 999999; i++) {
			System.out.println("\n\n" + (i + 1) + "턴\n");
			// 플레이어 턴
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (player[playerIndex].isLive()) {
					player[playerIndex].action(player, enemy);
				}
			}
			// 적 턴
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				if (enemy[enemyIndex].isLive()) {
					enemy[enemyIndex].action(enemy, player);
				}
			}
			// 게임 종료 여부 확인
			boolean isPlayerLive = false;
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (player[playerIndex].isLive()) {
					isPlayerLive = true;
				}
			}
			boolean isEnemyLive = false;
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				if (enemy[enemyIndex].isLive()) {
					isEnemyLive = true;
				}
			}
			if (isPlayerLive && !isEnemyLive) {
				System.out.println("플레이어 승리");
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("적 승리");
				break;
			}
			
			System.out.println("턴을 진행하실려면 엔터를 누르세요");
			scanner.nextLine();
		}
	}
}
