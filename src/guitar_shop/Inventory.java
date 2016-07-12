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

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
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

            if (searchSpec.getBuilder() != guitarSpec.getBuilder())
                continue;

            String model = searchSpec.getModel().toLowerCase();
            if ((!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;

            if (searchSpec.getType() != guitarSpec.getType())
                continue;

            if (searchSpec.getTopWood() != guitarSpec.getTopWood())
                continue;

            if (searchSpec.getBackWood() != guitarSpec.getBackWood())
                continue;

            matchingGuitars.add(guitar);

        }

        return matchingGuitars;
    }
}
