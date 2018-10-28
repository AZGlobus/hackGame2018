package hackGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class enemy implements actors {
	private int health,damage, sightRange,attackRange, distance;
	private BufferedImage img;
	
	@Override
	public void takeDamage(int hit) {
		health = health - hit;
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		if (distance <= attackRange) {
			player.takeDamage(damage);
		}
		
	}

	@Override
	public BufferedImage getGraphic() {
		return img;
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	void generateCorpse(String monster, int lvl) {
		
	}
}
