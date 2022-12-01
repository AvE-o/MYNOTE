public class Pokemontest {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon();
        p1.name = "BAGA";
        //p1.level = 10;

        System.out.println(p1.name + " " + p1.level);

        Pokemon p2 = new Pokemon();
        p2.name = "YoYo";
        p2.level = 20;

        p2.attack();

        Pokemon p3 = new Pokemon("LOLO", 15);
        p3.attack();


    }
}
