package hackGame;

public abstract class enemy implements actors {
	private int health,damage, sightRange,attackRange;
	private image picture;
	health = difficulty * playerLvl * 100;
	damage = difficulty * playerLvl * 10;
	sightRange = difficulty + 10;
	attackRage = difficulty + 1;
	void generateCorpse(String monster, int lvl);
}
