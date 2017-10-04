import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class suppliers_rep implements repository {

    public suppliers_rep() throws SQLException {
    }

    @Override
    public ArrayList<Object> getAll() throws SQLException {
        PreparedStatement ps=JdbcConnection.getConnection().prepareStatement("SELECT * FROM suppliers");//PreparedStatement подготовка соединения , в данном случае
        ResultSet result=ps.executeQuery();//при SELECT query для всех остальных update.
        ArrayList<Object> list=new ArrayList<>();//коллекция хранит данные в массиве из класса suppliers
        while (result.next()){//чтение коллекции, next булевое значение. Пока строки есть цикл идёт
            supplier supp=new supplier();
            supp.id=result.getInt("ID");
            supp.name=result.getString("Name");
            supp.phone=result.getString("Phone");
            supp.email=result.getString("Email");
            supp.data_reg=result.getString("Date_reg");
            supp.adres=result.getString("Adres");
            list.add(supp);//обьект с заполненными поялми добавляем в коллекцию
        }
        return list;
    }

    @Override
    public void add(Object o) throws SQLException {
        supplier supp=(supplier)o;
        PreparedStatement ps=JdbcConnection.getConnection().prepareStatement
                ("INSERT INTO suppliers (name, adres,email,date_reg,phone) VALUES(?,?,?,?,?)");
            ps.setString(1,supp.name);//нумерация с еденицы, номер ячейки и её название
            ps.setString(2,supp.adres);
            ps.setString(3,supp.email);
            ps.setString(4,supp.data_reg);
            ps.setString(5,supp.phone);
            ps.executeUpdate();

    }

    @Override
    public void update(Object o) throws SQLException {
        supplier supp=(supplier)o;
        PreparedStatement ps=JdbcConnection.getConnection().prepareStatement
                ("UPDATE  suppliers SET name=?, adres=?,email=?,date_reg=?,phone=? WHERE ID=?");
        ps.setString(1,supp.name);//нумерация с еденицы, номер ячейки и её название
        ps.setString(2,supp.adres);
        ps.setString(3,supp.email);
        ps.setString(4,supp.data_reg);
        ps.setString(5,supp.phone);
        ps.setInt(6,supp.id);
        ps.executeUpdate();
    }

    @Override
    public void remuve(Object o) throws SQLException {
        supplier supp=(supplier)o;
        PreparedStatement ps=JdbcConnection.getConnection().prepareStatement
                ("DELETE FROM suppliers WHERE id=?");
                        ps.setInt(1,supp.id);//нумерация с еденицы, номер ячейки и её название

        ps.executeUpdate();
    }





}

