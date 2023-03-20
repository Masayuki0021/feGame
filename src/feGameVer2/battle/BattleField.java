package feGameVer2.battle;

import feGameVer2.fighter.Fighter;
import feGameVer2.weapon.MagicWeap;
import feGameVer2.weapon.PhysicsWeap;

public  class BattleField {

	Fighter p1;
	Fighter p2;
	//キャラクタ－1の実際に戦いに用いられる数値
	int p1attackSpeed;		//実速
	int p1ActHitRate;		//実命中率
	int p1ActPowerPhy;		//実物理威力
	int p1ActPowerMagic;	//実魔法威力
	int p1ActCritical;		//実必殺率
	int p1attacktimes;		//攻撃回数（１回or2回）

	//キャラクタ－2の実際に戦いに用いられる数値
	int p2attackSpeed;
	int p2ActHitRate;
	int p2ActPowerPhy;
	int p2ActPowerMagic;
	int p2ActCritical;
	int p2attacktimes;


	public BattleField(Fighter p1,Fighter p2) {
		this.p1=p1;
		this.p2=p2;
		//プレイヤー1	計算前要素計算
		//武器による負荷（武器の重さから体格を引いて計算される）
		int p1weaponLoad=p1.getEquip().getWeight()-p1.getConstitution();
		if(p1weaponLoad<=0) {
			p1weaponLoad=0;
		}
		//実速：自身の速さ-武器の負荷　で計算される
		this.p1attackSpeed=p1.getSpeed()-p1weaponLoad;
		//仮回避率　実速*2+幸運　で計算される
		int p1avoidRate=this.p1attackSpeed*2+p1.getLuck();
		//仮命中率　武器の命中率+技*2+幸運/2　で計算される
		int p1hitRate=p1.getEquip().getAccuracy()+p1.getSkill()*2+p1.getLuck()/2;
		//仮威力　武器威力+力　で計算される
		int p1power=p1.getStrength()+p1.getEquip().getPower();
		//仮必殺　武器必殺+技/2　で計算される
		int p1critical=p1.getEquip().getCritical()+p1.getSkill()/2;


		//プレイヤー2	計算前要素計算
		//同上
		int p2weaponLoad=p2.getEquip().getWeight()-p2.getConstitution();
		if(p2weaponLoad<=0) {
			p2weaponLoad=0;
		}
		this.p2attackSpeed=p2.getSpeed()-p2weaponLoad;
		int p2avoidRate=this.p2attackSpeed*2+p2.getLuck();
		int p2hitRate=p2.getEquip().getAccuracy()+p2.getSkill()*2+p2.getLuck()/2;
		int p2power=p2.getStrength()+p2.getEquip().getPower();
		int p2critical=p2.getEquip().getCritical()+p2.getSkill()/2;


		//p1 戦闘数値	計算
		//実命中率　仮命中率-相手の仮回避率
		this.p1ActHitRate=p1hitRate-p2avoidRate;
		if(this.p1ActHitRate<=20) {
			this.p1ActHitRate=20;
		}
		//実物理威力　自身の仮威力-相手の守備　最小値2
		this.p1ActPowerPhy=p1power-p2.getDefence();
		if(this.p1ActPowerPhy<=2) {
			this.p1ActPowerPhy=2;
		}
		//実魔法威力　自身の仮威力-相手の魔防　最小値2
		this.p1ActPowerMagic=p1power-p2.getResist();
		if(this.p1ActPowerMagic<=2) {
			this.p1ActPowerMagic=2;
		}

		//実必殺率　自身の仮必殺率-相手の幸運
		this.p1ActCritical=p1critical-p2.getLuck();

		//p2 戦闘数値	計算
		this.p2ActHitRate=p2hitRate-p1avoidRate;
		if(this.p2ActHitRate<=20) {
				this.p2ActHitRate=20;
		}
		this.p2ActPowerPhy=p2power-p1.getDefence();
		if(this.p2ActPowerPhy<=2) {
			this.p2ActPowerPhy=2;
		}
		this.p2ActPowerMagic=p2power-p1.getResist();
		if(this.p2ActPowerMagic<=2) {
			this.p2ActPowerMagic=2;
		}
		this.p2ActCritical=p2critical-p1.getLuck();


		//攻撃回数attacktimes 計算
		//２体のキャラクターの実速が４以上の違う場合、速い方は追撃することができる（攻撃回数２回）
		if(this.p1attackSpeed>(this.p2attackSpeed+4)) {
			this.p1attacktimes=2;
		}else {
			this.p1attacktimes=1;
		}
		if(this.p2attackSpeed>(this.p1attackSpeed+4)) {
			this.p2attacktimes=2;
		}else {
			this.p2attacktimes=1;
		}
	}



