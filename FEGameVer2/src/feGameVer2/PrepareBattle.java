package feGameVer2;

import java.util.Scanner;

public class PrepareBattle {

	public Fighter chooseCharacter(Fighter f) {
		System.out.println("クラスの選択");
		System.out.println("番号を入力してください");
		System.out.println("1:パラディン、2：ジェネラル、3：ウォーリアー");
		System.out.println("4:ファルコンナイト、5：バーサーカー、6：ソードマスター");
		System.out.println("7:スナイパー、8:ドラゴンマスター、9：ドルイド");
		System.out.println("10:勇者、11:遊牧騎兵、12：賢者、13：司祭、14：ヴァルキュリア");
		System.out.println("↓");
		int c_Num=new Scanner(System.in).nextInt();
		if(c_Num==1) {
			f= new Paladin();
		}
		if(c_Num==2) {
			f=new General();
		}
		if(c_Num==3) {
			f=new Warrior();
		}
		if(c_Num==4) {
			f=new FalconKnight();
		}
		if(c_Num==5) {
			f=new Berserker();
		}
		if(c_Num==6) {
			f=new SwordMaster();
		}
		if(c_Num==7) {
			f=new Sniper();
		}
		if(c_Num==8) {
			f=new DragonMaster();
		}
		if(c_Num==9) {
			f=new Druid();
		}
		if(c_Num==10) {
			f=new Hero();
		}
		if(c_Num==11) {
			f=new NomadicCavalry();
		}
		if(c_Num==12) {
			f=new Sage();
		}
		if(c_Num==13) {
			f=new Bishop();
		}
		if(c_Num==14) {
			f=new Valkyria();
		}
		System.out.print("名前を入力してください→");
		String p1Name=new Scanner(System.in).nextLine();
		f.name=p1Name;
		return f;
	}
	public void upperPara(Fighter f) {
		System.out.println("好きなパラメーターを二つ選んでください");
		System.out.println("1:HP、2:力、3：技、4：速さ、5：守備、６：魔防、7：幸運、8：体格");
		//一つ目のパラメーター
		int statusP1_Num1=new Scanner(System.in).nextInt();
		if(statusP1_Num1==1) {
			f.hp*=1.2;
		}
		if(statusP1_Num1==2) {
			f.strength*=1.2;
		}
		if(statusP1_Num1==3) {
			f.skill*=1.2;
		}
		if(statusP1_Num1==4) {
			f.speed*=1.2;
		}
		if(statusP1_Num1==5) {
			f.defence*=1.2;
		}
		if(statusP1_Num1==6) {
			f.resist*=1.2;
		}
		if(statusP1_Num1==7) {
			f.luck*=1.2;
		}
		if(statusP1_Num1==8) {
			f.constitution*=1.2;
		}
		//二つ目のパラメーター
		int statusP1_Num2=new Scanner(System.in).nextInt();
		if(statusP1_Num2==1) {
			f.hp*=1.2;
		}
		if(statusP1_Num2==2) {
			f.strength*=1.2;
		}
		if(statusP1_Num2==3) {
			f.skill*=1.2;
		}
		if(statusP1_Num2==4) {
			f.speed*=1.2;
		}
		if(statusP1_Num2==5) {
			f.defence*=1.2;
		}
		if(statusP1_Num2==6) {
			f.resist*=1.2;
		}
		if(statusP1_Num2==7) {
			f.luck*=1.2;
		}
		if(statusP1_Num2==8) {
			f.constitution*=1.2;
		}
	}
	public void downerPara(Fighter f) {
		
	}
	
}
