package Hashtable;

public class FruitIntoBaskets904 {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j;
        for (j = 0; j < fruits.length; j++) {
            // if fruits[j] has value, return it's value and + 1, or return 0 and + 1
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            if (map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                map.remove(fruits[i++], 0);
            }
        }
        return j - i;
    }
}
