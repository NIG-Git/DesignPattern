package Observer;

public class Teacher implements Observer{

	private String name;

	public Teacher(String name){
		this.name = name;
	}

	@Override
	public void update(Subject subject) {

		int total = subject.getStatus();

		System.out.println(name + " : " + "現在の勉強総時間は" + total + "に達しました。");

		if(total > 50){
			System.out.println(name + " : " + "A大学に合格できるでしょう");
		}else if(total > 30){
			System.out.println(name + " : " + "B大学に合格できるでしょう");
		}else{
			System.out.println(name + " : " + "まだ勉強が必要です");
		}

	}

}
