package AbstractFactory;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }

    @Override
    public void deliver() {
        System.out.println("ModernChair was delivered");
    }

    @Override
    public String toString() {
        String str1 = hasLegs()? "has legs" : "does not have legs";
        String str2 = sitOn()? "can sit on" : "cannot sit on";
        return "ModernChair{" + str1 + ", " + str2 + "}";
    }
}
