package facade.demo;

public class FacadePattern {
	
	private QueryOperate qo;
	private TransferOperate to;
	private MessageOperate mo;
	
	public FacadePattern(){
		qo = new QueryOperate();
		to = new TransferOperate();
		mo = new MessageOperate();
	}
	
	public void payMoney(){
		qo.queryInfo();
		to.transfer();
		mo.sendMsg();
	}

}
