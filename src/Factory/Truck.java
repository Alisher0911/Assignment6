package Factory;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck delivers cargo by land.");
    }
}
