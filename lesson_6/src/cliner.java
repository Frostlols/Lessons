public class cliner implements IWorker {

    @Override
    public void goToWork() {
        System.out.println("Уборщик приехал на работу 20 мин. ");

    }

    @Override
    public void pay() {
        System.out.println("Уборщик получил 10р. ");
    }
}
