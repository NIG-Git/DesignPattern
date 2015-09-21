package Memento;

import java.util.Stack;

public class Caretaker {

	static Stack<Memento> mementoList = new Stack<>();

	public static void main(String[] args){

		BookKeeper keeper = new BookKeeper();

		keeper.bookRental1();
		keeper.bookRental2();

		mementoList.push(keeper.createMemento());

		System.out.println(keeper.getStatus());

		keeper.bookReturn1();

		mementoList.push(keeper.createMemento());

		System.out.println(keeper.getStatus());

		keeper.bookReturn2();

		mementoList.push(keeper.createMemento());

		System.out.println(keeper.getStatus());

		System.out.println("--- 過去の状態を復元 ---");

		while(mementoList.size() != 0){
			Memento memento = (Memento)mementoList.pop();
			keeper.setMemento(memento);
			System.out.println(keeper.getStatus());
		}

	}

}
