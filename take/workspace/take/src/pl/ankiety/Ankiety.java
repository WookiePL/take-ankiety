package pl.ankiety;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Ankiety {
	
/*****************************************************************************************	
 * Wykladowca
 ****************************************************************************************/
	
	public abstract String createWykladowca(String imieNazwisko);
	//public abstract String createWykladowca(InputStream is);

	public abstract String findWykladowca(int idc);

	public abstract String getWykladowca();

	//public abstract String updateWykladowca(InputStream is);

	//public abstract void deleteWykladowca(int idc);
	
}
