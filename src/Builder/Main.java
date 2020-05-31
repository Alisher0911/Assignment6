package Builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        HouseManualBuilder manualBuilder = new HouseManualBuilder();

        System.out.println("Choose a house: Cottage, Simple, Mansion\n");

        Scanner in = new Scanner(System.in);
        String variant = in.next();

        if(variant.equals("Cottage")) {
            director.constructCottage(builder);
            House house = builder.getResult();
            System.out.println("House built:\n" + house.getType());
            director.constructCottage(manualBuilder);
            Manual houseManual = manualBuilder.getResult();
            System.out.println("\nHouse manual built:\n" + houseManual.print());
        } else if (variant.equals("Simple")) {
            director.constructSimpleHouse(builder);
            House house = builder.getResult();
            System.out.println("House built:\n" + house.getType());
            director.constructSimpleHouse(manualBuilder);
            Manual houseManual = manualBuilder.getResult();
            System.out.println("\nHouse manual built:\n" + houseManual.print());
        } else if (variant.equals("Mansion")) {
            director.constructMansion(builder);
            House house = builder.getResult();
            System.out.println("House built:\n" + house.getType());
            director.constructMansion(manualBuilder);
            Manual houseManual = manualBuilder.getResult();
            System.out.println("\nHouse manual built:\n" + houseManual.print());
        }
    }
}
