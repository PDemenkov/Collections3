import java.util.HashMap;
import java.util.Map;

public class Phone {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Березина Анна", "+89212663225");
        map.put("Филимонова Василиса", "89214564128");
        map.put("Николаев Сергей", "+79030242542");
        map.put("Казанцев Георгий", "+89210345141");
        map.put("Кудрявцев Дмитрий", "+8-921-024-21-41");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
