package feGameVer2.weapon;

public class Sword extends PhysicsWeap{
	//	武器相性補正メソッド
	public void three_way_relation(Weapon o) {
		if(o instanceof Axe) {
			this.power+=1;
			this.accuracy+=10;
		}
	}
	public void three_way_relation_back(Weapon o) {
		if(o instanceof Axe) {
			this.power-=1;
			this.accuracy-=10;
		}
	}

	public Sword(String name,int power,int weight, int accurecy, int critical,int range) {
		super(name,power,weight,accurecy,critical,range);
	}
}

