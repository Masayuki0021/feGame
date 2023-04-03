package feGameVer2;

import java.util.Scanner;

public class SetGameModeNumber {

	static int gameNum;
	public int setGameModeNumbere() {
		try {
			System.out.println("ゲームモードを選んでください↓");
			System.out.println("1: ランダムゲームモード");
			System.out.println("2: P1vsP2モード");
			System.out.println("3: 勝ち抜けモード");
			int gameNum=new Scanner(System.in).nextInt();
			checkNumber(gameNum);
		}catch(IllegalArgumentException e){
			System.out.println("1～3までの数字が入力されていません\n"
					+ "正しい数字を入力してください");
			int	gameNum=new Scanner(System.in).nextInt();

			while((gameNum<1||gameNum>3)) {
				System.out.println("1～3までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
				gameNum=new Scanner(System.in).nextInt();
			}
			checkNumber(gameNum);

		}
		return gameNum;
	}
	public void checkNumber(int num) {
		if(num<1||num>3) {
			throw new IllegalArgumentException("1～3の中から選択してください");
		}
		gameNum=num;
	}
}
