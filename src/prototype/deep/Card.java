package prototype.deep;

import java.io.Serializable;


public class Card implements Cloneable,Serializable{
	
	private static final long serialVersionUID = -4663181602807385492L;
	
	public int id = 1;
	public String name = "c1";

	public Card clone(){ 
		Card c = null;
		try {
			c = (Card)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return c;
	}
}
