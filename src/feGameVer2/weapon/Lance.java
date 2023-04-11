package feGameVer2.weapon;

public class Lance extends PhysicsWeap {
	//武器相性調整メソッド
	public void three_way_relation(Weapon o) {
		//相手の武器が剣の時は有利攻撃力+1、命中+10
		if(o instanceof Sword) {
			this.power+=1;
			this.accuracy+=10;
		}
	}
	//戦闘終了時値をもとに戻すメソッド
	public void three_way_relation_back(Weapon o) {
		if(o instanceof Sword) {
			this.power-=1;
			this.accuracy-=10;
		}
	}
	public Lance(String name,int power,int weight, int accurecy, int critical,int range) {
		super(name,power,weight,accurecy,critical,range);

	}

}
