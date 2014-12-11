package iterator.demo;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Product p = new Product("电视机",4999.0,new Date());
		Product p1 = new Product("电脑",7999.0,new Date());
		Product p2 = new Product("手机",1999.0,new Date());
		Product p3 = new Product("电冰箱",14999.0,new Date());
		Product p4 = new Product("洗衣机",999.0,new Date());
		Product p5 = new Product("电话",99.0,new Date());
		Product p6 = new Product("空调",5999.0,new Date());

		Products ps = new Products();
		ps.add(p);
		ps.add(p1);
		ps.add(p2);
		ps.add(p3);
		ps.add(p4);
		ps.add(p5);
		ps.add(p6);
		
		while(ps.hasNext()){
			ps.next().toStr();
		}
		
		
	}

}
