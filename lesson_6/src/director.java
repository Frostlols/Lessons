public class director implements IWorker {


    @Override
    public void goToWork() {
        System.out.println("Босс приехал на работу 10 мин. ");
    }

    @Override
    public void pay() {
        System.out.println("Босс получил 20р. ");

    }
}
