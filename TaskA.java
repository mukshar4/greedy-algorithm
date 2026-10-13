import java.util.ArrayList;

public class TaskA {
    public static ArrayList<Delivery> findMaximumDeliveries(ArrayList<Delivery> deliveries){
        
        ArrayList<Delivery> selected = new ArrayList<>();

        //sort by smallest finish time
        deliveries.sort((d1, d2) -> Integer.compare(d1.getFinishTime(), d2.getFinishTime()));

        if (deliveries.isEmpty()) {
            return selected;
        }

        //select the first delivery
        selected.add(deliveries.get(0));

        //iterate through the rest of the deliveries
        for (int i = 1; i < deliveries.size(); i++) {

            Delivery current = deliveries.get(i);
            Delivery privousSelected = selected.get(selected.size()-1);

            if(privousSelected.getFinishTime() <= current.getStartTime()){
                selected.add(current);
            }
        }
        return selected;
    }
}
