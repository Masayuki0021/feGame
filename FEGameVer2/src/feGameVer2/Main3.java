package feGameVer2;

import java.util.Scanner;

import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class Main3 {
//2体キャラ作って対戦
	public static void main(String[] args) throws InterruptedException {
		PrepareBattle pb =new PrepareBattle();
		Fighter p1=null;
		Fighter p2=null;
		Fighter p3=null;
		Fighter p4=null;


		p1=pb.chooseCharacter(p1);
//		pb.putName(p1);
		pb.upperPara(p1);
		pb.downerPara(p1);
		p1=pb.equipFighterBack(p1);

		p2=pb.chooseCharacter(p2);
//		pb.putName(p2);
		pb.upperPara(p2);
		pb.downerPara(p2);
		p2=pb.equipFighterBack(p2);

		BattleField b=new BattleField(p1,p2);
		while(p1.hp>0&&p2.hp>0) {
			b.BattleSet(p1, p2,b);
		}
		if(p1.hp<=0) {
			System.out.println(p2.name+"の勝利！！！");
		}
		if(p2.hp<=0) {
			System.out.println(p1.name+"の勝利！！！");
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
			p1.hp=p1.MaxHP;
			p2.hp=p2.MaxHP;
			while(p1.hp>0&&p2.hp>0) {
				b.BattleSet(p1, p2,b);
			}
			if(p1.hp<=0) {
				System.out.println(p2.name+"の勝利！！！");
			}
			if(p2.hp<=0) {
				System.out.println(p1.name+"の勝利！！！");
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


