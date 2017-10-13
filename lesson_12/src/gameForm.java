import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class gameForm extends JFrame{
    private JPanel gamepanel;
    private JPanel panelqwest;
    private JTextField textanswer;
    private JLabel answerenter;
    private JButton enterButton;
    private JButton giveUpButton;
    private JButton helpMePlsButton;
    private JLabel yourlives;

    public gameForm() throws SQLException {
        setContentPane(gamepanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10,10,500,500);

        questions_rep qr=new questions_rep();
        questions = qr.getQuestions();//вызывает из масива вопросы
        showNextqwest();

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//логика проверки правильности не прпвильности
                String answer=textanswer.getText();//получение ответа в строчной форме
                String correctAnswer=currentQuestion.answer;// правильный овтет, то с чем сравнить
                textanswer.setText("");
                if(answer.equals(correctAnswer)){//сравнение
                    JOptionPane.showMessageDialog(null,"You are right!!!","GJ",JOptionPane.INFORMATION_MESSAGE);//вывод какого то диалогового окна
                    score+=livesCount+2*helpCount;//начисление очков
                    //TODO проверить последний ли это вопрос
                    showNextqwest();
                }else {
                    livesCount--;
                    updateliveButenTxet();
                    if(livesCount==0){
                        JOptionPane.showMessageDialog(null,"Wrong answer!!!Right answer:"+currentQuestion.answer,"BJ",JOptionPane.INFORMATION_MESSAGE);
                        showNextqwest();
                    }else {
                        updateHelpButtonText();
                    }
                    //TODO проверить последний ли это вопрос
                }

            }
        });

        helpMePlsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpCount--;
                associationNumder++;
                String help=currentQuestion.words[associationNumder];
                addAssociation(help);
                if(helpCount==0){
                    helpMePlsButton.setEnabled(false);
                }
                updateHelpButtonText();
            }
        });

        giveUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Right answer:"+currentQuestion.answer,"BJ",JOptionPane.INFORMATION_MESSAGE);
                //TODO
                showNextqwest();
            }
        });

    }

    private ArrayList<question> questions;
    private int questionNumber =0;
    private question currentQuestion;
    private int associationNumder;
    private int helpCount;
    private int livesCount;
    private int score=0;

    private void addAssociation (String Association) {//передаём переменную в строчной форме
        JLabel label= new JLabel(Association);
        label.setBackground(Color.white);//устанавливает цвет задника
        label.setForeground(Color.black);//цвет надписи
        panelqwest.add(label);
        panelqwest.updateUI();//насильно перерисовывает окно
    }

    private void showNextqwest (){
        questionNumber++;
        currentQuestion=questions.get(questionNumber-1);
        panelqwest.removeAll();
        associationNumder=0;
        addAssociation(currentQuestion.words[0]);
        helpMePlsButton.setEnabled(true);
        helpCount=currentQuestion.words.length-1;//количество всех подсказок length длина масива
        livesCount=5;
        updateHelpButtonText();
        updateliveButenTxet();
    }

    private void updateHelpButtonText (){//при нажатии выводятся подсказки
        String s=String.format("clue (%d)",helpCount);//ввести в лейбл число и строку
        helpMePlsButton.setText(s);
    }
    private void updateliveButenTxet(){
        String s= String.format("Lives (%d)",livesCount);
        yourlives.setText(s);
    }






}
