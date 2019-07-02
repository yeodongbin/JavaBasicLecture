package basicApiClass;

import java.util.*;

public class HashCodeExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashmap = new HashMap<>();
		hashmap.put(new Key(1),"ȫ�浿");
		
		String value = hashmap.get(new Key(1));
		System.out.println(value);
	}
}

class Key {
	public int number;
	
	Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number ==  compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
		return number;
	}
}



