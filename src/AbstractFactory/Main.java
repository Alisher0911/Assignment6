package AbstractFactory;

import java.util.Scanner;

public class Main {
    public static Application config(String str) {
        Application app;
        if(str.equals("Modern")) {
            app = new Application(new ModernFurnitureFactory());
        } else {
            app = new Application(new VictorianFurnitureFactory());
        }
        return app;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String variant = in.next();
        Application app = config(variant);
        System.out.println(app);
    }
}
