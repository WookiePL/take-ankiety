package pl.ankiety;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@XmlRootElement
public class Pytanie2 implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	int idque;
	String tresc;
	String typ;

	@Id
	@GeneratedValue
	@XmlAttribute
	public int getIdque() {
		return idque;
	}
	
	public void setIdque(int idq) {
		this.idque = idq;
	}
	
	public String getTresc() {
		return tresc;
	}
	
	public void setTresc(String tresc) {
		this.tresc = tresc;
	}
	
	public String getTyp() {
		return typ;
	}
	
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
}
