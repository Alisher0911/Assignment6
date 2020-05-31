package Builder;

public class Manual {
    private String type;
    private int walls;
    private int doors;
    private int windows;
    private boolean roof;
    private boolean garage;

    public Manual(String type, int walls, int doors, int windows, boolean roof, boolean garage) {
        this.type = type;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }

    public String print() {
        String info = "";
        info += "Type: " + type + "\n";
        info += "Count of walls: " + walls + "\n";
        info += "Count of doors: " + doors + "\n";
        info += "Count if windows: " + windows + "\n";
        info += "Has roof: " + roof + "\n";
        info += "Has garage: " + garage + "\n";
        return info;
    }
}
