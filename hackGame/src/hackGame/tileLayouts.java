package hackGame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tileLayouts {
	private tile straights[];
	private tile crossroads[];
	private tile deadends[];
	private tile corners[];
	private tile threeways[];
	
	public class tile{
		public entity entityList[][] = new entity[15][15];
		//tile myTile = new tile();
		//myTile.type = tileType.straight;
		//myTile.entityList[0][0] = door;
	}
	public tile fileToTile(File x) throws FileNotFoundException{
		tile extractedTile = new tile();
		Scanner s = new Scanner(x);
		int row = 14;
		while(s.hasNextLine()) {
			String line = s.nextLine();
			String tokens[] = line.split(" ");
			for(int i = 0; i < tokens.length; i++) {
				if(tokens[i].equals("w")) {
					extractedTile.entityList[i][row] = new indestructableWall();
				}
				if(tokens[i].equals("d")) {
					extractedTile.entityList[i][row] = new roomDoor();
				}
				if(tokens[i].equals("iC")) {
					extractedTile.entityList[i][row] = new itemChest();
				}
				if(tokens[i].equals("o")) {
					extractedTile.entityList[i][row] = new orcthony();
				}
				if(tokens[i].equals("bigOrc")) {
					extractedTile.entityList[i][row] = new boss1();
				}
				if(tokens[i].equals("stairs")) {
					extractedTile.entityList[i][row] = new downStairs();
				}
				
			}
			row--;
		}
		s.close();
		return extractedTile; 
	}
	public tile[] getStraight() {
		
		return null;
	}
	public tileLayouts(){
		tile straights[] = new tile[10];
		tile straightHorizontal = new tile();
		
		for(int i = 0; i < 15; i++) {
			straightHorizontal.entityList[0][i] = new indestructableWall();
		}
		for(int i = 0; i < 15; i++) {
			straightHorizontal.entityList[i][0] = new indestructableWall();
		}
		for(int i = 0; i < 15; i++) {
			straightHorizontal.entityList[i][14] = new indestructableWall();
		}
		for(int i = 0; i < 15; i++) {
			straightHorizontal.entityList[14][i] = new indestructableWall();
		}
		straightHorizontal.entityList[0][7] = new roomDoor();
		straightHorizontal.entityList[14][7] = new roomDoor();
		tile straightVertical = new tile();
		
		for(int i = 0; i < 15; i++) {
			straightVertical.entityList[0][i] = new indestructableWall();
		}
		for(int i = 0; i < 15; i++) {
			straightVertical.entityList[i][0] = new indestructableWall();
		}
		for(int i = 0; i < 15; i++) {
			straightVertical.entityList[i][14] = new indestructableWall();
		}
		for(int i = 0; i < 15; i++) {
			straightVertical.entityList[14][i] = new indestructableWall();
		}
		
		straightVertical.entityList[7][14] = new roomDoor();
		straightVertical.entityList[7][0] = new roomDoor();
		
		tile straightVertical1 = straightVertical;
		straightVertical1.entityList
		
		
		tile deadends[] = new tile[10];
		tile crossroads[] = new tile[10];
		tile corners[] = new tile[10];
		tile threeways[] = new tile[10];
				
	}
}
