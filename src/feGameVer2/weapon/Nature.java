package feGameVer2.weapon;

public class Nature extends MagicWeap{
	public void three_way_relation(Weapon o) {
		//武器相性調整メソッド
		if(o instanceof Light) {
			//相手の武器が光の時は有利攻撃力+1、命中+10
			this.power+=1;
			this.accuracy+=10;
		}
	}
	//戦闘終了時値をもとに戻すメソッド
	public void three_way_relation_back(Weapon o) {
		if(o instanceof Light) {
			this.power-=1;
			this.accuracy-=10;
		}
	}
	public Nature(String name,int power,int weight, int accurecy, int critical,int range) {
		super(name,power,weight,accurecy,critical,range);
	}
}

