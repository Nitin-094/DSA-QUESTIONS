public class classes_objects {
    //compiler searches for the public class and then it searches for the public static main function.

    public static void main(String args[]){
        //Pen() is the constructor

        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(5);
//        p1.color = "maroon";

//        System.out.println(p1.color);
//        System.out.println(p1.tip);
//
//        BankAccount bank = new BankAccount();
//
//        bank.username = "nitin";
//        bank.setPassword("abdefghijaklmnopqrstu");
//
//        System.out.println(bank.password);

        MyHouse villa = new MyHouse();

        villa.setArea(900);
//        villa.bedrooms = 5;
        villa.setBedrooms(6);

        System.out.println(villa.getArea());


    }
}


class MyHouse{
    private int area;
    private int bedrooms;


//    void setArea(int newArea){
//        area = newArea;
//    }
void setArea(int area){
    this.area = area;
}
    int getArea(){
        return this.area;
    }
    void setBedrooms(int newBedrooms){
        bedrooms=newBedrooms;
    }

    int getbedrooms(){
        return this.bedrooms;
    }

}



class BankAccount{
     public String username;
//     private
     String password;
     public void setPassword(String newPassword){
         password = newPassword;
     }
}

class Pen{
    // properties and functions
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int physics, int math , int chem){
        percentage = (physics+math+chem)/3;
    }

}