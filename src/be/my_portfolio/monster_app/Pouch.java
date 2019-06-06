package be.my_portfolio.monster_app;

import java.util.*;

public class Pouch {
	private HashMap<Integer, Object> items = new HashMap<Integer, Object>();
	
	public void storeItem(Object item) {
		this.items.put(this.items.size(), item);
	}
	
	public Object useItem(Object item) {
		Iterator<Map.Entry<Integer, Object>> iterator = this.items.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Object> entry = iterator.next();
			Object value = entry.getValue();
			
			if (value instanceof Potion) {
				this.usePotion(item);
			}
			
			else if (value instanceof Weapon) {
				this.removeWeapon(item);
			}
			
			else {
				System.out.println("oeps");
			}
		}
		
		return true;
	}

	private void removeWeapon(Object item) {
		System.out.println("weapon");
	}

	private void usePotion(Object item) {
		System.out.println("potion");
	}
}
