public class superKeyword {
    public static void main(String[] args) {

        boy b1 = new boy();
        System.out.println(b1.color);

    }
}
class humans{

    String color;
    humans(){
        System.out.println("Humans class's constructor is invoked.");
    }
}
class boy extends humans{
    boy(){
//        super();
        super.color = "Brown Munde";
        System.out.println("boy constructor is invoked.");
    }
}

