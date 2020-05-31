package AbstractFactory;

public class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean hasArmrests() {
        return false;
    }

    @Override
    public boolean lieOn() {
        return false;
    }

    @Override
    public void deliver() {
        System.out.println("ModernSofa was delivered");
    }

    @Override
    public String toString() {
        String str1 = hasLegs()? "has legs" : "does not have legs";
        String str2 = hasArmrests()? "has armrests" : "does not have armrests";
        String str3 = lieOn()? "can lie on" : "cannot lie on";
        return "ModernSofa{" + str1 + ", " + str2 + ", " + str3 + "}";
    }
}
