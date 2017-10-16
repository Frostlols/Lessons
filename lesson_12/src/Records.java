import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Records extends JFrame {
    private JTextArea textRecord;
    private JPanel panelRecord;

    public Records() throws SQLException {//конструктор
        setContentPane(textRecord);
        setLocation(10,10);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        records_rep rp=new records_rep();
        ArrayList<record> records= rp.getRecords();
        for(record record: records){
            textRecord.setText(textRecord.getText()+record);
        }

    }
}
