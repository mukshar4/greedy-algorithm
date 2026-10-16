
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static class TestCase {
        int number;
        ArrayList<Delivery> deliveries = new ArrayList<>();

        TestCase(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("TASK A");
        runTaskA("taskA.txt");

        System.out.println("\nTASK B");
        runTaskB("taskB.txt");

        System.out.println("\nTASK C");
        runTaskC("taskC.txt");
    }

    public static ArrayList<TestCase> readTestCases(String fileName)
            throws IOException {

        ArrayList<TestCase> testCases = new ArrayList<>();
        TestCase currentTest = null;

        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }

                if (line.startsWith("TEST")) {
                    int testNumber = Integer.parseInt(
                            line.split("\\s+")[1]);

                    currentTest = new TestCase(testNumber);
                    testCases.add(currentTest);

                } else {
                    String[] parts = line.split("\\s+");

                    currentTest.deliveries.add(
                            new Delivery(
                                    parts[0],
                                    Integer.parseInt(parts[1]),
                                    Integer.parseInt(parts[2])));
                }
            }
        }

        return testCases;
    }

    public static void runTaskA(String fileName) throws IOException {

        ArrayList<TestCase> testCases = readTestCases(fileName);

        for (TestCase testCase : testCases) {
            ArrayList<Delivery> selected =
                    TaskA.findMaximumDeliveries(
                            new ArrayList<>(testCase.deliveries));

            System.out.println("\nTest " + testCase.number);
            System.out.println("selected deliveries: " + selected.size());
        }
    }

    public static void runTaskB(String fileName) throws IOException {

        ArrayList<TestCase> testCases = readTestCases(fileName);

        for (TestCase testCase : testCases) {
            ArrayList<ArrayList<Delivery>> schedules =
                    TaskB.assignDrivers(
                            new ArrayList<>(testCase.deliveries));

            System.out.println("\nTest " + testCase.number);
            System.out.println("drivers needed: " + schedules.size());
        }
    }

    public static void runTaskC(String fileName) throws IOException {

        ArrayList<TestCase> testCases = readTestCases(fileName);

        for (TestCase testCase : testCases) {
            int rejectedCount =
                    TaskC.findNumRejected(
                            new ArrayList<>(testCase.deliveries));

            System.out.println("\nTest " + testCase.number);
            System.out.println("rejected deliveries: " + rejectedCount);
        }
    }
}

