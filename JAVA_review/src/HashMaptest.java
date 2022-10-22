// HashMap
// psvm/sout shortcut!!
import java.util.HashMap;

public class HashMaptest {
    public static void main(String[] args) {
        int a = 10;
        // String b = "hello";
        // int[] c = {1,2,3};
        int b = 3;
        int c = 88;

        //      KEY     Value
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        int loop = 0;
        while (loop++ < 10) {
            System.out.print(loop);
        }


        //System.out.println(happy);
        //System.out.println(happy.get("c"));
    }
}