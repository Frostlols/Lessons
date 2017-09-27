import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class main {
    public static void main(String[] args) throws IOException {


        User u= new User();
        u.id=100;
        u.name="user 100";
        User u2= new User();
        u2.id=200;
        u2.name="user 200";
        User []users={u,u2};
        //writeUserToFile(users,"users.txt");
        //showUsers("users.txt");

        String s=String.valueOf(true);
        System.out.println(s);

        float f=Float.parseFloat("12.3f");
        System.out.println(f*2);
        //коллекциии
        ArrayList<Integer>list=new ArrayList<>();//()-можно указать размер коллекции
        list.add(0,13);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(18);

        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        Integer k=18;
        list.remove(k);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        for(Integer j: list){
            System.out.println(j*j);
        }
        HashSet<String> set= new HashSet<>();
        set.add("red");
        set.add("green");
        set.add("blue");
        set.add("red");
        System.out.println(set);
        HashMap<String , Integer> map=new HashMap<>();
        map.put("Ivanov",6383215);
        map.put("Smirnov",6387785);
        map.put("Smirnov", 3214587);
        System.out.println(map);
        System.out.println(map.get("Ivanov"));
        map.remove("Smirnov");
        System.out.println(map);


    }

        public static void writeUserToFile(User [] users,String fileName) throws IOException {//изменение  внутри
            FileOutputStream fos= new FileOutputStream(fileName);//открывает в поток для записи
            ObjectOutputStream oos=new ObjectOutputStream(fos);//создаёт поток для записи из опер памяти

            for(int i=0;i<users.length;i++){
                oos.writeObject(users[i]);
            }//запись файла, массива

            oos.close();//закрытие файлов
            fos.close();//закрытие файлов
    }

                public static void showUsers(String fileName) throws IOException {
                    FileInputStream fis= new FileInputStream(fileName);//чтение файла
                    ObjectInputStream ois=new ObjectInputStream(fis);

                    while(true){
                        Object obj=null;
                        try {
                            obj= ois.readObject();
                        }catch (Exception e){
                            break;
                        }// бесконечный цикл чтения , последовательно. пока не выйдет исключение, после которого прекарится цикл

                        User u=(User) obj;//превращение в нужный типа для вывода

                        System.out.print(u.id);
                        System.out.println(" "+u.name);

                    }
                    ois.close();
                    fis.close();
    }

    }
/*
        int year=2016;
        if(year%400==0){
                System.out.println("super vck");
            }else{
        if (year%4==0){
            System.out.println("vck");
        }else{
                if(year%100==0){
                    System.out.println("ne vck");
                }else{
              System.out.println("ne vck");
            }
                }
            }*/
