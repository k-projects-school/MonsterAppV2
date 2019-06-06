package be.my_portfolio.monster_app;

public class Entity {
	private String name, type;
	
	private int hp, 
				maxHp, 
				lvl = 1, 
				exp = 0, 
				expNeededToLvlUp;
	
	private double power;
	
	@SuppressWarnings("unused")
	private Pouch pouch = new Pouch();
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the maxHp
	 */
	public int getMaxHp() {
		return maxHp;
	}

	/**
	 * @param maxHp the maxHp to set
	 */
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	/**
	 * @return the lvl
	 */
	public int getLvl() {
		return lvl;
	}

	/**
	 * @param lvl the lvl to set
	 */
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}

	/**
	 * @return the expNeededToLvlUp
	 */
	public int getExpNeededToLvlUp() {
		return expNeededToLvlUp;
	}

	/**
	 * 
	 */
	public void setExpNeededToLvlUp() {
		this.expNeededToLvlUp = (500 * lvl) + exp;
	}

	/**
	 * @return the power
	 */
	public double getPower() {
		return power;
	}

	/**
	 * 
	 */
	public void setPower() {
		
	}
}
