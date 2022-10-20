import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, List<Integer>> map1 = new HashMap<>(5);
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            List<Integer> list = new ArrayList<>(3);
            StringBuilder string = new StringBuilder("string");
            for (int j = 0; j < 3; j++) {
                list.add(rand.nextInt(1001));
            }
            map1.put((string.append(i).toString()), list);
        }
        System.out.println(map1);

        Map<String, Integer> map2 = new HashMap<>(5);
        for (Map.Entry<String, List<Integer>> stringListEntry : map1.entrySet()) {
            int sum = 0;
            for (Integer integer : stringListEntry.getValue()) {
                sum += integer;
            }
            map2.put(stringListEntry.getKey(), sum);
        }
        System.out.println(map2);

        /////////////////////////////////
        System.out.println();

        Map<Integer, String> map3 = new LinkedHashMap<>(10);
        for (int i = 0; i < 10; i++) {
            StringBuilder string = new StringBuilder("string");
            map3.put(rand.nextInt(100), (string.append(i).toString()));
        }
        System.out.println(map3);

    }
}