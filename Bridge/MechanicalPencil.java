package Bridge;

public class MechanicalPencil extends MultiplePen{

	public MechanicalPencil(BallPointPen ballPointPen){
		super(ballPointPen);
	}

	public void refinedMethod(){
		System.out.println("シャープペンシル");
	}

}
