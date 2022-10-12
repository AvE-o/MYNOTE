// >> <<
public class ShiftOperator {
    public static void main(String[] args) {
        int a = 8; // 1 0 0 0
        int b = a << 2; // 1 0 0 0 0 0 -> 32;
        int c = a >> 2; // 10          -> 2;
        System.out.println(b);
        System.out.println(c);

    }
}
