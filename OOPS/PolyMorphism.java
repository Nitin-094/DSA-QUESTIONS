public class PolyMorphism {
    public static void main(String[] args) {

        Deer barasingha = new Deer();
        barasingha.eats();

    }
}
// Method Overloading - compile time
// Method Overriding - run time
class Animals{
    void eats(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animals{

    void eats(){
        System.out.println("Eats Grass");
    }
}

