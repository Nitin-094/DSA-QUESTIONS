public class Abstraction {

    public static void main(String[] args) {

//    Sedan m_sport = new Sedan();
//        System.out.println(m_sport.model);

//        m_sport.model= "M5 Competition";
//        System.out.println(m_sport.model);
//        m_sport.company();

        superCars c1 = new superCars();

    }
}

abstract class Cars{

    String model;
    Cars(){
        model = "BMW M340i";
        System.out.println("Cars constructor being called.");
    }
    abstract void company();
}

class Sedan extends Cars{

    Sedan(){
        System.out.println("Sedan constructor being called.");
    }
    void company(){
        System.out.println("BMW");
    }

}

class superCars extends Sedan{
    superCars(){
        System.out.println("superCars constructor being called.");
    }
}
