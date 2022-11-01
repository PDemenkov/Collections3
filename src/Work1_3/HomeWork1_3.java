package Work1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HomeWork1_3 {


    public static void main (String[] args) {
        putMethod("str2",1);
        putMethod("str3",5);
    }

    public static void putMethod (String k,Integer v) {

        Map<String, Integer> map = new HashMap<>();
        map.put("str1", 2);
//        map.put("str2", 1); для исключения
        if (map.containsKey(k) && map.containsValue(v)) {
            throw new RuntimeException("Такой ключ уже есть и значения совпадают");
        }
        map.put(k,v);
    }

}

