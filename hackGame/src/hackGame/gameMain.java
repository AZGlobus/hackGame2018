package hackGame;
import java.util.*;

public class gameMain {
	static entity gameBoard[][];
	static levelGenerator levelGen;
	//graphicController GC;
	static Random rand;
	public static void main(String[] args) {
		initialize();
		
		
	}
	
	private static void initialize() {
		rand = new Random();
		levelGen= new levelGenerator(rand.nextLong());
		gameBoard= new 
	}
}