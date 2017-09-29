public class mytred2 extends Thread{
    @Override

    public void run(){
        for(int i=5000001;i<10000000;i++){
            double m=Math.sin(i)*Math.tan(i*2)-Math.sqrt(i/2);
        }
        }
    }

