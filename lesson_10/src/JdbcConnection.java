import java.sql.Connection;//соед  одно класс весь static
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcConnection {

    private static Connection conn;//отвечает за подключение к базе, если ооно одно то должно быть в ед. экземпляре
    public static void init() throws ClassNotFoundException, SQLException {//инициализация по свойствам сслыки им польз пароль
        Class.forName("com.mysql.jdbc.Driver");// для подключения mysql, соединение со службой
        conn= DriverManager.getConnection("jdbc:mysql://localhost/test_db","admin","admin");//создаёт подключение
    }
    public static Connection getConnection() {//тип. название метода.фигурные
        return conn;
    }
}
