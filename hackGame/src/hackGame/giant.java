package hackGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import hackGame.*;

public class giant extends enemy {
	private int health, damage, sightRange, attackRange, distance;
	
	
	
	

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
	public void getGraphic() {
		try {
			BufferedImage img = ImageIO.read(new File("giant.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
