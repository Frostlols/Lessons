import java.io.*;
import java.nio.Buffer;

public class user {
   // public int Id;
    public static void main(String[] args) throws IOException {

    worker w= new worker();
    director d= new director();
    cliner c= new cliner();
    w.goToWork();
    w.pay();
    goToWork(w);
    goToWork(d);
    goToWork(c);

        //проимходит чтение данных из файла
        File f= new File("1.txt");
        FileReader fr=new FileReader(f);

        BufferedReader br=new BufferedReader(fr);
        String content = "";
        while (true){
            String s=br.readLine();
            if(s==null){
                break;//проверк конца фалйла
            }
            content+=s+" ";
        }
            content+=" ";

            PrintWriter writer= new PrintWriter("1.txt", "UTF-8");
            writer.println(content);
            writer.close();







        /*user u=new user();
        Object o=new Object();
        u.toString();
        System.out.println(u.toString());
        user s= new user();
        s.Id=10;
        user s2= new user();
        s2.Id=10;
        if(s.equals(s2)){
            System.out.println("правда");
        }else {
            System.out.println(" не правда");
        }*/

    }

    public static void goToWork(IWorker emploer){
        emploer.goToWork();
    }
    public static void pay(IWorker emploer){
        emploer.pay();
    }
}
