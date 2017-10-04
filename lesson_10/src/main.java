import java.sql.SQLException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcConnection.init();//перед вводом добавили данные
        supplier supp=new supplier();
        supp.name="Kirusha";
        supp.adres="Moscow";
        supp.email="hkreref@mail.ru";
        supp.data_reg="2017-10-07";
        supp.phone="74534567589";
        suppliers_rep s_rep=new suppliers_rep();//создание обекта так как метод getAll динамический . не статический
       // s_rep.add(supp);
        supp.id=5;
        s_rep.update(supp);
        s_rep.remuve(supp);
        supp.id=4;
        ArrayList<Object> supplier=s_rep.getAll();
        System.out.println(supplier);




    }
}
