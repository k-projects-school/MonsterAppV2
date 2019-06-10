package be.my_portfolio.monster_app;

import java.util.*;

public class Pouch {
	private HashMap<Integer, Pouchable> items = new HashMap<Integer, Pouchable>();
	private int slots = 5, slotsTaken = 0;

	public HashMap<Integer, Pouchable> getItems(){
		return this.items;
	}
	
	/**
	 * @return the slots
	 */
	public int getSlots() {
		return slots;
	}

	/**
	 * @param slots the slots to set
	 */
	public void setSlots(int slots) {
		this.slots = slots;
	}

	/**
	 * @return the slotsTaken
	 */
	public int getSlotsTaken() {
		return slotsTaken;
	}

	/**
	 * @param slotsTaken the slotsTaken to set
	 */
	public void setSlotsTaken(int slotsTaken) {
		this.slotsTaken = slotsTaken;
	}

	public void storeItem(Pouchable item) {
		this.items.put(this.items.size(), item);
	}

	public Object useItem(Pouchable item) {
		Iterator<Map.Entry<Integer, Pouchable>> iterator = this.items.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Pouchable> entry = iterator.next();

			if (item.equals(entry.getValue())) {
				if (entry.getValue() instanceof Potion) {
					Potion potion = (Potion) item;
					potion.use();
					iterator.remove();
				}

				if (entry.getValue() instanceof Weapon) {
					Weapon weapon = (Weapon) item;
					weapon.use();
				}
			}
		}

		return true;
	}
}
