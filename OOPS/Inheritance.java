public class Inheritance {

    public static void main(String[] args) {

//        Animal pumma = new Animal();
//        pumma.breathes();
//        pumma.eats();
//
//        Fish nemo = new Fish();
//        nemo.fins();
//        nemo.eats();
//        nemo.breathes();

        CatFish catty = new CatFish();
    }
}

//base class
class Animal{
    Animal(){
        System.out.println("Constructor of Animal class being implicitly called.");
    }
    void eats(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}
//Derived class / single level inheritance
class Fish extends Animal{

    Fish(){
        System.out.println("Constructor of Fish class being implicitly called.");
    }

    void fins(){
        System.out.println("Fish is having fins");
    }
        }
        //MultiLevel Inheritance
        class CatFish extends Fish{
            CatFish(){
                System.out.println("MultiLevel inheritance being initiated");
            }
        }