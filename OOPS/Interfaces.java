public class Interfaces {
    public static void main(String[] args) {

//        Queen q1 = new Queen();
//        q1.moves();

        King k1 = new King();
        k1.moves();

        Play chess = new Play();
        chess.stay();
        chess.moves();

    }
}

//
interface ChessPlayer{
    // function blue print , byDefault public and abstract
    void moves();

}


class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen up down left right and diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook up down left right ");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("King up down left right and diagonal by one step");
    }
}
// practising multiple inheritance

interface ChessPlayer1{
    void stay();
}


class Play implements ChessPlayer,ChessPlayer1{

    //Override is coming as we will come to know at the run time.
    @Override
    public void stay() {
        System.out.println("Stay right here!");
    }

    @Override
    public void moves() {
        System.out.println("No i wont stay there , do whatever you can to stop me!! GOD DAMMIT!");
    }
}


