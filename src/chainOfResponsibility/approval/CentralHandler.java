package chainOfResponsibility.approval;

import java.util.Random;

public class CentralHandler extends Handler {

	public void opreateRequest(double fee) {
		int i = new Random().nextInt(20);
		if(i%2 == 0){
			System.out.println("中央进行审批");
		}else{
			System.out.println("中央不审批，项目申请作废");
		}
	}

}
