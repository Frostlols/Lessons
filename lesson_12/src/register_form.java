import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class register_form extends JFrame{//обязателньо пронаследовать класс
    private JPanel panelRegister;
    private JTextField ageTextField;
    private JTextField loginTextField;
    private JPasswordField repitPassTextField;
    private JPasswordField passField;
    private JButton pressToRegistrationButton;

        public register_form()  {
            setContentPane(panelRegister);

            pressToRegistrationButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(loginTextField.getText().length()==0||passField.getPassword().length==0){
                        JOptionPane.showMessageDialog(null,"all fields must be ","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String password=new String(passField.getPassword());//просто текст то, password.getText();пароль new String(PasswordField.getPassword)
                    String rep_password=new String(repitPassTextField.getPassword());
                    if(password.equals(rep_password)==false){//савнение паролей
                        JOptionPane.showMessageDialog(null,"Pass shuld be equal","Error",JOptionPane.ERROR_MESSAGE);//вызывает ошибку
                        return;//для последовательности вывода ошибок
                    }
                    String ageString=ageTextField.getText();
                    int age ;
                    try {age=Integer.parseInt(ageString);//переводит строковое значение в числовое
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null,"some thing go wrong","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(age<4||age>99){
                        JOptionPane.showMessageDialog(null,"age 4 or more but not 99 ","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    player p=new player();//создание новго пользователя
                    p.Login=loginTextField.getText();
                    p.Age=age;
                    p.Pass_hash=password;
                    players_rep p_r=new players_rep();
                    try{
                        p_r.register(p);
                    }catch (SQLIntegrityConstraintViolationException el){
                        JOptionPane.showMessageDialog(null,"User with this name alredy exists ","Error",JOptionPane.ERROR_MESSAGE);
                    } catch (SQLException e1) {
                        JOptionPane.showMessageDialog(null,"Registration error ","Error",JOptionPane.ERROR_MESSAGE);
                        e1.printStackTrace();
                    }
                    gameForm gf=new gameForm();
                    gf.setVisible(true);
                    setVisible(false);

                }
            });
        }

}
