package hackGame;
import java.util.*;
public class levelGenerator{
	Random rand;
	int tileSize = 8;
	entity tile[][] = new entity[8][8];
	
	tile[1][1] = new indestructableWall(); 
	
	
	public levelGenerator(long seed){
		rand = new Random(seed);
		
		
	}
	
	public entity[][] generateLevel(int width, int length, int difficulty) {
		entity gameMap[][] = new entity[width*tileSize][length*tileSize];
		
		
	}
}
