package pl.ankiety;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class MozliwaOdpowiedz implements Serializable {

	private static final long serialVersionUID = 1L;
	int idm;
	String tresc;
	Pytanie pytanie;
    Przedmiot przedmiot;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getIdm() {
		return idm;
	}
	
	public void setIdm(int idm) {
		this.idm = idm;
	}
	
	public String getTresc() {
		return tresc;
	}
	
	public void setTresc(String tresc) {
		this.tresc = tresc;
	}

	public Pytanie getPytanie() {
		return pytanie;
	}

	public void setPytanie(Pytanie pytanie) {
		this.pytanie = pytanie;
	}

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }
}
