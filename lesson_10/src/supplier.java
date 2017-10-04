public class supplier {
@Override
    public String toString(){// переопределяем метод string для вывода таблицы
    String s=String.format("id:%d name:%s adres:%s date_reg:%s phone:%s email:%s\n",id,name,adres,data_reg,phone,email);
    return s;//формирование строи . возврат строки
}

    public int id;
    public String name;
    public String adres;
    public String data_reg;
    public String phone;
    public String email;
}
