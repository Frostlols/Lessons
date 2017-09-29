import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class main {
   /* public static int k = 0;
    synchronized//синхронизирует операции в потоке(ставит их в очередь)
    public static void doSams(int d) {
        k += d;
    }*/

    public static void main(String[] args) throws InterruptedException {

        Date d= new Date();
        System.out.println(d);
        d.setTime(99900);//длинее число с буквой l
        System.out.println(d);
        Date d2=new Date();
        if(d2.before (d)){
            System.out.println("d2<d");
        }else {
            System.out.println("d2>=d");
        }

        SimpleDateFormat t= new SimpleDateFormat("'сегодня' dd. MM. EEE.");//вывести в нужном нам формате
        t.format(d);//присваиваем формат
        System.out.println(t.format(d));


        Calendar c=  Calendar.getInstance();
        c.add(Calendar.MONTH,2);
        c.set(Calendar.MONTH,8);
        c.set(Calendar.DAY_OF_WEEK,5);
        int ia=c.get(Calendar.YEAR);

        System.out.println(ia);

        GregorianCalendar gc= new GregorianCalendar();
        gc.set(Calendar.YEAR,2017);
        if(gc.isLeapYear(2017)) {//тут всё ясно

            System.out.println("год высокос");
        }else{
            System.out.println("не высокос");
        }


        /*Thread t1 = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <100000000; i++) {
                        doSams(1);
                    }
                }
            });

        Thread t2 = new Thread(//создание потока
                new Runnable() {//приводит в работу
                    @Override
                    public void run() {
                        for (int i = 0; i <100000000; i++) {
                            doSams(-1);
                        }
                    }
                });
        t1.start();
        t2.start();
        t1.join();//ожидает выполнение потока
        t2.join();
        System.out.println(k);*/

    }

}
/* double d= Math.sin(3.14);//синус косинус
        double v=Math.sqrt(9);//корень
        double s=Math.pow(2,10);//возведение в стпень
        double g=Math.min(10,20);//только два значения
        double c=Math.round(12.5);//округление
        System.out.println(c);//1506699997689

        long t= System.currentTimeMillis();//cкорость выполнения операции в милисекундах
          for(int i=0;i<10000000;i++){
               double m=Math.sin(i)*Math.tan(i*2)-Math.sqrt(i/2);
           }
           long dt=System.currentTimeMillis();
        System.out.println(dt);
        myThred mt= new myThred();
        mytred2 mt2= new mytred2();
        mt.start();
        mt2.start();
        mt.join();//ожидает выполнение потока
        mt2.join();*/