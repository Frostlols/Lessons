import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
            String s="helow ";
            s=s.concat("hi");
            s=("<hellow "+"world>"+"hi!");
            System.out.println(s);
            if(s.indexOf('!')>=0){
                System.out.println("! есть");
            }
                if(s=="<hellow world>hi!"){
                    System.out.println("строки ровны");
                }else{
                    System.out.println("не ровны");
                }

                    if(s.equals("<Hellow world>hi!")){
                        System.out.println("строки ровны");
                    }else{
                        System.out.println("не ровны");
                    }
                        if(s.equalsIgnoreCase("<Hellow world>hi!")){
                            System.out.println("строки ровны");
                        }else{
                            System.out.println("не ровны");
                        }
                             System.out.println(s.toUpperCase());
                                System.out.println(s.toLowerCase());

                                String format=String.format("My  name is %s.\nI have %d years old.\nMy height %.1f cm.", "Yru", 22, 187.5f);
                                        System.out.println(format);



      /* File F = new File("1.txt");
        if(!F.exists()){
            F.createNewFile();
        }
            F.setWritable(true);//true-не только для чтения

            if(F.canWrite()){
                System.out.println("Доступен для записи.");
            }else{
                System.out.println("Не доступен для записи.");
            }
                F.setLastModified(1);
                System.out.println(F.lastModified());

                 File dir = new File("test\\res\\");
                    if(!dir.exists()){
                        dir.mkdirs();
                    }


                    File []files=dir.listFiles();
                        for(int i=0;i<files.length; i++){
                            files[i].setWritable(true);
                        }
                                */

           /* if(F.canWrite()){
                System.out.println("Доступен для записи.");
            }else{
                System.out.println("Не доступен для записи.");
            }
                if(F.isHidden()){
                    System.out.println("скрыт.");
                }else{
                    System.out.println("не скрыт.");
                }
                   // F.delete(); удаляет файл
                    System.out.println(F.getAbsolutePath());
                    System.out.println(F.getFreeSpace());

                    if(F.isFile()){
                        System.out.println("это файл");
                    }else{
                        System.out.println("дерректория");
                    }
                        System.out.println(F.lastModified());
                        System.out.print("длина файла: ");
                        System.out.println(F.length());

                        File f2=new File("lol.txt");
                        F.renameTo(f2);
                        System.out.println(f2.getAbsolutePath());

                            if(!F.renameTo(f2)){
                                System.out.println("переменовать не удалось!!");
                            }*/


    }


}
