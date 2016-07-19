package dog_doors;

public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark){
        System.out.println("  BarkRecognizer: Heard a '" + bark.getSound() + "'");

        for (Bark b : door.getAllowedBarks()) {
            if (b.equals(bark))
                door.open();
        }

    }
}
