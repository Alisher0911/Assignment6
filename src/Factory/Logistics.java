package Factory;

abstract class Logistics {

    abstract Transport createTransport();

    public void deliver() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
