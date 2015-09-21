package Observer;

public class Client {

	public static void main(String[] args){

		Observer ob = new Teacher("先生");
		Subject sb = new Student("生徒");

		sb.addObserver(ob);

		for(int i = 0; i < 10; i++){
			sb.run();
		}

	}

}
