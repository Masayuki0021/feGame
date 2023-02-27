package feGameVer2.gameMode;


import java.util.Scanner;

import feGameVer2.ChooseGameMode;
import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class GameMode1 {

	public void playGameMode1() throws InterruptedException {
		//ランダムゲーム
		System.out.println("このゲームモードではランダムに2体のキャラクターを生成し,戦わせます");

		PrepareBattle pb =new PrepareBattle();
		Fighter p1=null;
		Fighter p2=null;

		Thread.sleep(1000);
		System.out.println("キャラクター1はこちら！");
		p1=pb.chooseCharacterRandom(p1);
//		pb.putName(p1);
		p1=pb.equipFighterBack(p1);

		Thread.sleep(1000);
		System.out.println("キャラクター2はこちら！");
		p2=pb.chooseCharacterRandom(p2);
//		pb.putName(p2);
		p2=pb.equipFighterBack(p2);



		Thread.sleep(5000);

		BattleField b=new BattleField(p1,p2);
		while(p1.getHp()>0&&p2.getHp()>0) {
			b.BattleSet(p1, p2,b);
		}
		if(p1.getHp()<=0) {
			System.out.println(p2.getName()+"の勝利！！！");
		}
		if(p2.getHp()<=0) {
			System.out.println(p1.getName()+"の勝利！！！");
		}
		System.out.println("続ける? 1:yes 2:no  番号を入力して下さい");
		try {
			int contiNum=new Scanner(System.in).nextInt();

			pb.setYesNoNum(contiNum);
		}catch(IllegalArgumentException e){
			System.out.println("1か2を入力してください");
			int	contiNum=new Scanner(System.in).nextInt();

			while((contiNum>2||contiNum<1)) {
				System.out.println("1か2を入力してください");
				contiNum=new Scanner(System.in).nextInt();
			}
			pb.setYesNoNum(contiNum);
		}
		while(pb.getYesNoNum()==1) {
			p1.setHp(p1.getMaxHp());
			p2.setHp(p2.getMaxHp());
			while(p1.getHp()>0&&p2.getHp()>0) {
				b.BattleSet(p1, p2,b);
			}
			if(p1.getHp()<=0) {
				System.out.println(p2.getName()+"の勝利！！！");
			}
			if(p2.getHp()<=0) {
				System.out.println(p1.getName()+"の勝利！！！");
			}
			System.out.println("続ける? 1:yes 2:no  番号を入力して下さい");
			try {
				int contiNum=new Scanner(System.in).nextInt();

				pb.setYesNoNum(contiNum);
			}catch(IllegalArgumentException e){
				System.out.println("1か2を入力してください");
				int	contiNum=new Scanner(System.in).nextInt();

				while((contiNum>2||contiNum<1)) {
					System.out.println("1か2を入力してください");
					contiNum=new Scanner(System.in).nextInt();
				}
				pb.setYesNoNum(contiNum);
			}
		}
		System.out.println("メインメニューに戻ります。");
		Thread.sleep(1000);
		ChooseGameMode.chooseGameMode();


	}
}


