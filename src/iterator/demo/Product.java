package iterator.demo;

import java.util.Date;

public class Product {
	
	private String name;
	private double cost;
	private Date createTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Product(String name, double cost, Date createTime) {
		super();
		this.name = name;
		this.cost = cost;
		this.createTime = createTime;
	}
	
	public void toStr() {
		System.out.println("Product [产品名称：" + name + ", 价格：" + cost + ",出厂日期："
				+ createTime + "]");
	}
	

}
