package be.my_portfolio.monster_app;

public interface Useable {
	
	/**
	 * All the types that are useable.
	 * 
	 * In the future there will be more types.
	 */
	String 	POTION = "potion",
			WEAPON = "weapon",
			FOOD = "food";
	
	String[] TYPES = {POTION, WEAPON, FOOD};
	
	/**
	 * Use the item in the pouch.
	 */
	void use();
	
	/**
	 * Sell the item in the pouch.
	 */
	void sell();
	
	/**
	 * Destroy (break is reserved...) the item in the pouch. Usually this will be used 
	 * on weapons. Weapons can break after usage but can break in useable pieces.
	 */
	void destroy();
	
	/**
	 * Mix ingredients into a potion.
	 * 
	 * @param pouchables
	 * @return
	 */
	Pouchable mix(Pouchable...pouchables);
	
	/**
	 * Build a weapon, armor or clothing with parts.
	 * 
	 * @param pouchables
	 * @return
	 */
	Pouchable build(Pouchable...pouchables);
}
