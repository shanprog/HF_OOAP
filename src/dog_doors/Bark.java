package dog_doors;

public class Bark {

    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }


    public boolean equals(Bark bark) {
        return sound.equals(bark.getSound());
    }
}
