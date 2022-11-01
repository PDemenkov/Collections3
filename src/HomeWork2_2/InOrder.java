package HomeWork2_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InOrder {
    public static void main(String[] args) {
        Map<String, String> dataSet = new LinkedHashMap<>();
        dataSet.put("1", "Jack");
        dataSet.put("2", "Tom");
        dataSet.put("3", "Jimmy");
        dataSet.put("4", "Morgan");
        dataSet.put("5", "Tim");
        dataSet.put("6", "Brad");
        dataSet.put("7", "Paul");
        dataSet.put("8", "Dread");
        dataSet.put("9", "Stephen");
        dataSet.put("10", "Andrew");
        for (Map.Entry<String, String> entry : dataSet.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
