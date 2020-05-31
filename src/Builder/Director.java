package Builder;

public class Director {
    public void constructCottage(Builder builder) {
        builder.setType("Cottage");
        builder.setWalls(4);
        builder.setDoors(10);
        builder.setWindows(20);
        builder.hasRoof(true);
        builder.hasGarage(true);
    }

    public void constructSimpleHouse(Builder builder) {
        builder.setType("Simple");
        builder.setWalls(4);
        builder.setDoors(4);
        builder.setWindows(10);
        builder.hasRoof(false);
        builder.hasGarage(false);
    }

    public void constructMansion(Builder builder) {
        builder.setType("Mansion");
        builder.setWalls(4);
        builder.setDoors(20);
        builder.setWindows(40);
        builder.hasRoof(true);
        builder.hasGarage(true);
    }
}
