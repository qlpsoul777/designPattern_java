package chainOfResponsibility.approval;

public class CityHandler extends Handler {
	
	private final double maxFee = 10000000.00;

	public void opreateRequest(double fee) {
		if(fee <= maxFee){
			System.out.println("市政府进行审批");
		}else{
			System.out.println("投资金额太大，市政府无权进行审批，市政府请求中央审批");
			System.out.println("--------");
			setNext();
			getNext().opreateRequest(fee); //请求传递到下一个责任对象
		}
	}
	
	public Handler getNext() {
		return next;
	}
	
	public void setNext() {
		this.next = new CentralHandler();
	} 

}
