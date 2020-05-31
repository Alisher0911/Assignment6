package AbstractFactory;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public boolean longLegs() {
        return true;
    }

    @Override
    public void deliver() {
        System.out.println("VictorianCoffeeTable was delivered");
    }

    @Override
    public String toString() {
        String str = longLegs()? "has long legs": "does not have long legs";
        return "VictorianCoffeeTable{" + str + "}";
    }
}
