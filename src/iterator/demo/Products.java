package iterator.demo;

import java.util.Iterator;
import java.util.Vector;

public class Products implements Iterator<Product> {
	
	private int currentPointer = 0;
	private Vector<Product> vector = new Vector<Product>();

	public boolean hasNext() {
		if(this.currentPointer <= this.vector.size()-1){
			return true;
		}
		return false;
	}

	public Product next() {
		Product pro = this.vector.get(this.currentPointer);
		if(this.currentPointer < this.vector.size()){
			this.currentPointer++;
		}
		return pro;
	}

	public void remove() {
		this.currentPointer = 0;
		this.vector = new Vector<Product>();
	}
	
	public void add(Product p){
		this.vector.add(p);
	}

}
