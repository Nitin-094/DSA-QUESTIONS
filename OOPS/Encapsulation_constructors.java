public class Encapsulation_constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1("nitin");
        System.out.println(s1.Name);
    }
}
class Student1{
    String Name;
    int roll;
    Student1(String name){ // constructor
        this.Name = name;
        System.out.println("YO YO THIS IS THE NEW STUDENT HERE!");
//        System.out.println(name);
    }
}
