public class worker implements IWorker {
    @Override
    public void goToWork() {
        System.out.println("Работник приехал на работу 15 мин. ");

    }

    @Override
    public void pay() {
        System.out.println("Работник получил 15р. ");
    }
}
