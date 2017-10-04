import java.sql.SQLException;
import java.util.ArrayList;

public interface repository {
  ArrayList<Object> getAll() throws SQLException;//коллекция типа обьект
  void add(Object o) throws SQLException;
  void update(Object o) throws SQLException;
  void remuve(Object o) throws SQLException;
}
