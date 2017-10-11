import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class login_form extends JFrame{
    private JPanel panel1;
    private JTextField enterLoginTextField;
    private JPasswordField passwordField1;
    private JButton pressForEnterButton;
    private JButton pressForRegistratonButton;

        public login_form() throws SQLException, ClassNotFoundException {
            JdbcConnection.init();//инициализация , соединение
            setContentPane(panel1);
            pressForEnterButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //JOptionPane.showMessageDialog(null,"hello","Title",JOptionPane.ERROR_MESSAGE);//вызов дочернего окна
                    String login=enterLoginTextField.getText();
                    String pass = new String(passwordField1.getPassword());//для пассворд
                        try {
                            players_rep p_rep = new players_rep();
                            p_rep.login(login, pass);

                            }catch (Exception ex){
                            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        gameForm gf=new gameForm();
                        gf.setVisible(true);
                        setVisible(false);

                }
            });
            pressForRegistratonButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {// скрывает одно открывает другое
                            setVisible(false);//скрывает панель обьект относяйся к текущему классу
                            register_form r_f=new register_form();//сделать видимым и после , при зарытиии останавливать
                            r_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            r_f.setVisible(true);
                            r_f.setBounds(10,10,500,200);
                            r_f.setResizable(false);
                        }
                    });
        }

}
