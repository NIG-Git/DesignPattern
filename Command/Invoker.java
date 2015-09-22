package Command;

import java.util.Iterator;
import java.util.Stack;

public class Invoker {

	private Stack<Command> commands = new Stack<>();

	public void addCommand(Command command){
		commands.push(command);
	}

	public void undoCommand(){
		Command command = commands.pop();
		System.out.println();
		System.out.println("命令を削除しました。 ⇒ " + command.getName());
		System.out.println();
	}

	public void execute(){
		Iterator<Command> it = commands.iterator();
		while(it.hasNext()){
			it.next().execute();
		}

	}

}
