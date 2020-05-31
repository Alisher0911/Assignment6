package Builder;

public class House {
    private String type;
    private int walls;
    private int doors;
    private int windows;
    private boolean roof;
    private boolean garage;

    public House(String type, int walls, int doors, int windows, boolean roof, boolean garage) {
        this.type = type;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }

    public String getType() {
        return type;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public boolean hasRoof() {
        return roof;
    }

    public boolean hasGarage() {
        return garage;
    }
}
