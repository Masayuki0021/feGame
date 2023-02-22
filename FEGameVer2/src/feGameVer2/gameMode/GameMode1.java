package feGameVer2;


import java.util.Scanner;

import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class Main2 {
	public static void main(String[]args) throws InterruptedException {
		//ランダムゲーム

		PrepareBattle pb =new PrepareBattle();
		Fighter p1=null;
		Fighter p2=null;
		Fighter p3=null;
		Fighter p4=null;


		p1=pb.chooseCharacterRandom(p1);
//		pb.putName(p1);
		p1=pb.equipFighterBack(p1);

		p2=pb.chooseCharacterRandom(p2);
//		pb.putName(p2);
		p2=pb.equipFighterBack(p2);

		System.out.println("名前\t\t"+p1.getName()+"\t\t\t\t\t"+p2.getName());
		System.out.println("クラス\t"+p1.getCName()+"\t\t\t\t"+p2.getCName());
		System.out.println("HP\t\t"+p1.getHp()+"\t\t\t\t\t"+p2.getHp());
		System.out.println("力\t\t"+p1.getStrength()+"\t\t\t\t\t"+p2.getStrength());
		System.out.println("技\t\t"+p1.getSkill()+"\t\t\t\t\t"+p2.getSkill());
		System.out.println("速さ\t"+p1.getSpeed()+"\t\t\t\t\t"+p2.getSpeed());
		System.out.println("守備\t"+p1.getDefence()+"\t\t\t\t\t"+p2.getDefence());
		System.out.println("魔防\t"+p1.getResist()+"\t\t\t\t\t"+p2.getResist());
		System.out.println("幸運\t"+p1.getLuck()+"\t\t\t\t\t"+p2.getLuck());
		System.out.println("体格\t"+p1.getConstitution()+"\t\t\t\t\t"+p2.getConstitution());
		System.out.println("武器\t"+p1.getEquip().getName()+"\t\t\t\t\t"+p2.getEquip().getName());
		System.out.println();


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

			pb.setContinueNum(contiNum);
		}catch(IllegalArgumentException e){
			System.out.println("1か2を入力してください");
			int	contiNum=new Scanner(System.in).nextInt();

			while((contiNum>2||contiNum<1)) {
				System.out.println("1か2を入力してください");
				contiNum=new Scanner(System.in).nextInt();
			}
			pb.setContinueNum(contiNum);
		}
		while(pb.getContiueNum()==1) {
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

				pb.setContinueNum(contiNum);
			}catch(IllegalArgumentException e){
				System.out.println("1か2を入力してください");
				int	contiNum=new Scanner(System.in).nextInt();

				while((contiNum>2||contiNum<1)) {
					System.out.println("1か2を入力してください");
					contiNum=new Scanner(System.in).nextInt();
				}
				pb.setContinueNum(contiNum);
			}
		}
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


