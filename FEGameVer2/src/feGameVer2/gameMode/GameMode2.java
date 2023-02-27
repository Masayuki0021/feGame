package feGameVer2.gameMode;

import java.util.Scanner;

import feGameVer2.ChooseGameMode;
import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class GameMode2 {
	public void playGameMode2() throws InterruptedException {
		//2体キャラ作って対戦
		System.out.println("このゲームモードではプレイヤーは\n"
				+ "プレイヤー1とプレイヤー2に分かれて\n"
				+ "それぞれキャラメイクを行い戦わせます");
		System.out.println("");
		PrepareBattle pb =new PrepareBattle();
		Fighter p1=null;
		Fighter p2=null;

		System.out.println("プレイヤー1のキャラメイクです。");
		System.out.println();
		p1=pb.chooseCharacter(p1);
		pb.putName(p1);
		pb.upperPara(p1);
		pb.downerPara(p1);
		p1=pb.equipFighterBack(p1);
		System.out.println();

		System.out.println("プレイヤー2のキャラメイクです。");
		System.out.println();
		p2=pb.chooseCharacter(p2);
		pb.putName(p2);
		pb.upperPara(p2);
		pb.downerPara(p2);
		p2=pb.equipFighterBack(p2);
		System.out.println();

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
/*
		System.out.println("では続けて勝った方と新たなキャラでバトル！！");
		p3=pb.chooseCharacter(p3);
		pb.putName(p3);
		pb.upperPara(p3);
		pb.downerPara(p3);
		p3=pb.equipFighterBack(p3);
		if()
		while(p1.hp>0&&p3.hp>0) {
			b.BattleSet(p1, p2,b);
		}
		if(p1.hp<=0) {
			System.out.println(p2.name+"の勝利！！！");
		}
		if(p2.hp<=0) {
			System.out.println(p1.name+"の勝利！！！");
		}
	}*/




