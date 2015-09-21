package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PartsFactory {

	private static PartsFactory factory = new PartsFactory();

	private Map<Integer, Parts> pool = new HashMap<>();

	public static PartsFactory getInstance(){
		return factory;
	}

	public synchronized Parts getParts(int id){

		Parts parts = (Parts)pool.get(id);

		if(parts == null){
			parts = new Parts(id);
			pool.put(id, parts);
		}

		return parts;

	}

}
