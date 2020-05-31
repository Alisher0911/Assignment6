package Factory;

public class RoadLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
