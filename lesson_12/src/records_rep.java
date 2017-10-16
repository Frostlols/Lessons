import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class records_rep {

    public void addRecord(int id, int score) throws SQLException {//для начала создать соединение
        Connection conn=JdbcConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT score FROM records WHERE id_user=? ");
        ps.setInt(1,id);
        ResultSet result=ps.executeQuery();
            if(result.next()){
                int prevRec=result.getInt("score");
                JOptionPane.showMessageDialog(null,"You score:"+score,"Your records...",JOptionPane.INFORMATION_MESSAGE);//для выводжа рекарда сразу
                if(score>prevRec){
                    ps=conn.prepareStatement("UPDATE records SET score=?,record_time=NOW() WHERE id_user=? ");//функция возвращает текущее время базы
                    ps.setInt(1,score);
                    ps.setInt(2,id);
                    ps.executeUpdate();//отправить запрос на выполнение

                }
            }else {
                ps=conn.prepareStatement("INSERT INTO records(id_user,score,record_time) VALUES (?,?,NOW())");
                ps.setInt(1,id);
                ps.setInt(2,score);
                ps.executeUpdate();
            }


    }

    public ArrayList<record> getRecords() throws SQLException {
        Connection conn=JdbcConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT login,score,record_time FROM records INNER JOIN players ON records.id_user=players.id ORDER BY score DESC");//выводит таблицы нужные столбцы, сортировка по счёту
        ResultSet result=ps.executeQuery();
        ArrayList<record> records= new ArrayList<>();
        while(result.next()){
            record record=new record();
            record.login=result.getString("login");
            record.score=result.getInt("score");
            record.time=result.getString("record_time");
            records.add(record);
        }
        return records;
    }



}
