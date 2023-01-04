package feGameVer2;

public class Dark extends MagicWeap {
	public void three_way_relation(Weapon o) {
		if(o instanceof Nature) {
			this.power+=1;
			this.accuracy+=10;
		}
	}
	public void three_way_relation_back(Weapon o) {
		if(o instanceof Nature) {
			this.power-=1;
			this.accuracy-=10;
		}
	}
	public Dark(String name,int power,int weight, int accurecy, int critical,int range) {
		super(name,power,weight,accurecy,critical,range);
	}
}

