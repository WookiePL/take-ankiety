package pl.ankiety;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Wookie on 2016-09-26.
 */
@Entity
@XmlRootElement
public class ListaOdpowiedziZamknietych implements Serializable {
    int idl;
    Pytanie pytanie;

    @Id
    @GeneratedValue
    @XmlAttribute
    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
    }

    public Pytanie getPytanie() {
        return pytanie;
    }

    public void setPytanie(Pytanie pytanie) {
        this.pytanie = pytanie;
    }
}
