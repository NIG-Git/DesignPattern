package Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficController extends Mediator{

	Map<String, Colleague> colleagues = new HashMap<>();

	List<Colleague> trafficList = new ArrayList<>(3);

	List<Colleague> trafficList2 = new ArrayList<>(2);

	@Override
	public void addColleague(Colleague colleague) {
		colleagues.put(colleague.getName(), colleague);
	}

	@Override
	public void control(Colleague colleague) {

		String name = colleague.getName();
		System.out.println(name + " が直進しようとしています。");

		if(trafficList.size() < 3){
			colleague.advice("交通整理者 : そのまま直進してください");
			trafficList.add(colleague);
		}else if(trafficList2.size() < 2){
			colleague.advice("交通整理者 : 直進すると渋滞の為、右折してください");
			trafficList2.add(colleague);
		}else{
			colleague.advice("交通整理者 : 現在進めない状況なので一時停止してください");
		}

	}

}
