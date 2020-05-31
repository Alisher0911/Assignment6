package Builder;

public interface Builder {
    void setType(String type);
    void setWalls(int walls);
    void setDoors(int doors);
    void setWindows(int windows);
    boolean hasRoof(boolean roof);
    boolean hasGarage(boolean garage);
}
