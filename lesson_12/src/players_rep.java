import java.sql.Connection;//вся логика для работы с игроками
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class players_rep {

    private static int player_id;//возвращаем id

    public void login (String login,String password) throws Exception {
        Connection conn=JdbcConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT ID players FROM players WHERE Login=? and Pass_hash=?");//создание
        ps.setString(1,login);
        ps.setString(2,password);
        ResultSet result=ps.executeQuery();
            if(result.next()==false){
                throw new Exception("Wrong pass or login.");
            }
                players_rep.player_id=result.getInt("ID");//возвращаем id

    }

        public void register(player p) throws SQLException {//что передаётся в скобках
            Connection conn=JdbcConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement("INSERT INTO players (Login,Pass_hash,age) VALUES (?,?,?)");
            ps.setString(1,p.Login);
            ps.setString(2,p.Pass_hash);
            ps.setInt(3,p.Age);
            ps.executeUpdate();

            ResultSet result=ps.getGeneratedKeys();//только после выполнения запроса
            players_rep.player_id=result.getInt(1);//возвращаем id
        }

}
