public class OOPS_practise {
    public static class pen{

        int tip;

        void setTip(int tip1){
            this.tip = tip1;
        }
        int getTip(){
            return this.tip;
        }

    }
    public static void main(String[] args) {

        first_first f1 = new second_second();

//        System.out.println(f1.first_1+" "+f1.first_2+" ");

        pen p1 = new pen();

        p1.setTip(5);

        System.out.println(p1.getTip());

    }
}


class first_first{
    int first_1=1;
    int first_2=2;
}

class second_second extends first_first{
    int second_1=21;
    int second_2=22;
}

