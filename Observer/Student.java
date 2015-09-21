package Observer;

public class Student extends Subject{

	private String name;

	private int StdyingTime = 0;

	public Student(String name){
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getStatus() {
		return StdyingTime;
	}

	@Override
	public void run() {

		int num = 0;

		num = getStdyingTime();

		StdyingTime += num;

		System.out.println(name + " : " + num + "時間勉強しました。");

		notifyObservers();

	}

}
