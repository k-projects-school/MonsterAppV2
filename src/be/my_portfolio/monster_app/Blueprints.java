package be.my_portfolio.monster_app;

import java.util.HashMap;

public final class Blueprints {
	/**
	 * All types of useables.
	 */
	public static final String 		/* 
									* A heart can be obtained from killing animals, they can be used to create potions
									*/
									HEART 		= "heart", 
									/*
									 * Apples can be obtained by searching, stealing or killing enemies. They are edible 
									 * and can be used to create better edibles or potions.
									 */
									APPLE 		= "apple", 
									/*
									 * Mushrooms can be obtained by searching, stealing or killing enemies. They are edible 
									 * and can be used to create better edibles or potions.
									 */
									MUSHROOM 	= "mushroom",
									/*
									 * Water can be obtained by searching, stealing or killing enemies. It is consumable 
									 * and can be used to create better edibles or potions.
									 */
									WATER 		= "water",
									/*
									* Blood can be obtained by killing animals adn can be used to create potions.
									*/
									BLOOD 		= "blood",
									/*
									* Herbs can be obtained by searching, stealing or killing enemies. They are edible 
									* and can be used to create better edibles or potions.
									*/
									HERBS 		= "herbs",
									/*
									* Feathers can be obtained by killing birds. They can be used to create wearables,
									* weapons or armor.
									*/
									FEATHERS 	= "feathers",
									/*
									* Fangs can be obtained by killing carnivorous animals. They can be used to create 
									* wearables, weapons or armor 
									*/
									FANG		= "fang",
									/*
									* Sticks can be obtained by searching or killing enemies. The can be used to create 
									* weapons, armor or can be used to create fire.
									*/
									STICK		= "stick",
									/*
									* Ropes can be obtained by searching, killing enemies or crafting. They can be used 
									* to create wearables, weapons or armor.
									*/
									ROPE		= "rope",
									/*
									* Rocks can be obtained by searching or killing enemies. They can be used to create 
									* weapons, used to throw or create a fire.
									*/
									ROCK		= "rock",
									/*
									* Iron ore can be obtained by searching or killing enemies. It can be used to craft 
									* iron.
									*/
									IRON_ORE	= "iron ore",
									/*
									* Juwellery can be obtained by searching or killing enemies. They can be used to create 
									* wearables, weapons or armor
									*/
									JUWELLERY	= "juwels",
									/*
									* Gun powder can be obtained by killing enemies. It is used to fire weapons or can be used
									* to accelerate a fire.
									*/
									GUN_POWDER	= "gun powder",
									/*
									* Berries can be obtained by searching, stealing or killing enemies. They are edible 
									* and can be used to create better edibles or potions.
									*/
									BERRIES		= "berries",
									/*
									* Fur can be obtained by searching, stealing or killing enemies. It can be used to craft 
									* wearables or armor.
									*/
									FUR			= "fur",
									/*
									* Fish can be obtained by fishing, stealing or killing enemies. They are edible 
									* and can be used to create better edibles.
									*/
									FISH		= "fish",
									/*
									* Fish oil can be obtained by fish, stealing or killing enemies. It is edible 
									* and can be used to create better edibles or potions.
									*/
									FISH_OIL	= "fish oil";

	/**
	 * All blueprints.
	 */
	public static final HashMap<Integer, HashMap<String, Craftable>>	HEALTH_POTION_SMALL = new HashMap<Integer, HashMap<String, Craftable>>(),
																		HEALTH_POTION_LARGE = new HashMap<Integer, HashMap<String, Craftable>>(),
																		HEALT_POTION_HUGE	= new HashMap<Integer, HashMap<String, Craftable>>(),
																		MANA_POTION 		= new HashMap<Integer, HashMap<String, Craftable>>(),
																		MANA_POTION_LARGE 	= new HashMap<Integer, HashMap<String, Craftable>>(),
																		MANA_POTION_HUGE	= new HashMap<Integer, HashMap<String, Craftable>>(),
																		STRENGTH_POTION 	= new HashMap<Integer, HashMap<String, Craftable>>(),
																		GUN					= new HashMap<Integer, HashMap<String, Craftable>>(),
																		BOW					= new HashMap<Integer, HashMap<String, Craftable>>(),
																		SWORD				= new HashMap<Integer, HashMap<String, Craftable>>(),
																		DAGGERS				= new HashMap<Integer, HashMap<String, Craftable>>(),
																		ARROWS				= new HashMap<Integer, HashMap<String, Craftable>>();
}
