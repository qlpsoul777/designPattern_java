package chainOfResponsibility.approval;

public abstract class Handler {
	
	//下一个责任对象
	protected Handler next;
	
	//处理请求
	public abstract void opreateRequest(double fee);

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}

}
