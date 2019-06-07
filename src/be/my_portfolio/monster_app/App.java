package be.my_portfolio.monster_app;

public class App {

	public static void main(String[] args) {
		Pouch pouch = new Pouch();
		Potion potion = new Potion();
		potion.setType("health");
		potion.setVolume(10);
		
		Weapon weapon = new Weapon();

		pouch.storeItem(potion);
		pouch.storeItem(weapon);
		pouch.storeItem(weapon);
		pouch.storeItem(weapon);
		pouch.storeItem(weapon);
		pouch.storeItem(weapon);

		System.out.println(pouch.getItems().size());
		pouch.useItem(potion);
		System.out.println(pouch.getItems().size());

	}

}
