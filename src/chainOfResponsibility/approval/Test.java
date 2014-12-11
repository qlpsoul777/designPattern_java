package chainOfResponsibility.approval;


public class Test {

	public static void main(String[] args) {
		Handler first = new DistrictHandler();
		first.opreateRequest(100000000.00);
	}

}
