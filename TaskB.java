import java.util.ArrayList;
import java.util.PriorityQueue;

public class TaskB {

    //driver info
    static class DriverInfo {
        int driverIndex;
        int finishTime;

        DriverInfo(int driverIndex, int finishTime) {
            this.driverIndex = driverIndex;
            this.finishTime = finishTime;
        }
    }

    public static ArrayList<ArrayList<Delivery>> assignDrivers(
            ArrayList<Delivery> deliveries) {

        ArrayList<ArrayList<Delivery>> driverSchedules =
                new ArrayList<>();

        deliveries.sort((d1, d2) -> Integer.compare(d1.getStartTime(), d2.getStartTime()));

        PriorityQueue<DriverInfo> driverQueue = new PriorityQueue<>(
                (d1, d2) -> Integer.compare(d1.finishTime, d2.finishTime));

        for (Delivery current : deliveries) {
            if (driverQueue.isEmpty()) {

                //create a schedule 
                ArrayList <Delivery> newSchedule = new ArrayList<>();
                newSchedule.add(current);
                driverSchedules.add(newSchedule);

                int driverIndex = driverSchedules.size() - 1;

                DriverInfo newDriver = new DriverInfo(driverIndex,current.getFinishTime());
                
                driverQueue.offer(newDriver);

            } 
            



       
        

        return driverSchedules;
}
}
