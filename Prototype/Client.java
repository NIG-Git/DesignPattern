package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {

	private Map<String, Prototype> map = new HashMap<String, Prototype>();

	public void set(String name, Prototype proto){

		map.put(name, proto);

	}

	public Prototype create(String name){

		Prototype proto = map.get(name);
		return proto.createClone();

	}

}
