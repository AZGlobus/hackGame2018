package hackGame;
import java.util.*;

public class gameMain {
	static entity gameBoard[][];
	static levelGenerator levelGen;
	static int defaultLength=10, defaultWidth=10;
	static gameObjectManager objMan;
	static Random rand;
	public static void main(String[] args) {
		initialize();
		while(true) {
			objMan.updateEntities();
			objMan.draw();
		}
		
	}
	
	private static void initialize() {
		rand = new Random();
		objMan=gameObjectManager.getInstance();
		objMan.GC=new graphicController();
		
		levelGen= new levelGenerator(rand.nextLong());
		gameBoard= levelGenerator.generateLevel(defaultLength,defaultWidth,0);
		
		
	}
}