package guitar_shop;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like this guitars:");

            for (Guitar guitar : matchingGuitars) {

                GuitarSpec guitarSpec = guitar.getGuitarSpec();
                System.out.println("  We have a " + guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                        guitarSpec.getNumStrings() + "-string " + guitarSpec.getType() + " guitar:\n" +
                        guitarSpec.getBackWood() + " back and sides,\n" +
                        guitarSpec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
    }
}
