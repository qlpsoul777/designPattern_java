package proxy.common;

public class ProxyMan implements Man {
	
	private Man man;
	
	public ProxyMan(){
		this.man = new ChineseMan();
	}
	
	public ProxyMan(Man man){
		this.man = man;
	}

	public void talk() {
		this.preTalk();
		this.man.talk();
		this.afterTalk();
	}

	private void preTalk() {
		System.out.println("专心听"+getName()+"说话");
	}

	private void afterTalk() {
		System.out.println("将"+getName()+"说的话翻译出来");
	}

	public String getName() {
		String str = "";
		if(this.man != null){
			str = this.man.getName();
		}else{
			str = "---";
		}
		return str;
	}

}
