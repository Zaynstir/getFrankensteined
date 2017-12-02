import java.util.ArrayList;

public class CharacterSheet {

	private String name;
	private Race race;
	private Background background;
	private Class[] classes;
	private Spell[] spells;
	private Feat[] feats;
	private ArrayList<Item> items;
	private int maxHealth;
	private int exp;
	private int lvl;
	private int str;
	private int dex;
	private int con;
	private int intelligence;
	private int wis;
	private int cha;

	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int exp, int l, int str, int dex, int con, int inte, int wis, int cha, int max) {
		name = n;
		race = r;
		classes = c;
		spells = s;
		feats = f;
		items = i;
		this.exp = exp;
		lvl = l;
		this.str = str;
		this.dex = dex;
		this.con = con;
		intelligence = inte;
		this.wis = wis;
		this.cha = cha;
		maxHealth = classes[0].getHealth();
	}

	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i) {
		name = n;
		race = r;
		classes = c;
		spells = s;
		feats = f;
		items = i;
		exp = 0;
		lvl = 1;
		Dice d = new Dice();
		str = d.roll("3d6") + race.getStrMod();
		dex = d.roll("3d6") + race.getDexMod();
		con = d.roll("3d6") + race.getConMod();
		intelligence = d.roll("3d6") + race.getIntMod();
		wis = d.roll("3d6") + race.getWisMod();
		cha = d.roll("3d6") + race.getChaMod();
		maxHealth = classes[0].getHealth() + con;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race r) {
		race = r;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background b) {
		background = b;
	}

	public Class[] getClasses() {
		return classes;
	}

	public void setClasses(Class[] c) {
		classes = c;
	}

	public Feat[] getFeat() {
		return feats;
	}

	public void setFeat(Feat[] f) {
		feats = f;
	}

	public ArrayList<Item> getItems(){
		return items;
	}

	public void setItems(ArrayList<Item> i) {
		items = i;
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public void removeItem(Item i) {
		for(int k = 0; k < items.size(); k++) {
			if(items.get(k).getName() == i.getName()) {
				items.remove(k);
				break;
			}
		}
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int e) {
		exp = e;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int l) {
		lvl = l;
	}

	public int getStr() {
		return this.str;
	}

	public int getDex() {
		return this.dex;
	}

	public int getCon() {
		return this.con;
	}

	public int getInt() {
		return this.intelligence;
	}

	public int getWis() {
		return this.wis;
	}

	public int getCha() {
		return this.cha;
	}

	public int getMaxHealth() {
		return this.maxHealth;
	}

	public Spell[] getSpells() {
		return this.spells;
	}

	public Feat[] getFeats() {
		return this.feats;
	}
}
//
//
//import java.util.ArrayList;
//
//public class CharacterSheet {
//
//	private String name;
//	private Race race;
//	private Background background;
//	private Class[] classes;
//	private Spell[] spells;
//	private Feat[] feats;
//	private ArrayList<Item> items;
//	private int maxHealth;
//	private int exp;
//	private int lvl;
//	private int str;
//	private int dex;
//	private int con;
//	private int intelligence;
//	private int wis;
//	private int cha;
//
//	/**
//	 * CharacterSheet() 15-arg constructor
//	 * @param n: name of the CharacterSheet
//	 * @param r: Race object of the CharacterSheet
//	 * @param c: array of Class objects for the CharacterSheet
//	 * @param s: array of Spell objects to include
//	 * @param f: array of Feat objects to include
//	 * @param i: ArrayList of Item objects for the character
//	 * @param exp: amount of experience to start with
//	 * @param l: level to start with
//	 * @param str: amount of strenth to start with
//	 * @param dex: amount of dexterity to start with
//	 * @param con: amount of constituion to start with
//	 * @param inte: amount of intellegence to start with
//	 * @param wis: amount of wisdom to start with
//	 * @param cha: amount of charisma to start with
//	 * @param max: the max health that the character has to start with
//	 */
//	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int exp, int l, int str, int dex, int con, int inte, int wis, int cha, int max) {
//		name = n;
//		race = r;
//		classes = c;
//		spells = s;
//		feats = f;
//		items = i;
//		this.exp = exp;
//		lvl = l;
//		this.str = str;
//		this.dex = dex;
//		this.con = con;
//		intelligence = inte;
//		this.wis = wis;
//		this.cha = cha;
//		maxHealth = max;
//	}
//
//	/**
//	 * CharacterSheet() 7-arg constructor
//	 * @param n: name of the character
//	 * @param r: Race object for the character
//	 * @param c: array of Class objects that the CharacterSheet has
//	 * @param f: array of Feat objects that the user starts with
//	 * @param i: ArrayList of Item objects that the CharacterSheet starts with
//	 * @param max: amount of max health the character starts with
//	 * Rest of stats are generated by simulated dice rolls.
//	 */
//	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int max) {
//		name = n;
//		race = r;
//		classes = c;
//		spells = s;
//		feats = f;
//		items = i;
//		exp = 0;
//		lvl = 1;
//		Dice d = new Dice();
//		str = d.roll("3d6") + race.getStrMod() + classes[0].getStrMod();
//		dex = d.roll("3d6") + race.getDexMod() + classes[0].getDexMod();
//		con = d.roll("3d6") + race.getConMod() + classes[0].getConMod();
//		intelligence = d.roll("3d6") + race.getIntMod() + classes[0].getIntMod();
//		wis = d.roll("3d6") + race.getWisMod() + classes[0].getWisMod();
//		cha = d.roll("3d6") + race.getChaMod() + classes[0].getChaMod();
//		maxHealth = max;
//	}
//
//	/**
//	 * getName
//	 * @return name: the name of the character
//	 */
//	public String getName() {
//		return name;
//	}
//
//	/**
//	 * setName
//	 * @param n: string to set the name property to
//	 */
//	public void setName(String n) {
//		name = n;
//	}
//
//	/**
//	 * getRace
//	 * @return race: the Race object of this character
//	 */
//	public Race getRace() {
//		return race;
//	}
//
//	/**
//	 * setRace
//	 * @param r: Race object to set the characters race to
//	 */
//	public void setRace(Race r) {
//		race = r;
//	}
//
//	/**
//	 * getBackground
//	 * @return background: the Background object of the character
//	 */
//	public Background getBackground() {
//		return background;
//	}
//
//	/**
//	 * setBackground
//	 * @param b: the Background object to set the property to
//	 */
//	public void setBackground(Background b) {
//		background = b;
//	}
//
//	/**
//	 * getClasses
//	 * @return classes: array of Class objects
//	 */
//	public Class[] getClasses() {
//		return classes;
//	}
//
//	/**
//	 * setClasses
//	 * @param c: array of class Objects to set as the classes variable
//	 */
//	public void setClasses(Class[] c) {
//		classes = c;
//	}
//
//	/**
//	 * getFeat
//	 * @return feats: array of Feat objects
//	 */
//	public Feat[] getFeat() {
//		return feats;
//	}
//
//	/**
//	 * setFeat
//	 * @param f: array of Feat objects to set as the feats variable
//	 */
//	public void setFeat(Feat[] f) {
//		feats = f;
//	}
//
//	/**
//	 * getItems
//	 * @return items: ArrayList of Item objets
//	 */
//	public ArrayList<Item> getItems(){
//		return items;
//	}
//
//	/**
//	 * setItems
//	 * @param i: ArrayList of Item objects to set as the item variable
//	 */
//	public void setItems(ArrayList<Item> i) {
//		items = i;
//	}
//
//	/**
//	 * addItem
//	 * @param i: Item object to add to the items ArrayList
//	 */
//	public void addItem(Item i) {
//		items.add(i);
//	}
//
//	/**
//	 * removeItem
//	 * @param i: Item object to remove from the ArrayList
//	 */
//	public void removeItem(Item i) {
//		for(int k = 0; k < items.size(); k++) {
//			if(items.get(k).getName() == i.getName()) {
//				items.remove(k);
//				break;
//			}
//		}
//	}
//
//	/**
//	 * getExp
//	 * @return exp: amount of experience the character has
//	 */
//	public int getExp() {
//		return exp;
//	}
//
//	/**
//	 * setExp
//	 * @param e: amount of experience to set as the experience variable
//	 */
//	public void setExp(int e) {
//		exp = e;
//	}
//
//	/**
//	 * getLvl
//	 @return lvl: the level of the character
//	 */
//	public int getLvl() {
//		return lvl;
//	}
//
//	/**
//	 * setLvl
//	 * @param l: level to set as the lvl variable for the character
//	 */
//	public void setLvl(int l) {
//		lvl = l;
//	}
//
//}
//
