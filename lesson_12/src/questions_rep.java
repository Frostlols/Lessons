import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class questions_rep {
    public ArrayList<question> getQuestions() throws SQLException {//(null) ничего не принимает
        Connection conn=JdbcConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM questions");
        ResultSet result=ps.executeQuery();
        ArrayList<question> question=new ArrayList<>();
        while(result.next()){
            question q=new question();
            q.id=result.getInt("id");
            q.words=result.getString("words").split(";");//разделяет слова в массиве по знаку ":"
            q.answer=result.getString("answer");
            q.answer_img=result.getString("answer_img");
            question.add(q);
        }
        return question;
    }

}
