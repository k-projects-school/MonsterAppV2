package be.my_portfolio.monster_app;

public class Potion implements Pouchable {
	private final static String MANA = "mana",
								HEALTH = "health";
	private String type;
	private Entity owner;
	private int volume;

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
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void use() {
		switch (this.type) {
		case HEALTH:
			this.useHealthPotion();
			break;
		case MANA:
			this.useManaPotion();
			break;
		}
	}

	private void useManaPotion() {
		this.owner.restoreMp(this.volume);
	}

	private void useHealthPotion() {
		System.out.println("Potion used and restored " + this.volume + "hp");
		this.owner.heal(this.volume);
	}
}
