package AbstractFactory;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean sitOn() {
        return true;
    }

    @Override
    public void deliver() {
        System.out.println("VictorianChair was delivered");
    }

    @Override
    public String toString() {
        String str1 = hasLegs()? "has legs" : "does not have legs";
        String str2 = sitOn()? "can sit on" : "cannot sit on";
        return "VictorianChair{" + str1 + ", " + str2 + "}";
    }
}
