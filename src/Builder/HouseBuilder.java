package Builder;

public class HouseBuilder implements Builder {
    private String type;
    private int walls;
    private int doors;
    private  int windows;
    private boolean roof;
    private boolean garage;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public boolean hasRoof(boolean roof) {
        this.roof = roof;
        return this.roof;
    }

    @Override
    public boolean hasGarage(boolean garage) {
        this.garage = garage;
        return this.garage;
    }

    public House getResult() {
        return new House(type, walls, doors, windows, roof, garage);
    }
}
