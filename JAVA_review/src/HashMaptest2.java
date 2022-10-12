import java.util.HashMap;

public class HashMaptest2 {
    public static void main(String[] args) {

        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("booby", "baga!");
        fun.put("NBBNBNB", "password");
        fun.remove("booby");

        //                    .containsKey()
        System.out.println(fun.containsValue("password"));
        //                    .keySet() return all the Key

        // HashMap order doesn't matter.

    }
}
