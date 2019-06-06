package be.my_portfolio.monster_app;

public class App {

	public static void main(String[] args) {
		Pouch pouch = new Pouch();
		pouch.storeItem(new Weapon());
		pouch.storeItem(new Weapon());
		pouch.storeItem(new Weapon());
		pouch.storeItem(new Potion());
		
		pouch.useItem(new Potion());

	}

}
