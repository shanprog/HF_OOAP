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
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
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

    public List<Guitar> search(Guitar searchGuitar) {

        List<Guitar> matchingGuitars = new ArrayList<Guitar>();

        for (Guitar guitar : guitars) {

            if (searchGuitar.getBuilder() != guitar.getBuilder())
                continue;

            String model = searchGuitar.getModel().toLowerCase();
            if ((!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
                continue;

            if (searchGuitar.getType() != guitar.getType())
                continue;

            if (searchGuitar.getTopWood() != guitar.getTopWood())
                continue;

            if (searchGuitar.getBackWood() != guitar.getBackWood())
                continue;

            matchingGuitars.add(guitar);

        }

        return matchingGuitars;
    }
}
