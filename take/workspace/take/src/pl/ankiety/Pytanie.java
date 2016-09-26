package pl.ankiety;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Pytanie implements Serializable {
	
	private static final long serialVersionUID = 2L;
	int idque;
	String tresc;
	String typ;
	Przedmiot przedmiot;

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

	public Przedmiot getPrzedmiot() {
		return przedmiot;
	}

	public void setPrzedmiot(Przedmiot przedmiot) {
		this.przedmiot = przedmiot;
	}
}
