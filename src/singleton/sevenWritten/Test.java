package singleton.sevenWritten;

public class Test {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			Singleton7 s = Singleton7.getSingleton();
			System.out.println(s);
		}

	}

}
