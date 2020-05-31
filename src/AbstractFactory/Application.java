package AbstractFactory;

public class Application {
    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        coffeeTable = factory.createCoffeeTable();
        sofa = factory.createSofa();
    }

    public void delivered() {
        chair.deliver();
        coffeeTable.deliver();
        sofa.deliver();
    }

    @Override
    public String toString() {
        return chair + "\n" +
                coffeeTable + "\n" +
                sofa;
    }
}
