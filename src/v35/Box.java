package v35;

import java.util.ArrayList;

public class Box <T> {

	public ArrayList<T> storage = new ArrayList<T>();
	
	@SuppressWarnings("unchecked")
	public Box(T... get) {

		for (T t : get) {
			storage.add(t);
		}
		
	}
	
	public boolean chechForType(Box<T> b2) {
		
		for (T t : this.storage) {
			
			for (T b2t : b2.storage) {
				
				if (t.getClass() == b2t.getClass()) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
}
