package Prototype;

public class ConcreatePrototype extends Prototype{

	private String instanceName;

	public ConcreatePrototype(String name){

		this.instanceName = name;

	}

	@Override
	public Prototype createClone(){

		ConcreatePrototype conProto = null;

		try{
			conProto = (ConcreatePrototype) this.clone();
		}catch (CloneNotSupportedException ex){
			ex.printStackTrace();
		}

		return conProto;

	}


	public String getName(){
		return instanceName;
	}
}
