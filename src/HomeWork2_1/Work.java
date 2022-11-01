package HomeWork2_1;

import java.util.*;

public class Work {
    public static void main(String[] args) {

        Map<String, List<Integer>> myMap = new HashMap<>();
        HashMap<String, Integer> listHMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        Random random = new Random();

        HashMap<String, Integer> newMAp = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            list.get(i).add(random.nextInt(1000));
            list.get(i).add(random.nextInt(1000));
            list.get(i).add(random.nextInt(1000));
            myMap.put("str" + (i), list.get(i));
            listHMap.put("str" + (i), list.get(i).get(0) + list.get(i).get(1) + list.get(i).get(2));

        }
        for (Map.Entry<String, List<Integer>> entry : myMap.entrySet()) {
            String keys = entry.getKey();
            List<Integer> values = entry.getValue();
//            System.out.println(values);
            int summ = 0;
            for (int i = 0; i < values.size(); i++) {
                summ = values.get(0) + values.get(1) + values.get(2);
            }
            newMAp.put(keys, summ);
        }
        System.out.println(newMAp); //вытаскиваем из мапы сами


        System.out.println("List" + list);
        System.out.println("Mymap" + myMap);
        System.out.println("ListhMap" + listHMap);  // перебор в цикле

    }
}
