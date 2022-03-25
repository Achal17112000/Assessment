package Tasks;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Assignment5 {
    public static void main(String[] args) {
        Map<String, String> m = new TreeMap<String, String>();
        m.put("Clear", "Achal");
        m.put("Ankit", "Pooja");
        m.put("Erfg", "Darshan");
        m.put("Bablu", "Snehal");

        System.out.println("===================By Using Key Set ==================");
        Set<String> keySet = m.keySet();
        for(String key : keySet){
            System.out.println(key+"   "+m.get(key));
        }

    }
}
