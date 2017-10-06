import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        JFrame frame= new JFrame("swing");//название окна в скобках
        frame.setSize(400,400);//два размера x; y .ширина высота. окна
        frame.setLocation(100,100);//два аргумента, от верхнего левого экранаю положение окна
        frame.setVisible(true);//вызывает окно, делает видимым его на экране . для закрытия false

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//при закрыти окна программа завершается
       /* JButton button=new JButton("Нажми меня");//текст на кнопке
        button.setSize(10,10);//относительно контейнера
        button.setLocation(0,50);
        frame.add(button);//вставляет в обьект фрейм обьект бтон*/
       setFlowLayout(frame);
       frame.setResizable(true);//не позволяет пользователю менять размер окна
    }

        public static void setBorderLayout (JFrame f){
            Container c=f.getContentPane();//сохраняем в обьекте с для наложения на него других обьектов
            BorderLayout bl=new BorderLayout();//шаблон окна
            c.setLayout(bl);//вызов нужного контейнера и передача ему шаблона , который мы хотим использовать
            JButton button5=new JButton("Нажми меня 1");
            JButton button1=new JButton("Нажми меня 2");
            JButton button2=new JButton("Нажми меня 3");
            JButton button3=new JButton("Нажми меня 4");
            JButton button4=new JButton("Нажми меня 5");//положение и размер писать бесполезно, шаблон всё проигнорирует
            c.add(button5,BorderLayout.WEST);//положение по края шаблона (WEST,EAST,North,SOuth,CENTER)
            c.add(button1,BorderLayout.EAST);
            c.add(button2,BorderLayout.NORTH);
            c.add(button3,BorderLayout.SOUTH);
            c.add(button4,BorderLayout.CENTER);
    }
            public static void setFlowLayout (JFrame f){
                Container c=f.getContentPane();//сохраняем в обьекте с для наложения на него других обьектов
                FlowLayout fl=new FlowLayout();//шаблон окна
                c.setLayout(fl);//вызов нужного контейнера и передача ему шаблона , который мы хотим использовать
                /*JButton button5=new JButton("Нажми меня 1");
                JButton button1=new JButton("Нажми меня 2");
                JButton button2=new JButton("Нажми меня 3");
                JButton button3=new JButton("Нажми меня 4");
                JButton button4=new JButton("Нажми меня 5");//положение и размер писать бесполезно, шаблон всё проигнорирует
                c.add(button5);
                c.add(button1);
                c.add(button2);
                c.add(button3);
                c.add(button4);//раположение идёт построчно. когда место кончается преходи на новую строку*/
                JLabel label=new JLabel("Дароу");//значение по умолчанию
               // label.setText("Hello");//елси значение нужно поменять
                c.add(label);
                JTextField field=new JTextField();
                c.add(field);
                field.getText();//возвращает текст
                JPasswordField jsp=new JPasswordField();//делает пароль не видемым
                c.add(jsp);
                jsp.getPassword();//возвращает пароль
                JProgressBar jProgressBar= new JProgressBar();// полоска загрузки
                jProgressBar.setMinimum(-50);//минимум
                jProgressBar.setMaximum(50);//максимум
                jProgressBar.setValue(25);//начальное положение, через цикл можно двигать
                c.add(jProgressBar);
                JSlider jSlider=new JSlider();//слайдер
                jSlider.setValue(50);//положение слайдера
                jSlider.getValue();//возвращает положение слайдера
                jSlider.setToolTipText("pull me");//надпись при наведении курсора мыши
                c.add(jSlider);
                JCheckBox jCheckBox=new JCheckBox("Tururu");// создаёт поле с флажком
                jCheckBox.setSelected(true);//положение флажка изначально
                jCheckBox.isSelected();//возвращает значение
                c.add(jCheckBox);
                JRadioButton jRadioButton=new JRadioButton("tbl 40");// каждая кнопка новый обьект
                JRadioButton jRadioButton2=new JRadioButton("tbl 41");
                ButtonGroup buttonGroup=new ButtonGroup();//уходит фокус с одной на дргую
                buttonGroup.add(jRadioButton);
                buttonGroup.add(jRadioButton2);//добавление тоже по одной
                c.add(jRadioButton);
                c.add(jRadioButton2);//как и вывод
                //JPanel в контейнер добавляют контейнер с кнопками .кнопки в обькт.так же можно свой лэйаут
                JMenuBar bar=new JMenuBar();//менюшки
                c.add(bar);
                JMenu menuFile=new JMenu("File");
                JMenu menuAbout=new JMenu("About");
                bar.add(menuFile);
                bar.add(menuAbout);
                JMenuItem item=new JMenuItem("new");//вложения в менюшки
                JMenuItem item1=new JMenuItem("open");
                menuFile.add(item);
                menuAbout.add(item1);
                JMenu menuFile1=new JMenu("File1");
                JMenu menuAbout2=new JMenu("About2");//выпадающее меню
                menuFile.add(menuFile1);
                menuAbout.add(menuAbout2);
                JMenuItem item3=new JMenuItem("new");//вложения в менюшки
                JMenuItem item4=new JMenuItem("open");
                menuFile1.add(item3);
                menuAbout2.add(item4);





        }
                public static void setGridLayout (JFrame f){
                    Container c=f.getContentPane();//сохраняем в обьекте с для наложения на него других обьектов
                    GridLayout gl=new GridLayout(2,2);//столбцы строки
                    c.setLayout(gl);//вызов нужного контейнера и передача ему шаблона , который мы хотим использовать
                    JButton button5=new JButton("Нажми меня 1");
                    JButton button1=new JButton("Нажми меня 2");
                    JButton button2=new JButton("Нажми меня 3");
                    JButton button3=new JButton("Нажми меня 4");
                    JButton button4=new JButton("Нажми меня 5");//положение и размер писать бесполезно, шаблон всё проигнорирует
                    c.add(button5);
                    c.add(button1);
                    c.add(button2);
                    c.add(button3);
                    c.add(button4);//распологает постепенно в таблице.Если кнопок больше строк или столбцов, они автоматически добавятся
    }
                    public static void setAbsoluteLayout (JFrame f){
                        Container c=f.getContentPane();//сохраняем в обьекте с для наложения на него других обьектов
                        c.setLayout(null);//вызов нужного контейнера и передача ему шаблона , который мы хотим использовать
                        JButton button5=new JButton("Нажми меня 1");
                        JButton button1=new JButton("Нажми меня 2");
                        JButton button2=new JButton("Нажми меня 3");
                        c.add(button5);
                        button5.setSize(150,100);//относительно контейнера
                        button5.setLocation(10,50);
                        c.add(button1);
                        button1.setSize(150,100);//относительно контейнера
                        button1.setLocation(160,50);
                        c.add(button2);
                        button2.setSize(150,100);//относительно контейнера
                        button2.setLocation(260,50);

    }

}
