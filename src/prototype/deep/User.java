package prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class User implements Cloneable,Serializable {
	
	private static final long serialVersionUID = -5588358918083025964L;
	
	private long id;
	private String name;
	private Card card;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	public User deepClone(){ 
		User u = null;
		try {
			u = (User)super.clone();
			u.card = (Card)this.card.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public User cloneObject() throws Exception{
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream(); 
        ObjectOutputStream out = new ObjectOutputStream(byteOut); 
        out.writeObject(this); 
        
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray()); 
        ObjectInputStream in =new ObjectInputStream(byteIn);
        return (User)in.readObject();
    }

}
