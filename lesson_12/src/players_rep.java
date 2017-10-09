import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class players_rep {
    public void login (String login,String password) throws Exception {
        Connection conn=JdbcConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT ID players FROM players WHERE Login=? and Pass_hash=?");//создание
        ps.setString(1,login);
        ps.setString(2,password);
        ResultSet result=ps.executeQuery();
            if(result.next()==false){
                throw new Exception("Wrong pass or login.");
            }

    }
}
