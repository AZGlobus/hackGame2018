package hackGame;
import java.util.*;
public class levelGenerator{
	Random rand;
	int tileSize = 8;
	entity tile[][] = new entity[8][8];
	enum tileType {straight, corner,split,crossroads,deadend}
	
	public levelGenerator(long seed){
		rand = new Random(seed);
		
		
	}
	
	public static entity[][] generateLevel(int width, int length, int difficulty) {
		entity gameMap[][] = new entity[width*tileSize][length*tileSize];
		tile[1][1] = new indestructableWall(); 
		tile myTile=new tile();
		//myTile.entityList[0][0]=door
		tile tiles[]=new tile[10]; //array list
			
		myTile.type=tileType.straight;
		switch (myTile.type) {
			case straight:
		}
		
		
		return gameMap;
	}
	private class tile {
		public tileType type;
		public entity entityList[][];
	}
	
}
