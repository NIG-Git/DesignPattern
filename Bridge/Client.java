package Bridge;

public class Client {

	public static void main(String[] args){

		MultiplePen multiplePen = new MultiplePen(new RedBallPointPen());

		MechanicalPencil mechanicalPencil = new MechanicalPencil(new BlueBallPointPen());

		multiplePen.abstractionMethod();

		mechanicalPencil.abstractionMethod();

		mechanicalPencil.refinedMethod();

	}

}
