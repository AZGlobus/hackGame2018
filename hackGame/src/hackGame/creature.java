package hackGame;

public interface creature extends entity {
	void takeDamage(int hit);
	void die();
	void setPosition();
	void attack();
}
