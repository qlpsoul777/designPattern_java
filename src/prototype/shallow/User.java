package prototype.shallow;


public class User implements Cloneable {
	
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
	
	public User clone(){ 
		User u = null;
		try {
			u = (User)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return u;
	}

}
