import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        login_form lf=new login_form();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setVisible(true);
        lf.setBounds(10,10,500,200);
        lf.setResizable(false);
    }
}
