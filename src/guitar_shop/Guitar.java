package guitar_shop;

public class Guitar extends Instrument {

    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        super(serialNumber, price, guitarSpec);
    }

}
