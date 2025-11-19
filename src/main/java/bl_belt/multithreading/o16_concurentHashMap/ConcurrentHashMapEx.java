package bl_belt.multithreading.o16_concurentHashMap;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Zaur");
        map.put(2,"Oleg");
        map.put(3,"Sergey");
        map.put(4,"Ivan");
        map.put(5,"Igor");
        System.out.println(map);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
        }
    }
}
