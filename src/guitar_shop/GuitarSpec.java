package guitar_shop;

public class GuitarSpec {

    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec guitarSpec) {

        if (builder != guitarSpec.getBuilder())
            return false;

        if ((!model.equals("")) && (!model.toLowerCase().equals(guitarSpec.getModel().toLowerCase())))
            return false;

        if (type != guitarSpec.getType())
            return false;

        if (topWood != guitarSpec.getTopWood())
            return false;

        if (backWood != guitarSpec.getBackWood())
            return false;

        return true;
    }
}
