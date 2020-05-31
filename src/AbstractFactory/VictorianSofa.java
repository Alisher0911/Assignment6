package AbstractFactory;

public class VictorianSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean hasArmrests() {
        return true;
    }

    @Override
    public boolean lieOn() {
        return true;
    }

    @Override
    public void deliver() {
        System.out.println("VictorianSofa was delivered");
    }

    @Override
    public String toString() {
        String str1 = hasLegs()? "has legs" : "does not have legs";
        String str2 = hasArmrests()? "has armrests" : "does not have armrests";
        String str3 = lieOn()? "can lie on" : "cannot lie on";
        return "VictorianSofa{" + str1 + ", " + str2 + ", " + str3 + "}";
    }
}
