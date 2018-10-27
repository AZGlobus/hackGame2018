package hackGame;
import java.util.*;
public class levelGenerator{
	Random rand;
	enum tileType {straight, corner, crossroads, deadend, threeway}
	int tileSize = 8;
	tile straight = new entity[15][15];
	
	straight.entityList[7][0] = door;
	
	//tile[1][1] = new indestructableWall(); 
	
	
	public levelGenerator(long seed){
		rand = new Random(seed);
		
		
	}
	
	public static entity[][] generateLevel(int width, int length, int difficulty) {
		entity gameMap[][] = new entity[width*tileSize][length*tileSize];
	}
	
		
	
}
