package be.my_portfolio.monster_app;

public final class Blueprints {
	/**
	 * All types of useables.
	 */
	public static final String 		HEART 		= "heart", 
									APPLE 		= "apple", 
									MUSHROOM 	= "mushroom",
									WATER 		= "water",
									BLOOD 		= "blood",
									HERBS 		= "herbs",
									FEATHERS 	= "feathers",
									FANG		= "fang",
									STICK		= "stick",
									ROPE		= "rope",
									ROCK		= "rock",
									IRON_ORE	= "iron ore",
									JUWELS		= "juwels",
									GUN_POWDER	= "gun powder",
									BERRIES		= "berries",
									FUR			= "fur";

	/**
	 * All blueprints.
	 */
	public static final String[] 	HEALTH_POTION 	= {},
									MANA_POTION 	= {},
									STRENGTH_POTION = {},
									GUN				= {IRON_ORE, STICK, GUN_POWDER},
									BOW				= {STICK, ROPE},
									SWORD			= {IRON_ORE, STICK, JUWELS},
									DAGGERS			= {IRON_ORE, STICK},
									ARROWS			= {ROCK, STICK, ROPE, FEATHERS};
}
