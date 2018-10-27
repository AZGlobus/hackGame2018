package hackGame;

public interface actors extends entity {
	void takeDamage(int hit);
	void die();
	void setPosition();
	void attack();
}
