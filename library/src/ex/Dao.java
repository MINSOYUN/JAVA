package ex;

import java.util.List;

public interface Dao {
	public List<Book> getList();
	public boolean saveFile(List<Book> list);
}
