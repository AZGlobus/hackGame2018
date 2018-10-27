package hackGame;

import java.util.ArrayList;

public class gameObjectManager {
	static gameObjectManager instance;
	static graphicController GC;
	static ArrayList<Object> objList;
	
	public void setGraphics(graphicController newGraphics) {
		GC=newGraphics;
	}
	private gameObjectManager() {
		objList=new ArrayList<Object>();
	}
	
	public void updateEntities() {
		for (Object obj : objList){
			if(obj instanceof entity) {
				entity ref = (entity) obj;
				ref.update();
			}
		}
	}
	
	public static gameObjectManager getInstance() {
		if (instance==null) {
			instance = new gameObjectManager();
			return instance;
		}else {
			return instance;
		}
	}
}
