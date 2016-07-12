package guitar_shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }

        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {

        List<Guitar> matchingGuitars = new ArrayList<Guitar>();

        for (Guitar guitar : guitars) {

            GuitarSpec guitarSpec = guitar.getGuitarSpec();

            if (guitarSpec.matches(searchSpec))
                matchingGuitars.add(guitar);

        }

        return matchingGuitars;
    }
}
