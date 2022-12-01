import java.security.cert.PolicyNode;

// java class review
public class Pokemon {
    String name;
    int level;

    // constructor
    Pokemon() {
        level = 1;
    }

    //Pokemon(String pName,int pLevel) {
        //name = pName;
        //level = pLevel;
    //}

    // this keyword
    Pokemon(String name,int level) {
        this.name = name;
        this.level = level;
    }
    void attack() {
        System.out.println(name + "attack");
    }
}
