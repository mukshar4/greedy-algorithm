public class Delivery {
    private String id;
    private int startTime;
    private int finishTime;

    // Constructor
    public Delivery(String id, int startTime, int finishTime) {
        this.id = id;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    // Getter for the delivery ID
    public String getId() {
        return id;
    }

    // Getter for the start time
    public int getStartTime() {
        return startTime;
    }

    // Getter for the finish time
    public int getFinishTime() {
        return finishTime;
    }

    // Controls how the delivery is displayed
    @Override
    public String toString() {
        return id + ": " + startTime + " - " + finishTime;
    }
}
