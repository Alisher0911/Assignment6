package Factory;

public class Main {
    public static void main(String[] args) {
        Logistics logistic1 = new SeaLogistics();
        logistic1.deliver();

        Logistics logistic2 = new RoadLogistics();
        logistic2.deliver();
    }
}
