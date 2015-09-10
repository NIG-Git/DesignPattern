package Bridge;

public class MultiplePen {

	private BallPointPen ballPointPen;

	public MultiplePen(BallPointPen ballPointPen){
		this.ballPointPen = ballPointPen;
	}

	public void abstractionMethod(){
		ballPointPen.outputColor();
	}

}
