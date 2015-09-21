package Memento;

public class BookKeeper {

	private String book1 = "Javaの本";
	private boolean book1state = false;
	private String book2 = "PHPの本";
	private boolean book2state = false;

	public void bookRental1(){
		this.book1state = true;
	}

	public void bookRental2(){
		this.book2state = true;
	}

	public void bookReturn1(){
		this.book1state = false;
	}

	public void bookReturn2(){
		this.book2state = false;
	}

	public Memento createMemento(){
		return new Memento(book1state, book2state);
	}

	public void setMemento(Memento memento){

		this.book1state = memento.book1state;
		this.book2state = memento.book2state;

	}

	public String getStatus(){

		StringBuffer retMsg = new StringBuffer(book1 + " : ");

		if(book1state){
			retMsg.append("貸出中");
		}else{
			retMsg.append("末貸出");
		}

		retMsg.append(" | " + book2 + " : ");

		if(book2state){
			retMsg.append("貸出中");
		}else{
			retMsg.append("末貸出");
		}

		return retMsg.toString();

	}

}
