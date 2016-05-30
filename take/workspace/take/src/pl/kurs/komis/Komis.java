package pl.kurs.komis;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Komis {

	public abstract String create(InputStream is);

	public abstract String find(int idc);

	public abstract String get();

	public abstract String update(InputStream is);

	public abstract void delete(int idc);

}