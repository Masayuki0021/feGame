package feGameVer2;

public class Lance extends PhysicsWeap {

	public void three_way_relation(Weapon o) {
		if(o instanceof Sword) {
			this.power+=1;
			this.accuracy+=10;
			System.out.println("自分槍　相手剣");
		}
	}
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