	//戦闘数値再計算メソッド（武器変更後使用）　武器の性能を含めて各パラメーターを再計算する
	public void reCalBattleStatus(Fighter p1,Fighter p2) {
		//プレイヤー1	計算前要素計算
		int p1weaponLoad=p1.getEquip().getWeight()-p1.getConstitution();
		if(p1weaponLoad<=0) {
			p1weaponLoad=0;
		}
		this.p1attackSpeed=p1.getSpeed()-p1weaponLoad;
		int p1avoidRate=this.p1attackSpeed*2+p1.getLuck();
		int p1hitRate=p1.getEquip().getAccuracy()+p1.getSkill()*2+p1.getLuck()/2;
		int p1power=p1.getStrength()+p1.getEquip().getPower();
		int p1critical=p1.getEquip().getCritical()+p1.getSkill()/2;
		if(p1critical>90) {p1critical=90;}
		//プレイヤー2	計算前要素計算
		int p2weaponLoad=p2.getEquip().getWeight()-p2.getConstitution();
		if(p2weaponLoad<=0) {
			p2weaponLoad=0;
		}
		this.p2attackSpeed=p2.getSpeed()-p2weaponLoad;
		int p2avoidRate=this.p2attackSpeed*2+p2.getLuck();
		int p2hitRate=p2.getEquip().getAccuracy()+p2.getSkill()*2+p2.getLuck()/2;
		int p2power=p2.getStrength()+p2.getEquip().getPower();
		int p2critical=p2.getEquip().getCritical()+p2.getSkill()/2;
		if(p2critical>90) {p2critical=90;}

		//p1 戦闘数値	計算
		this.p1ActHitRate=p1hitRate-p2avoidRate;
		if(this.p1ActHitRate<=20) {
			this.p1ActHitRate=20;
		}
		if(this.p1ActHitRate>=90)
			this.p1ActHitRate=90;
		this.p1ActPowerPhy=p1power-p2.getDefence();
		if(this.p1ActPowerPhy<=2) {
			this.p1ActPowerPhy=2;
		}
		this.p1ActPowerMagic=p1power-p2.getResist();
		if(this.p1ActPowerMagic<=2) {
			this.p1ActPowerMagic=2;
		}

		this.p1ActCritical=p1critical-p2.getLuck();
		if(this.p1ActCritical<0) {this.p1ActCritical=0;}

		//p2 戦闘数値	計算
		this.p2ActHitRate=p2hitRate-p1avoidRate;
		if(this.p2ActHitRate<=20) {
				this.p2ActHitRate=20;
		}
		if(this.p2ActHitRate>90) {
			this.p2ActHitRate=90;
		}
		this.p2ActPowerPhy=p2power-p1.getDefence();
		if(this.p2ActPowerPhy<=2) {
			this.p2ActPowerPhy=2;
		}
		this.p2ActPowerMagic=p2power-p1.getResist();
		if(this.p2ActPowerMagic<=2) {
			this.p2ActPowerMagic=2;
		}
		this.p2ActCritical=p2critical-p1.getLuck();
		if(this.p2ActCritical<0) {this.p2ActCritical=0;}

	}

