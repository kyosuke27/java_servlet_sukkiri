package section1;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Objects;

public class Hero {
	
	private String name;
	private int hp,mp;
	
	
	
	public Hero(String name, int hp, int mp) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public String toString() {
		return "(勇者="+this.name+"/HP="+this.hp+"/MP="+this.hp+")";
	}
	
	public boolean equals(Object o) {
		if (o==this) {
			return true;
		}
		if (o==null) {
			return false;
		}
		if (!(o instanceof Hero)) {
			return false;
		}
		Hero h=(Hero)o;
		if (!this.name.equals(h.name)) {
			return false;
		}
		return true;
	}
	public int hashCode() {
		return Objects.hash(this.name,this.hp);
	}
}
