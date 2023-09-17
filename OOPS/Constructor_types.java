public class Constructor_types {

    public static void main(String[] args) {

        Sons sonn = new Sons();
        Sons sonn1 = new Sons(55);
//        sonn.setSon1(1);
        sonn .son2 = 2;
        System.out.println(sonn.getSon1());

        Sons sonn2 = new Sons(sonn);
        System.out.println(sonn2.son2);

    }


}


class Sons{

    private int son1;
    int son2;

    void setSon1(int son1){
        this.son2 = son1;
    }
    int getSon1(){
        return this.son2;
    }
//Constructor overloading

// Non-parameterised Constructor
    Sons(){
        System.out.println("constructor being called");
    }
// Parameterised constructor
    Sons(int a){
        System.out.println(a);
    }
 //Shallow copy constructor
//    Sons(Sons a){
//        this.son2 = a.son2;
//    }

    // deep Copy Constructor

    Sons(Sons a){

    }



}



