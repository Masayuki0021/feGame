package feGameVer2;

public abstract class Fighter {
	String name;
	Weapon equip=null;
	int hp;
	int strength;		//力
	int skill;			//技
	int speed;			//速さ
	int defence;		//守備
	int resist;			//魔防
	int constitution;	//体格
	int luck;			//幸運


	public abstract void changeEquip(Weapon o);
	public abstract void equipWeaponBeforeBattle();
	public String toString() {
		return "名前 "+this.name+"\n"+"HP   "+this.hp+"\n"+"力   "+this.strength+"\n"
	+"技   "+this.skill+"\n"+"速さ "+this.speed+"\n"+"守備 "+this.defence+"\n"+
				"魔防 "+this.resist+"\n"+"幸運 "+this.luck+"\n"+"体格 "+this.constitution;

	}
	public void showSt() {
		System.out.println(this.toString());
	}
	public abstract String getCName();





}