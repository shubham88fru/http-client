import java.util.Arrays;
import java.util.List;

public class Application {
    private static final String WORKER_1_ADDRESS = "http://localhost:8081/task";
    private static final String WORKER_2_ADDRESS = "http://localhost:8082/task";

    public static void main(String[] args) {
        Aggregator aggregator = new Aggregator();
        String task1 = "10,200";
        String task2 = "123456789,100000000000000,7000000002342343";
        List<String> results = aggregator.sendTasksToWorker(Arrays
                .asList(WORKER_1_ADDRESS, WORKER_2_ADDRESS), Arrays.asList(task1, task2));

        for (String result: results) System.out.println(result);
    }
}
