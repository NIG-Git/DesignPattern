package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory implements Component{

	private List<Component> list = null;

	private String name = null;

	public Directory(String name){
		this.name = name;
		list = new ArrayList<>();
	}

	@Override
	public void operation() {
		System.out.println("This is " + name);

		Iterator<Component> iter = list.iterator();

		while(iter.hasNext()){
			Component comp = iter.next();
			comp.operation();
		}

	}

	public void add(Component comp){
		list.add(comp);
	}

}
