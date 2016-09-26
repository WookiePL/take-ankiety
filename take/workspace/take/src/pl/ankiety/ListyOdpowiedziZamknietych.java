package pl.ankiety;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wookie on 2016-09-26.
 */
public class ListyOdpowiedziZamknietych {

    private List<ListaOdpowiedziZamknietych> listyOdpowiedziZamknietych = new ArrayList<ListaOdpowiedziZamknietych>();
    public ListyOdpowiedziZamknietych() {

    }

    public ListyOdpowiedziZamknietych(List<ListaOdpowiedziZamknietych> listyOdpowiedziZamknietych) {
        this.listyOdpowiedziZamknietych = listyOdpowiedziZamknietych;
    }

    public List<ListaOdpowiedziZamknietych> getListyOdpowiedziZamknietych() {
        return listyOdpowiedziZamknietych;
    }

    public void setListyOdpowiedziZamknietych(List<ListaOdpowiedziZamknietych> listyOdpowiedziZamknietych) {
        this.listyOdpowiedziZamknietych = listyOdpowiedziZamknietych;
    }
}