	//実際の戦闘メソッド①
	//互いの武器の攻撃距離が異なる場合に使われる
	//一番上に現在のそれぞれのパラメーターを表示
	//攻撃距離が異なる場合原則反撃ができない
	public void BattleTurnOneside(Fighter p1,Fighter p2) throws InterruptedException {
		System.out.println(p1.getName()+"\t\t\t\t"+p2.getName());
		System.out.println("クラス\t"+p1.getCName()+"\t\t\t\t"+p2.getCName());
		System.out.println("HP\t\t"+p1.getHp()+"\t\t\t\t\t"+p2.getHp());
		System.out.println("命中率\t"+this.p1ActHitRate+"%"+"\t\t\t\t\t"+this.p2ActHitRate+"%");
		if(p1.getEquip() instanceof PhysicsWeap&&p2.getEquip() instanceof PhysicsWeap) {
			System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.getEquip() instanceof MagicWeap&&p2.getEquip() instanceof PhysicsWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.getEquip() instanceof PhysicsWeap&&p2.getEquip() instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}else if(p1.getEquip() instanceof MagicWeap&&p2.getEquip() instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}
		System.out.println("必殺\t"+this.p1ActCritical+"%"+"\t\t\t\t\t"+this.p2ActCritical+"%");
		System.out.println("\n武器\t"+p1.getEquip().getName()+"\t\t"+p2.getEquip().getName());
		System.out.println("攻撃回数\t"+this.p1attacktimes+"回"+"\t\t\t\t"+this.p2attacktimes+"回");
		System.out.println();
		Thread.sleep(5000);





		//p1から見ての判定（p2から見ての判定は437行目記述）
		if(this.p1attackSpeed>this.p2attackSpeed) {
			System.out.println(p1.getName()+"("+p1.getCName()+")"+"が先に動いた！");
			Thread.sleep(1000);
			double rand=Math.random()*100;
	//速さが速いほうが65％の確率で、自身の攻撃距離で攻撃する、互いの攻撃距離が異なる場合、反撃されない
	//遅い方は35％の確率で行動できる（348行目記述）
			if(rand<=65) {
				System.out.println(p1.getName()+"("+p1.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p1.getHp()>0) {
					System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;
				//攻撃が命中した場合、必殺判定が行われる　必殺は通常の３倍のダメージ
					if(this.p1ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p1ActCritical>rand2) {
							//必殺が出た場合
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							//物理攻撃の場合
							if(p1.getEquip() instanceof PhysicsWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
							}//魔法攻撃の場合
							else if(p1.getEquip() instanceof MagicWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
							}
							Thread.sleep(1000);
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
							Thread.sleep(1000);
						}//必殺が出なかった場合（通常攻撃）
						else {
							//物理攻撃の場合
							if(p1.getEquip() instanceof PhysicsWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerPhy);
							}//魔法攻撃の場合
							else if(p1.getEquip() instanceof MagicWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerMagic);
							}
							Thread.sleep(1000);
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}//攻撃が外れた場合
					else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}
				//相手の武器が遠近両用だった場合（武器のrangeが3だった場合）　反撃が発生する
				//攻撃方法は同上
				if(p2.getEquip().getRange()==3) {
					Thread.sleep(1000);
					if(p2.getHp()>0) {
						System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p2.getEquip() instanceof PhysicsWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
								}else if(p2.getEquip() instanceof MagicWeap) {
									System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
									p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
								}
								Thread.sleep(1000);
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
								Thread.sleep(1000);
							}else {
								if(p2.getEquip() instanceof PhysicsWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerPhy);
								}else if(p2.getEquip() instanceof MagicWeap) {
									System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
									p1.setHp(p1.getHp() - this.p2ActPowerMagic);
								}
								Thread.sleep(1000);
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}
				}
				//自身の実速が対戦相手より４以上大きい場合　追撃が発生する

				if(this.p1attackSpeed>(this.p2attackSpeed+4)){
					if(p1.getHp()>0&&p1.getHp()>0) {
						System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の追撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p1.getEquip() instanceof PhysicsWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
								}else if(p1.getEquip() instanceof MagicWeap) {
									System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
									p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
								}
								Thread.sleep(1000);
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
								Thread.sleep(1000);
							}else {
								if(p1.getEquip() instanceof PhysicsWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerPhy);
								}else if(p1.getEquip() instanceof MagicWeap) {
									System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
									p2.setHp(p2.getHp() - this.p1ActPowerMagic);
								}
								Thread.sleep(1000);
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}
				}
			}//速さが遅い方は35％の確率で　自身の攻撃距離で攻撃する、互いの攻撃距離が異なる場合、反撃されない
			//(上記の65% 出なかった場合)
			//攻撃方法は同上
			else {
				System.out.println(p2.getName()+"("+p2.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p2.getHp()>0) {
					System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;

					if(this.p2ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p2ActCritical>rand2) {
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							if(p2.getEquip() instanceof PhysicsWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
							}else if(p2.getEquip() instanceof MagicWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
							}
							Thread.sleep(1000);
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
							Thread.sleep(1000);
						}else {
							if(p2.getEquip() instanceof PhysicsWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerPhy);
							}else if(p2.getEquip() instanceof MagicWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerMagic);
							}
							Thread.sleep(1000);
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}//相手の武器が遠近両用だった場合（武器のrangeが3だった場合）　反撃が発生する
				//攻撃方法は同上
				if(p1.getEquip().getRange()==3) {
					Thread.sleep(1000);
					if(p1.getHp()>0) {
						System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p1.getEquip() instanceof PhysicsWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
								}else if(p1.getEquip() instanceof MagicWeap) {
									System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
									p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
								}
								Thread.sleep(1000);
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
								Thread.sleep(1000);
							}else {
								if(p1.getEquip() instanceof PhysicsWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerPhy);
								}else if(p1.getEquip() instanceof MagicWeap) {
									System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
									p2.setHp(p2.getHp() - this.p1ActPowerMagic);
								}
								Thread.sleep(1000);
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}
				}
			}
			//p2から見ての判定
			//ロジックは一緒
		}else {
			System.out.println(p2.getName()+"("+p2.getCName()+")"+"が先に動いた！");
			Thread.sleep(1000);
			double rand=Math.random()*100;
			if(rand<=65) {
				System.out.println(p2.getName()+"("+p2.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p2.getHp()>0) {
					System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;

					if(this.p2ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p2ActCritical>rand2) {
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							if(p2.getEquip() instanceof PhysicsWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
							}else if(p2.getEquip() instanceof MagicWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
							}
							Thread.sleep(1000);
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
							Thread.sleep(1000);
						}else {
							if(p2.getEquip() instanceof PhysicsWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerPhy);
							}else if(p2.getEquip() instanceof MagicWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerMagic);
							}
							Thread.sleep(1000);
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}
				if(p1.getEquip().getRange()==3) {
					Thread.sleep(1000);
					if(p1.getHp()>0) {
						System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p1.getEquip() instanceof PhysicsWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
								}else if(p1.getEquip() instanceof MagicWeap) {
									System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
									p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
								}
								Thread.sleep(1000);
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
								Thread.sleep(1000);
							}else {
								if(p1.getEquip() instanceof PhysicsWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerPhy);
								}else if(p1.getEquip() instanceof MagicWeap) {
									System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
									p2.setHp(p2.getHp() - this.p1ActPowerMagic);
								}
								Thread.sleep(1000);
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}
				}
				if(this.p2attackSpeed>(this.p1attackSpeed+4)) {
					if(p2.getHp()>0&&p1.getHp()>0) {
						System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の追撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p2ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p2ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p2.getEquip() instanceof PhysicsWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
								}else if(p2.getEquip() instanceof MagicWeap) {
									System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
									p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
								}
								Thread.sleep(1000);
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
								Thread.sleep(1000);
							}else {
								if(p2.getEquip() instanceof PhysicsWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerPhy);
								}else if(p2.getEquip() instanceof MagicWeap) {
									System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
									p1.setHp(p1.getHp() - this.p2ActPowerMagic);
								}
								Thread.sleep(1000);
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}

				}
			}else {
				System.out.println(p1.getName()+"("+p1.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p1.getHp()>0) {
					System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;

					if(this.p1ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p1ActCritical>rand2) {
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							if(p1.getEquip() instanceof PhysicsWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
							}else if(p1.getEquip() instanceof MagicWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
							}
							Thread.sleep(1000);
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
							Thread.sleep(1000);
						}else {
							Thread.sleep(1000);
							if(p1.getEquip() instanceof PhysicsWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerPhy);
							}else if(p1.getEquip() instanceof MagicWeap) {
								System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
								p2.setHp(p2.getHp() - this.p1ActPowerMagic);
							}
							Thread.sleep(1000);
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}
				if(p2.getEquip().getRange()==3) {
					Thread.sleep(1000);
					if(p2.getHp()>0) {
						System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p2ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p2ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p2.getEquip() instanceof PhysicsWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
								}else if(p2.getEquip() instanceof MagicWeap) {
									System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
									p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
								}
								Thread.sleep(1000);
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
								Thread.sleep(1000);
							}else {
								if(p2.getEquip() instanceof PhysicsWeap) {
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
								p1.setHp(p1.getHp() - this.p2ActPowerPhy);
								}else if(p2.getEquip() instanceof MagicWeap) {
									System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
									p1.setHp(p1.getHp() - this.p2ActPowerMagic);
								}
								Thread.sleep(1000);
								System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
							Thread.sleep(1000);
						}
					}
				}
			}
		}
	}
		//実際の戦闘メソッド②
		//互いの武器の攻撃距離が同じ場合に使われる
		//攻撃距離が同じ場合は必ず反撃が起こる
		//一番上に現在のそれぞれのパラメーターを表示
	public void BattleTurnCounter(Fighter p1,Fighter p2) throws InterruptedException {
		System.out.println(p1.getName()+"\t\t\t\t"+p2.getName());
		System.out.println("クラス\t"+p1.getCName()+"\t\t\t\t"+p2.getCName());
		System.out.println("HP\t\t"+p1.getHp()+"\t\t\t\t\t"+p2.getHp());
		System.out.println("命中率\t"+this.p1ActHitRate+"%"+"\t\t\t\t\t"+this.p2ActHitRate+"%");
		if(p1.getEquip() instanceof PhysicsWeap&&p2.getEquip() instanceof PhysicsWeap) {
			System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.getEquip() instanceof MagicWeap&&p2.getEquip() instanceof PhysicsWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.getEquip() instanceof PhysicsWeap&&p2.getEquip() instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}else if(p1.getEquip() instanceof MagicWeap&&p2.getEquip() instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}
		System.out.println("必殺\t"+this.p1ActCritical+"%"+"\t\t\t\t\t"+this.p2ActCritical+"%");
		System.out.println("\t\t"+p1.getEquip().getName()+"\t\t\t\t"+p2.getEquip().getName());
		System.out.println("攻撃回数\t"+this.p1attacktimes+"回"+"\t\t\t\t\t"+this.p2attacktimes+"回");

		System.out.println();
		Thread.sleep(5000);



		//p1から見ての判定
		if(this.p1attackSpeed>this.p2attackSpeed) {
			System.out.println(p1.getName()+"("+p1.getCName()+")"+"が先に動いた！");
			Thread.sleep(1000);
			//攻撃
			if(p1.getHp()>0) {
				System.out.println(p1.getName()+"("+p1.getCName()+")"+"は正々堂々戦いを挑む！");
				System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の攻撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p1ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p1ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p1.getEquip() instanceof PhysicsWeap) {
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
						p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
						}else if(p1.getEquip() instanceof MagicWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
						}
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p1.getEquip() instanceof PhysicsWeap) {
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
						p2.setHp(p2.getHp() - this.p1ActPowerPhy);
						}else if(p1.getEquip() instanceof MagicWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerMagic);
						}
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
					Thread.sleep(1000);
				}
			}
			//反撃
			if(p2.getHp()>0) {
				Thread.sleep(1000);
				System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の反撃！");
				Thread.sleep(1000);
				double rand3=Math.random()*100;
				double rand4=Math.random()*100;

				if(this.p2ActHitRate>=rand3) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p2ActCritical>rand4) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p2.getEquip() instanceof PhysicsWeap) {
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
						p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
						}else if(p2.getEquip() instanceof MagicWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
						}
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p2.getEquip() instanceof PhysicsWeap) {
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
						p1.setHp(p1.getHp() - this.p2ActPowerPhy);
						}else if(p2.getEquip() instanceof MagicWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerMagic);
						}
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
					Thread.sleep(1000);
				}
			}
		}//p2から見ての判定
		else {
			System.out.println(p2.getName()+"("+p2.getCName()+")"+"が先に動いた！");
			System.out.println(p2.getName()+"("+p2.getCName()+")"+"は正々堂々戦いを挑む！");
			//攻撃
			if(p2.getHp()>0) {
				Thread.sleep(1000);
				System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の攻撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p2ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p2ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p2.getEquip() instanceof PhysicsWeap) {
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
						p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
						}else if(p2.getEquip() instanceof MagicWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
						}
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p2.getEquip() instanceof PhysicsWeap) {
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
						p1.setHp(p1.getHp() - this.p2ActPowerPhy);
						}else if(p2.getEquip() instanceof MagicWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerMagic);
						}
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
					Thread.sleep(1000);
				}
			}
			//反撃
			if(p1.getHp()>0) {
				System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の反撃！");
				Thread.sleep(1000);
				double rand3=Math.random()*100;
				double rand4=Math.random()*100;

				if(this.p1ActHitRate>=rand3) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p1ActCritical>rand4) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p1.getEquip() instanceof PhysicsWeap) {
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
						p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
						}else if(p1.getEquip() instanceof MagicWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
						}
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p1.getEquip() instanceof PhysicsWeap) {
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
						p2.setHp(p2.getHp() - this.p1ActPowerPhy);
						}else if(p1.getEquip() instanceof MagicWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerMagic);
						}
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
					Thread.sleep(1000);
				}
			}
		}
		//p1の追撃
		if(this.p1attackSpeed>(this.p2attackSpeed+4)){
			if(p1.getHp()>0&&p2.getHp()>0) {
				System.out.println("\n"+p1.getName()+"("+p1.getCName()+")"+"の追撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p1ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p1ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p1.getEquip() instanceof PhysicsWeap) {
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
						p2.setHp(p2.getHp() - this.p1ActPowerPhy*3);
						}else if(p1.getEquip() instanceof MagicWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerMagic*3);
						}
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p1.getEquip() instanceof PhysicsWeap) {
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
						p2.setHp(p2.getHp() - this.p1ActPowerPhy);
						}else if(p1.getEquip() instanceof MagicWeap) {
							System.out.println(p2.getName()+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
							p2.setHp(p2.getHp() - this.p1ActPowerMagic);
						}
						Thread.sleep(1000);
						System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p2.getName()+"("+p2.getCName()+")"+"のHPは"+p2.getHp()+"!\n");
					Thread.sleep(1000);
				}
			}
		}
		//p2の追撃
		if(this.p2attackSpeed>(this.p1attackSpeed+4)) {
			if(p2.getHp()>0&&p1.getHp()>0) {
				System.out.println("\n"+p2.getName()+"("+p2.getCName()+")"+"の追撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p2ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p2ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p2.getEquip() instanceof PhysicsWeap) {
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
						p1.setHp(p1.getHp() - this.p2ActPowerPhy*3);
						}else if(p2.getEquip() instanceof MagicWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerMagic*3);
						}
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p2.getEquip() instanceof PhysicsWeap) {
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
						p1.setHp(p1.getHp() - this.p2ActPowerPhy);
						}else if(p2.getEquip() instanceof MagicWeap) {
							System.out.println(p1.getName()+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
							p1.setHp(p1.getHp() - this.p2ActPowerMagic);
						}
						Thread.sleep(1000);
						System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p1.getName()+"("+p1.getCName()+")"+"のHPは"+p1.getHp()+"!\n");
					Thread.sleep(1000);
				}
			}

		}

	}

	//戦闘ターン中の行動を記述
	//攻撃メソッドの選択、武器の持ち替え、再計算を行う
	public void BattleSet(Fighter p1,Fighter p2,BattleField b) throws InterruptedException {
		System.out.println("ターン開始！");
		//戦闘ターン開始
		//p1視点から判定
		//実速が高い方が65％の確率で相手に有利な武器に持ち替える
		if(this.p1attackSpeed>this.p2attackSpeed) {
			double rand=Math.random();
			if(rand<0.65) {
				System.out.println(p1.getName()+"は武器を選びなおしている！！");
				Thread.sleep(1000);
				//武器持ち替えメソッド
				p1.changeEquip(p2.getEquip());
				System.out.println();
				Thread.sleep(1000);
			}
			//遅い方: 35％の確率で武器を持ち替える
			else {
				System.out.println(p2.getName()+"は武器を選びなおしている！！");
				Thread.sleep(1000);
				//武器持ち替えメソッド
				p2.changeEquip(p1.getEquip());
				System.out.println();
				Thread.sleep(1000);
			}
			//武器相性　加算メソッド
			//有利なら威力+1命中+10、不利なら威力-1命中-10
			p1.getEquip().three_way_relation(p2.getEquip());
			p2.getEquip().three_way_relation(p1.getEquip());
			//再計算メソッド
			b.reCalBattleStatus(p1, p2);
			//実戦メソッド呼び出し
			//攻撃距離（武器依存）が異なる場合BattleTurnOnesideを
			//					同じ場合BattleTurnCounterを呼び出す

			if(p1.getEquip().getRange()==1){
				if(p2.getEquip().getRange()==2) {
					b.BattleTurnOneside(p1, p2);
				}else {
					//武器距離（range==3）は遠近両様のためここに入る
					b.BattleTurnCounter(p1, p2);
				}
			}
			if(p1.getEquip().getRange()==2) {
				if(p2.getEquip().getRange()==1) {
					b.BattleTurnOneside(p1, p2);
				}else {
					//武器距離（range==3）は遠近両様のためここに入る
					b.BattleTurnCounter(p1, p2);
				}
			}
			if(p1.getEquip().getRange()==3) {
				if(p2.getEquip().getRange()==3) {
					b.BattleTurnCounter(p1, p2);
				}else
					b.BattleTurnOneside(p1, p2);
			}
			//戦闘終了　武器相性の値を元に戻す
			p1.getEquip().three_way_relation_back(p2.getEquip());
			p2.getEquip().three_way_relation_back(p1.getEquip());
			//能力再計算
			b.reCalBattleStatus(p1, p2);
			//戦闘ターン終了
			//以下これをどちらかのhpが0になるまで繰り返す

		}else {
			//p2視点から判定　（ロジックは同上）
			double rand=Math.random();
			if(rand<0.65) {
				System.out.println(p2.getName()+"は武器を選びなおしている！！");
				Thread.sleep(1000);
				p2.changeEquip(p1.getEquip());
				Thread.sleep(1000);
			}else {
				System.out.println(p1.getName()+"は武器を選びなおしている！！");
				Thread.sleep(1000);
				p1.changeEquip(p2.getEquip());

				Thread.sleep(1000);
			}
				p1.getEquip().three_way_relation(p2.getEquip());
				p2.getEquip().three_way_relation(p1.getEquip());
				b.reCalBattleStatus(p1, p2);
				if(p2.getEquip().getRange()==1){
					if(p1.getEquip().getRange()==2) {
						b.BattleTurnOneside(p1, p2);
					}else {
						b.BattleTurnCounter(p1, p2);
					}
				}
				if(p2.getEquip().getRange()==2) {
					if(p1.getEquip().getRange()==1) {
						b.BattleTurnOneside(p1, p2);
					}else {
						b.BattleTurnCounter(p1, p2);
					}
				}
				if(p2.getEquip().getRange()==3) {
					if(p1.getEquip().getRange()==3) {
						b.BattleTurnCounter(p1, p2);
					}else
						b.BattleTurnOneside(p1, p2);
				}
				p1.getEquip().three_way_relation_back(p2.getEquip());
				p2.getEquip().three_way_relation_back(p1.getEquip());
				b.reCalBattleStatus(p1, p2);
				System.out.println("ターン終了！");

		}
	}
}

