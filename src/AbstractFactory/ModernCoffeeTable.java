package AbstractFactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public boolean longLegs() {
        return false;
    }

    @Override
    public void deliver() {
        System.out.println("ModernCoffeeTable was delivered");
    }

    @Override
    public String toString() {
        String str = longLegs()? "has long legs": "does not have long legs";
        return "ModernCoffeeTable{" + str + "}";
    }
}
