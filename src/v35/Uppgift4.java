package v35;

import java.util.ArrayList;

public class Uppgift4 <T>  {

	//Name box
	
	ArrayList<T> storage = new ArrayList<T>();
	
	public <T> void input(T... get) {
		
		for (T t : get) {
			
			storage.addAll(t);
			
		}
		
	}
	
}
