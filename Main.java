import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Delivery> deliveries = new ArrayList<>();

        
        deliveries.add(new Delivery("D1", 5, 7));
        deliveries.add(new Delivery("D2", 1, 3));
        deliveries.add(new Delivery("D3", 3, 5));
        deliveries.add(new Delivery("D4", 2, 4));

        ArrayList<Delivery> selected =
                TaskA.findMaximumDeliveries(deliveries);

        System.out.println("Selected deliveries:");

        for (Delivery delivery : selected) {
            System.out.println(
                delivery.getId() + ": " +
                delivery.getStartTime() + " - " +
                delivery.getFinishTime()
            );
        }

        System.out.println("Total selected: " + selected.size());
    }
}