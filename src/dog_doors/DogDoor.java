package dog_doors;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private List<Bark> allowedBarks;

    public DogDoor() {
        allowedBarks = new LinkedList<Bark>();
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void addAllowedBark(Bark bark){
        allowedBarks.add(bark);
    }
}
